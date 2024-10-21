package geneticAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MultiSectionTimetableGeneticAlgorithm {

    static final int NUM_CLASSES = 15;  // Number of total classes (5 for each section: BCA, BCOM, BBA)
    static final int NUM_DAYS = 5;  // Number of days in a week
    static final int SLOTS_PER_DAY = 6;  // Number of slots per day
    static final int NUM_TEACHERS = 5;  // Number of teachers
    static final int NUM_SECTIONS = 3;  // BCA, BCOM, BBA
    static Random random = new Random();

    // Chromosome representation: A list of class schedules for all sections
    public static class Chromosome {
        List<int[]> schedule = new ArrayList<>(); // Each entry is [classId, teacherId, sectionId, day, slot]
        int fitness = Integer.MAX_VALUE; // High fitness means worse solution

        public Chromosome(List<int[]> schedule) {
            this.schedule = new ArrayList<>(schedule);
            this.fitness = calculateFitness();
        }

        public int calculateFitness() {
            int clashes = 0;
            int validAssignments = 0;

            // Check for teacher clashes (same teacher in different sections or same section at the same time)
            for (int i = 0; i < schedule.size(); i++) {
                boolean valid = true;
                for (int j = i + 1; j < schedule.size(); j++) {
                    // If the same teacher is assigned to two classes in the same time slot across sections
                    if (schedule.get(i)[1] == schedule.get(j)[1] &&  // Teacher
                            schedule.get(i)[3] == schedule.get(j)[3] &&  // Day
                            schedule.get(i)[4] == schedule.get(j)[4]) {  // Time slot
                        clashes++; // Penalty for teacher conflict
                        valid = false;
                    }
                }
                if (valid) {
                    validAssignments++;  // Reward for a valid assignment (no clash)
                }
            }

            // We want to maximize valid assignments and minimize clashes.
            int fitness = (validAssignments * 10) - (clashes * 5);  // Balance rewards and penalties
            return fitness;
        }
    }

    // Generate initial population
    public static List<Chromosome> generatePopulation(int popSize) {
        List<Chromosome> population = new ArrayList<>();
        for (int i = 0; i < popSize; i++) {
            List<int[]> schedule = new ArrayList<>();
            for (int classId = 0; classId < NUM_CLASSES; classId++) {
                int teacherId = random.nextInt(NUM_TEACHERS);
                int sectionId = classId / 5;  // Divide into sections: 0 for BCA, 1 for BCOM, 2 for BBA
                int day = random.nextInt(NUM_DAYS);
                int slot = random.nextInt(SLOTS_PER_DAY);
                schedule.add(new int[]{classId, teacherId, sectionId, day, slot});
            }
            population.add(new Chromosome(schedule));
        }
        return population;
    }

    // Selection
    public static Chromosome selectParent(List<Chromosome> population) {
        return population.get(random.nextInt(population.size()));
    }

    // Crossover
    public static Chromosome crossover(Chromosome parent1, Chromosome parent2) {
        List<int[]> childSchedule = new ArrayList<>();
        for (int i = 0; i < NUM_CLASSES; i++) {
            if (random.nextBoolean()) {
                childSchedule.add(parent1.schedule.get(i));
            } else {
                childSchedule.add(parent2.schedule.get(i));
            }
        }
        return new Chromosome(childSchedule);
    }

    // Mutation
    public static Chromosome mutate(Chromosome chromosome) {
        List<int[]> mutatedSchedule = new ArrayList<>(chromosome.schedule);
        int classId = random.nextInt(NUM_CLASSES);
        mutatedSchedule.get(classId)[3] = random.nextInt(NUM_DAYS);  // Random day
        mutatedSchedule.get(classId)[4] = random.nextInt(SLOTS_PER_DAY);  // Random slot
        return new Chromosome(mutatedSchedule);
    }

    // Genetic Algorithm
    public static Chromosome runGeneticAlgorithm(int popSize, int generations) {
        List<Chromosome> population = generatePopulation(popSize);

        for (int generation = 0; generation < generations; generation++) {
            List<Chromosome> newPopulation = new ArrayList<>();
            while (newPopulation.size() < popSize) {
                Chromosome parent1 = selectParent(population);
                Chromosome parent2 = selectParent(population);
                Chromosome child = crossover(parent1, parent2);
                if (random.nextDouble() < 0.1) { // Mutation probability
                    child = mutate(child);
                }
                newPopulation.add(child);
            }
            population = newPopulation;
        }

        // Find the best solution
        return population.stream().min((c1, c2) -> c1.fitness - c2.fitness).orElse(null);
    }

    // Main function
    public static void main(String[] args) {
        int populationSize = 100;
        int generations = 1000;

        Chromosome bestTimetable = runGeneticAlgorithm(populationSize, generations);
        System.out.println("Best Timetable with Fitness: " + bestTimetable.fitness);

        // Display the best timetable
        for (int[] entry : bestTimetable.schedule) {
            System.out.println("Class: " + entry[0] + ", Teacher: " + entry[1] + ", Section: " + entry[2]
                    + ", Day: " + entry[3] + ", Slot: " + entry[4]);
        }
    }
}


