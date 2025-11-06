package leetCode.mid.array;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/// 3607. Power Grid Maintenance
public class PowerGridMaintenance {
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        boolean[] offlineStation = new boolean[c];
        boolean[] marked = new boolean[c];
        int[] res = new int[getNumberOfOneQuery(queries)];

        List<PriorityQueue<Integer>> graphs = new ArrayList<>();
        for (int[] connection :  connections){
            if (marked[connection[1]]){
                addToGraph(graphs,connection[0],connection[1]);
            } else if (marked[connection[0]]) {
                addToGraph(graphs,connection[1],connection[0]);
            }else {
                PriorityQueue<Integer> graph = new PriorityQueue<>();
                graph.add(connection[0]);
                graph.add(connection[1]);
                graphs.add(graph);
            }
            marked[connection[0]]=true;
            marked[connection[1]]=true;
        }

        for (int[] q : queries){
            if (q[0]==2)
                offlineStation[q[1]]=true;
            else {

            }
        }
        return res;
    }

    private void addToGraph(List<PriorityQueue<Integer>> graphs, int target, int position) {

    }

    private int getNumberOfOneQuery(int[][] queries) {
        int res = 0;
        for (int[] q : queries){
            if (q[0]==1)
                res++;
        }
        return res;
    }
}
