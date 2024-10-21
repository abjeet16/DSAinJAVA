package geneticAlgorithm;
import java.util.Random;

public class GeneticAlgorithm {
    static final int POPULATION_SIZE = 100;
    static final int CHROMOSOME_LENGTH = 10;
    static final int MAX_GENERATIONS = 100;
    static final double MUTATION_RATE = 0.01;
    static final double CROSSOVER_RATE = 0.7;

    public static void main(String[] args) {
        Random random = new Random();

        // Step 1: Initialize the population with random chromosomes
        int[][] population = new int[POPULATION_SIZE][CHROMOSOME_LENGTH];
        for (int i = 0; i < POPULATION_SIZE; i++) {
            for (int j = 0; j < CHROMOSOME_LENGTH; j++) {
                population[i][j] = random.nextBoolean() ? 1 : 0;
            }
        }

        // Step 2: Evolve the population
        for (int generation = 0; generation < MAX_GENERATIONS; generation++) {
            // Step 3: Evaluate fitness of each individual
            int[] fitness = new int[POPULATION_SIZE];
            for (int i = 0; i < POPULATION_SIZE; i++) {
                fitness[i] = evaluateFitness(population[i]);
            }

            // Step 4: Select parents and perform crossover
            int[][] newPopulation = new int[POPULATION_SIZE][CHROMOSOME_LENGTH];
            for (int i = 0; i < POPULATION_SIZE; i += 2) {
                int[] parent1 = selectParent(population, fitness);
                int[] parent2 = selectParent(population, fitness);

                int[][] offspring = crossover(parent1, parent2, random);

                // Step 5: Mutate the offspring
                newPopulation[i] = mutate(offspring[0], random);
                newPopulation[i + 1] = mutate(offspring[1], random);
            }

            population = newPopulation; // Replace the old population with the new one

            // Step 6: Print best fitness of the generation
            int bestFitness = 0;
            for (int fit : fitness) {
                if (fit > bestFitness) bestFitness = fit;
            }
            System.out.println("Generation " + generation + " - Best Fitness: " + bestFitness);
        }
    }

    // Evaluate fitness by counting number of '1's in the chromosome
    static int evaluateFitness(int[] chromosome) {
        int fitness = 0;
        for (int gene : chromosome) {
            if (gene == 1) fitness++;
        }
        return fitness;
    }

    // Select parent using tournament selection
    static int[] selectParent(int[][] population, int[] fitness) {
        Random random = new Random();
        int best = random.nextInt(POPULATION_SIZE);
        for (int i = 0; i < 3; i++) {
            int competitor = random.nextInt(POPULATION_SIZE);
            if (fitness[competitor] > fitness[best]) best = competitor;
        }
        return population[best];
    }

    // Perform crossover between two parents
    static int[][] crossover(int[] parent1, int[] parent2, Random random) {
        int[][] offspring = new int[2][CHROMOSOME_LENGTH];
        if (random.nextDouble() < CROSSOVER_RATE) {
            int crossoverPoint = random.nextInt(CHROMOSOME_LENGTH);
            for (int i = 0; i < crossoverPoint; i++) {
                offspring[0][i] = parent1[i];
                offspring[1][i] = parent2[i];
            }
            for (int i = crossoverPoint; i < CHROMOSOME_LENGTH; i++) {
                offspring[0][i] = parent2[i];
                offspring[1][i] = parent1[i];
            }
        } else {
            offspring[0] = parent1.clone();
            offspring[1] = parent2.clone();
        }
        return offspring;
    }

    // Mutate a chromosome by flipping bits with a given probability
    static int[] mutate(int[] chromosome, Random random) {
        for (int i = 0; i < CHROMOSOME_LENGTH; i++) {
            if (random.nextDouble() < MUTATION_RATE) {
                chromosome[i] = 1 - chromosome[i]; // Flip the bit
            }
        }
        return chromosome;
    }
}

