package college;

import java.util.Arrays;

class PrimMST {
    private static final int INF = 9999999;

    public void Prim(int[][] graph, int vertices) {
        int edgesSelected = 0;
        int totalCost = 0;
        boolean[] selected = new boolean[vertices];
        Arrays.fill(selected, false);
        selected[0] = true; // Start from the first vertex

        System.out.println("Edge : Weight");

        while (edgesSelected < vertices - 1) {
            int min = INF;
            int x = -1; // Start node of the selected edge
            int y = -1; // End node of the selected edge

            for (int i = 0; i < vertices; i++) {
                if (selected[i]) { // If node i is already in MST
                    for (int j = 0; j < vertices; j++) {
                        if (!selected[j] && graph[i][j] != 0) { // If node j is not in MST and has an edge with i
                            if (graph[i][j] < min) {
                                min = graph[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }

            System.out.println(x + " - " + y + " :  " + graph[x][y]);
            totalCost += graph[x][y];
            selected[y] = true;
            edgesSelected++;
        }

        System.out.println("Total Cost :  " + totalCost);
    }

    public static void main(String[] args) {
        PrimMST g = new PrimMST();
        int vertices = 5;
        int[][] graph = {
                { 0, 9, 75, 0, 0 },
                { 9, 0, 95, 19, 42 },
                { 75, 95, 0, 51, 66 },
                { 0, 19, 51, 0, 31 },
                { 0, 42, 66, 31, 0 }
        };

        g.Prim(graph, vertices);
    }
}


