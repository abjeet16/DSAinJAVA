
public class matrixMulti {
    public static void main(String[] args) {
        int[][] mat1 = {
                {2,1,1},
                {1,1,1},
                {1,1,1}};
        int[][] mat2 = {
                {2,2,2},
                {2,2,2},
                {2,2,2}};
        if (mat1[0].length != mat2.length){
            System.out.println("for matrix multiplication the number of column in matrix 1 should be equal to number of row in matrix 2");
        }else {
            int[][] result = mutiply(mat1, mat2);
            printMatrix(result);
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0 ; i < matrix.length;i++){
            for (int j = 0 ; j < matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] mutiply(int[][] mat1, int[][] mat2) {
        // result matrix is always of the size (rows of matrix1 X columns of matrix2)
        int[][] mat3 = new int[mat1.length][mat2[0].length];
        for (int i = 0; i < mat1[0].length ; i++){
            for (int j =0 ; j < mat2.length;j++){
                for (int k = 0 ; k <mat2[0].length;k++){
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return mat3;
    }
}
