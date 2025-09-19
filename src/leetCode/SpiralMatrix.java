package leetCode;

import java.util.*;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // 1) left -> right
            for (int j = left; j <= right; j++)
                ans.add(matrix[top][j]);
            top++; // shrink top row

            // 2) top -> bottom
            for (int i = top; i <= bottom; i++)
                ans.add(matrix[i][right]);
            right--; // shrink right col

            // 3) right -> left (only if rows remain)
            if (top <= bottom) {
                for (int j = right; j >= left; j--)
                    ans.add(matrix[bottom][j]);
                bottom--; // shrink bottom row
            }

            // 4) bottom -> top (only if cols remain)
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(matrix[i][left]);
                left++; // shrink left col
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(a)); // [1,2,3,6,9,8,7,4,5]
    }
}

