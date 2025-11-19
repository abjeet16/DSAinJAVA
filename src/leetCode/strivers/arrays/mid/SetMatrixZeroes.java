package leetCode.strivers.arrays.mid;

import java.util.Arrays;

/// 73. Set Matrix Zeroes
public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] zeroRow = new boolean[m];
        boolean[] zeroCol = new boolean[n];
        for (int i = 0 ; i < m ; i++){
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==0){
                    zeroRow[i]=true;
                    zeroCol[j]=true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zeroRow[i]||zeroCol[j])
                    matrix[i][j]=0;
            }
        }
    }

    public static void setZeroesBetter(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                matrix[0][0] = 0;
                break;
            }
        }
        for (int i = 1; i < n; i++) {
            if (matrix[0][i]==0){
                matrix[0][0]=0;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][0]==0||matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }
    }

    public static void main(String[] args) {
        //int[][] mat = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] mat = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
        setZeroes(mat);
    }
}
