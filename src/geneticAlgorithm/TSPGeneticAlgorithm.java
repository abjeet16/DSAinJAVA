package geneticAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TSPGeneticAlgorithm {

    // Define the number of cities and distances between them
    static final int NUM_CITIES = 5;
    static int[][] distances = new int[NUM_CITIES][NUM_CITIES];
    static Random random = new Random();

    // Fitness function: Calculate the total distance of the tour
    public static int fitness(List<Integer> tour) {
        int totalDistance = 0;
        for (int i = 0; i < NUM_CITIES - 1; i++) {
            totalDistance += distances[tour.get(i)][tour.get(i + 1)];
        }
        totalDistance += distances[tour.get(NUM_CITIES - 1)][tour.get(0)]; // Return to start
        return totalDistance;
    }

    // Generate an initial random population of tours
    public static List<List<Integer>> generatePopulation(int popSize) {
        List<List<Integer>> population = new ArrayList<>();
        for (int i = 0; i < popSize; i++) {
            List<Integer> tour = new ArrayList<>();
            for (int j = 0; j < NUM_CITIES; j++) {
                tour.add(j);
            }
            Collections.shuffle(tour);
            population.add(tour);
        }
        return population;
    }

    // Selection: Choose two parents based on their fitness
    public static List<List<Integer>> selection(List<List<Integer>> population, List<Integer> fitnesses) {
        List<List<Integer>> parents = new ArrayList<>();
        parents.add(rouletteWheelSelection(population, fitnesses));
        parents.add(rouletteWheelSelection(population, fitnesses));
        return parents;
    }

    // Roulette Wheel Selection Helper
    public static List<Integer> rouletteWheelSelection(List<List<Integer>> population, List<Integer> fitnesses) {
        int totalFitness = fitnesses.stream().mapToInt(Integer::intValue).sum();
        int randValue = random.nextInt(totalFitness);
        int cumulativeProbability = 0;

        for (int i = 0; i < population.size(); i++) {
            cumulativeProbability += fitnesses.get(i);
            if (randValue <= cumulativeProbability) {
                return population.get(i);
            }
        }
        return population.get(population.size() - 1);  // Return last if not selected earlier
    }

    // Crossover (Order Crossover)
    public static List<Integer> crossover(List<Integer> parent1, List<Integer> parent2) {
        int size = parent1.size();
        int start = random.nextInt(size);
        int end = random.nextInt(size);

        List<Integer> child = new ArrayList<>(Collections.nCopies(size, -1));

        for (int i = Math.min(start, end); i <= Math.max(start, end); i++) {
            child.set(i, parent1.get(i));
        }

        int currentIndex = 0;
        for (int city : parent2) {
            if (!child.contains(city)) {
                while (child.get(currentIndex) != -1) {
                    currentIndex++;
                }
                child.set(currentIndex, city);
            }
        }

        return child;
    }

    // Mutation: Swap two random cities in the tour
    public static List<Integer> mutate(List<Integer> tour) {
        List<Integer> mutatedTour = new ArrayList<>(tour);
        int index1 = random.nextInt(tour.size());
        int index2 = random.nextInt(tour.size());

        // Swap
        int temp = mutatedTour.get(index1);
        mutatedTour.set(index1, mutatedTour.get(index2));
        mutatedTour.set(index2, temp);

        return mutatedTour;
    }

    // Main genetic algorithm function
    public static List<Integer> geneticAlgorithm(int popSize, int generations) {
        List<List<Integer>> population = generatePopulation(popSize);

        for (int generation = 0; generation < generations; generation++) {
            List<Integer> fitnesses = new ArrayList<>();
            for (List<Integer> tour : population) {
                fitnesses.add(fitness(tour));
            }

            List<List<Integer>> newPopulation = new ArrayList<>();

            // Reproduce to form the next generation
            while (newPopulation.size() < popSize) {
                List<List<Integer>> parents = selection(population, fitnesses);
                List<Integer> child = crossover(parents.get(0), parents.get(1));
                List<Integer> mutatedChild = mutate(child);
                newPopulation.add(mutatedChild);
            }

            population = newPopulation;
        }

        // Return the best solution found
        return population.stream().min((tour1, tour2) -> fitness(tour1) - fitness(tour2)).orElse(null);
    }

    // Main Function to run the TSP Genetic Algorithm
    public static void main(String[] args) {
        // Initialize random distances between cities
        /*for (int i = 0; i < NUM_CITIES; i++) {
            for (int j = 0; j < NUM_CITIES; j++) {
                distances[i][j] = random.nextInt(90) + 10; // Distance between 10 and 100
            }
        }*/
        distances = new int[][]{
                //    0    1    2    3    4
                {0, 10, 15, 20, 25}, // City 0
                {10, 0, 35, 25, 30}, // City 1
                {15, 35, 0, 30, 20}, // City 2
                {20, 25, 30, 0, 15}, // City 3
                {25, 30, 20, 15, 0}  // City 4
        };
        int populationSize = 100;
        int numGenerations = 500;

        List<Integer> bestTour = geneticAlgorithm(populationSize, numGenerations);
        System.out.println("Best Tour: " + bestTour);
        System.out.println("Best Distance: " + fitness(bestTour));
    }
}

