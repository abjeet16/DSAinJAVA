package leetCode.easy.Arrays;

import java.util.Arrays;

/// 1582. Special Positions in a Binary Matrix
public class SpecialPositionsInBinaryMatrix {
    public static int numSpecial(int[][] mat) {
        int m = mat.length , n = mat[0].length;
        boolean[][] visited = new boolean[m][n];
        int res = 0;
        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                if (!visited[i][j]&&mat[i][j]==1){
                    if (check(visited,mat,i,j,m,n)){
                        res++;
                    }
                }
            }
        }
        return res;
    }

    private static void print(boolean[][] visited) {
        for (boolean[] row : visited){
            System.out.println(Arrays.toString(row));
        }
    }

    private static boolean check(boolean[][] visited, int[][] mat, int i, int j, int m, int n) {
        boolean res = true;
        visited[j][j] = true;
        for (int x = i+1 ; x < m ; x++){
            visited[x][j] = true;
            if (mat[x][j]==1)
                res = false;
        }
        for (int x = i-1 ; x >= 0 ; x--){
            visited[x][j] = true;
            if (mat[x][j]==1)
                res = false;
        }
        for (int x = j+1 ; x < n ; x++){
            visited[i][x] = true;
            if (mat[i][x]==1)
                res = false;
        }
        for (int x = j-1 ; x >= 0 ; x--){
            visited[i][x] = true;
            if (mat[i][x]==1)
                res = false;
        }
        print(visited);
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,0,0},{0,0,1},{1,0,0}};
        //int[][] arr = {{1,0,0},{0,1,0},{0,0,1}};
        //System.out.println(check(new boolean[3][3],arr,2,0,3,3));
        System.out.println(numSpecial(arr));
    }
}
