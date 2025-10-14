package leetCode.easy.Arrays;
//598
public class RangeAddition2 {
    /*public int maxCount(int m, int n, int[][] ops) {
        if (ops.length==0)
            return m*n;
        int[][] mat = new int[m][n];
        int maxCount = 0;
        int res = 0;
        for (int[] i : ops)
            maxCount = Math.max(maxCount,markAddition(mat,i));
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j]==maxCount)
                    res++;
            }
        }
        return res;
    }

    private int markAddition(int[][] mat, int[] dim) {
        int maxCount = 0;
        for (int i = 0 ; i < dim[0] ; i++){
            for (int j = 0 ; j < dim[1] ; j++){
                mat[i][j]++;
                maxCount = Math.max(maxCount,mat[i][j]);
            }
        }
        return maxCount;
    }*/
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length==0)
            return m*n;
        int mini = Integer.MAX_VALUE , minj = Integer.MAX_VALUE;
        for (int[] i : ops){
            mini = Math.min(mini,i[0]);
            minj = Math.min(minj,i[1]);
        }
        return mini*minj;
    }
}
