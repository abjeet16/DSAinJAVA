package college;

public class Knapsack01Simple {

    // Method to return the maximum value that can be put in a knapsack of capacity W
    public static int knapSack(int capacity, int[] weights, int[] values, int n) {
        // Create a 2D array to store maximum value at each n and capacity
        int[][] dp = new int[n + 1][capacity + 1];

        // Fill dp array
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    // Maximum of including or excluding the current item
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w]; // Exclude the item
                }
            }
        }

        return dp[n][capacity]; // Maximum value in knapsack
    }

    public static void main(String[] args) {
        // Example items: values and weights
        int[] values = {6, 5, 2,1};  // Values of the items
        int[] weights = {5, 4, 3,2};   // Weights of the items
        int capacity = 9;              // Knapsack capacity
        int n = values.length;          // Number of items

        // Measure execution time
        long startTime = System.nanoTime();
        int maxValue = knapSack(capacity, weights, values, n);
        long endTime = System.nanoTime();

        // Output the maximum value and execution time
        System.out.println("Maximum value in Knapsack = " + maxValue);
        System.out.println("Execution Time: " + (endTime - startTime) + " nanoseconds");
    }
}
