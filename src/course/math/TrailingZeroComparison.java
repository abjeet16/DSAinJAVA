package course.math;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

public class TrailingZeroComparison {
    public static void main(String[] args) {
        int num = 100; // Change this value to compare performance on different numbers

        // Brute Force Approach
        long timeBruteForce = trailingZero(num);

        // Efficient Approach
        long timeEfficient = trailingZeroEfficient(num);

        // Calculate Time Difference
        long timeDifference = timeBruteForce - timeEfficient;
        double percentageDifference = (timeDifference / (double) timeBruteForce) * 100;

        // Print Results
        System.out.println("\nComparison:");
        System.out.println("Time taken (Brute Force): " + timeBruteForce + " ms");
        System.out.println("Time taken (Efficient): " + timeEfficient + " ms");
        System.out.println("Time Difference: " + timeDifference + " ms");
        System.out.println("Percentage Improvement: " + percentageDifference + "%");
    }

    /**
     * Brute Force Approach: Computes num! using BigInteger and counts trailing zeros.
     * Returns execution time in milliseconds.
     */
    private static long trailingZero(int num) {
        Instant start = Instant.now(); // Start time

        BigInteger factorial = factorial(num); // Compute factorial
        int count = 0;

        // Count trailing zeros by repeatedly dividing by 10
        while (factorial.remainder(BigInteger.TEN).equals(BigInteger.ZERO)) {
            factorial = factorial.divide(BigInteger.TEN);
            count++;
        }

        Instant end = Instant.now(); // End time
        long timeElapsed = Duration.between(start, end).toMillis(); // Compute time in ms

        System.out.println("Trailing Zeros (Brute Force): " + count);
        return timeElapsed;
    }

    /**
     * Efficient Approach: Counts trailing zeros without computing factorial.
     * Returns execution time in milliseconds.
     */
    private static long trailingZeroEfficient(int num) {
        Instant start = Instant.now(); // Start time

        int count = 0;
        for (int i = 5; i <= num; i *= 5) {
            count += num / i;
        }

        Instant end = Instant.now(); // End time
        long timeElapsed = Duration.between(start, end).toMillis(); // Compute time in ms

        System.out.println("Trailing Zeros (Efficient): " + count);
        return timeElapsed;
    }

    /**
     * Computes factorial using BigInteger (used in brute force method).
     */
    private static BigInteger factorial(int num) {
        if (num <= 0) return BigInteger.ONE; // 0! = 1
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}


