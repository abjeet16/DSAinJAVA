package leetCode.mid.array;

import java.sql.Array;
import java.util.Arrays;

public class MinimumScoreTriangulationOfPolygon {
    int[][] memo = new int[51][51];
    public int minScoreTriangulation(int[] values) {
        int n = values.length;

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return solve(values, 0, n-1);
    }

    private int solve(int[] values, int i, int j) {
        if (j-i+1<3)
            return 0;

        if (memo[i][j] != -1)
            return memo[i][j];

        int res = Integer.MAX_VALUE;

        for (int k = i+1 ; k < j ; k++) {
            int weight = solve(values,i,k)
                    + values[i]*values[j]*values[k]
                    +solve(values,k,j);
            res = Math.min(weight,res);
        }
        return memo[i][j] = res;
    }
}
