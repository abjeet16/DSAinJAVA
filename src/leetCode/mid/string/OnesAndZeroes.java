package leetCode.mid.string;

import java.util.Arrays;

/// 474. Ones and Zeroes
public class OnesAndZeroes {
    static int[][][] memo = new int[101][101][601];

    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] count = new int[strs.length][2];
        getCount(count, strs);

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        return dfs(count, m, n, 0);
    }

    private static int dfs(int[][] count, int m, int n, int i) {
        if (m < 0 || n < 0) return Integer.MIN_VALUE / 2; // invalid
        if (i == count.length) return 0;

        if (memo[m][n][i] != -1) return memo[m][n][i];

        int zeros = count[i][0];
        int ones = count[i][1];

        // Option 1: take this string
        int take = 1 + dfs(count, m - zeros, n - ones, i + 1);

        // Option 2: skip this string
        int skip = dfs(count, m, n, i + 1);

        return memo[m][n][i] = Math.max(take, skip);
    }

    private static void getCount(int[][] count, String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            int zeros = 0;
            for (char ch : strs[i].toCharArray()) {
                if (ch == '0') zeros++;
            }
            count[i][0] = zeros;
            count[i][1] = strs[i].length() - zeros;
        }
    }

    public static void main(String[] args) {
        String[] strs = {"101","110","0","0","0","0001","1010","01","10110","0011","0","10","11","110","1","10","0","1","00","1","0","010","1","000","0","101","0","11","1","01111","110000","1","01"};
        System.out.println(findMaxForm(strs,47,88));
    }
}
