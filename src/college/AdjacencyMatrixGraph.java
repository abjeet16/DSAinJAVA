package college;

import java.util.Scanner;

public class AdjacencyMatrixGraph {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of vertices
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();

        // Initialize the adjacency matrix
        int[][] adjacencyMatrix = new int[vertices][vertices];

        // Input the number of edges
        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        System.out.println("Enter the edges (format: startVertex endVertex):");

        // Populate the adjacency matrix based on edges
        for (int i = 0; i < edges; i++) {
            int startVertex = scanner.nextInt();
            int endVertex = scanner.nextInt();

            // Mark the edge in the adjacency matrix
            adjacencyMatrix[startVertex][endVertex] = 1;
            adjacencyMatrix[endVertex][startVertex] = 1; // Uncomment this for undirected graph
        }

        // Display the adjacency matrix
        System.out.println("The adjacency matrix is:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

