package college;

import java.util.Scanner;

public class GraphDegrees {

    // Function to display the adjacency matrix
    public static void displayAdjacencyMatrix(int[][] graph) {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to print In-Degree and Out-Degree for each node
    public static void printInAndOutDegrees(int[][] graph) {
        int nodes = graph.length;

        // Iterate through each node in the graph
        for (int i = 0; i < nodes; i++) {
            int outDegree = 0; // Out-degree counter
            int inDegree = 0;  // In-degree counter

            // Calculate Out-Degree for node i by counting outgoing edges
            for (int j = 0; j < nodes; j++) {
                if (graph[i][j] == 1) { // If there's an edge from i to j
                    outDegree++;
                }
            }

            // Calculate In-Degree for node i by counting incoming edges
            for (int j = 0; j < nodes; j++) {
                if (graph[j][i] == 1) { // If there's an edge from j to i
                    inDegree++;
                }
            }

            // Print the in-degree and out-degree for node i
            System.out.println("Node " + i + " -> In-Degree: " + inDegree + ", Out-Degree: " + outDegree);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of nodes in the graph
        System.out.print("Enter the number of nodes: ");
        int nodes = scanner.nextInt();

        // Initialize the adjacency matrix
        int[][] graph = new int[nodes][nodes];

        // Input the adjacency matrix values
        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        // Display the adjacency matrix
        displayAdjacencyMatrix(graph);

        // Print the in-degree and out-degree for each node
        printInAndOutDegrees(graph);

        scanner.close();
    }
}
