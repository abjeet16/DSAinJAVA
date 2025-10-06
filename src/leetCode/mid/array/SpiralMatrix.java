package leetCode.mid.array;

import java.util.*;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;

        int sRow = 0, eRow = m - 1;
        int sCol = 0, eCol = n - 1;

        while (sRow<=eRow&&sCol<=eCol){
            for (int i = sCol ; i <= eCol ; i++)
                ans.add(matrix[sRow][i]);
            sRow++;
            for (int i = sRow;i<=eRow;i++)
                ans.add(matrix[i][eCol]);
            eCol--;
            if (sRow<=eRow)
                for (int i = eCol;i>=sCol;i--)
                    ans.add(matrix[eRow][i]);
            eRow--;
            if (sCol<=eCol)
                for (int i = eRow;i>=sRow;i--)
                    ans.add(matrix[i][sCol]);
            sCol++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3,10},
                {4, 5, 6,11},
                {7, 8, 9,12},
                {13,14,15,16}
        };
        System.out.println(spiralOrder(a)); // [1,2,3,6,9,8,7,4,5]
    }
}

