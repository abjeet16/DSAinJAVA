package college;

import java.util.*;

public class BFS_DFS {
    private int vertices; // Number of vertices in the graph
    private LinkedList<Integer>[] adjList; // Adjacency list to represent the graph

    // Constructor to initialize the graph with a specified number of vertices
    public BFS_DFS(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices]; // Array of linked lists to store adjacency lists for each vertex
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>(); // Initialize each adjacency list as an empty linked list
        }
    }

    // Method to add an edge from the source vertex to the destination vertex
    public void addEdge(int source, int destination) {
        adjList[source].add(destination); // Add destination vertex to the adjacency list of the source vertex
    }

    // Method to perform Breadth-First Search (BFS) starting from a given source vertex
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[vertices]; // Array to keep track of visited vertices
        Queue<Integer> queue = new LinkedList<>(); // Queue to help traverse the graph level by level

        // Mark the starting vertex as visited and enqueue it
        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.print("BFS Traversal: ");

        // Loop while there are vertices in the queue
        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue and print it
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            // Get all the neighbors of the dequeued vertex
            for (int neighbor : adjList[vertex]) {
                // If the neighbor hasn't been visited, mark it as visited and enqueue it
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println(); // Print a newline at the end of BFS traversal
    }

    // Recursive utility function for Depth-First Search (DFS)
    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true; // Mark the current vertex as visited
        System.out.print(vertex + " "); // Print the vertex

        // Recur for all adjacent vertices that have not been visited
        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited); // Recursive call for the adjacent vertex
            }
        }
    }

    // Method to perform Depth-First Search (DFS) starting from a given source vertex
    public void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices]; // Array to keep track of visited vertices
        System.out.print("DFS Traversal: ");
        DFSUtil(startVertex, visited); // Call the recursive utility function starting from the start vertex
        System.out.println(); // Print a newline at the end of DFS traversal
    }

    // Main method to test the Graph class and its BFS and DFS methods
    public static void main(String[] args) {
        BFS_DFS graph = new BFS_DFS(6); // Create a graph with 6 vertices
        // Add edges to the graph (directed or undirected based on addEdge usage)
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        // Perform BFS and DFS from vertex 0
        graph.BFS(0); // Expected output: BFS traversal order
        graph.DFS(0); // Expected output: DFS traversal order
    }
}
