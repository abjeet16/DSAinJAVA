package leetCode.mid.array;

import java.util.Arrays;

/// 2048. Next Greater Numerically Balanced Number
public class NextGreaterNumericallyBalancedNumber {
    /**Easy version
     * public static int nextBeautifulNumber(int n) {
        while (true){
          n++;
          if (isBalanced(n)){
              return n;
          }
          if (n==25)
              return n;
        }
    }*/

    static int[] used = new int[10]; // how many times each digit has been used

    public static int nextBeautifulNumber(int n) {
        int digits = String.valueOf(n).length();
        int res = backtrack(n, digits, 0);
        if (res == 0) {
            // if no valid found with same digit count, try with +1 digit
            return backtrack(n, digits + 1, 0);
        }
        return res;
    }

    private static int backtrack(int n, int digitsLeft, int curr) {
        if (digitsLeft == 0) {
            if (isBeautiful() && curr > n)
                return curr;
            return 0;
        }

        int res = 0;
        for (int i = 1; i <= 9; i++) {
            // we can use digit i at most i times
            if (used[i] < i) {
                used[i]++;
                res = backtrack(n, digitsLeft - 1, curr * 10 + i);
                used[i]--;
            }

            if (res != 0) return res; // smallest found
        }
        return 0;
    }

    private static boolean isBeautiful() {
        for (int i = 1; i <= 9; i++) {
            if (used[i] != 0 && used[i] != i)
                return false;
        }
        return true;
    }

    private static boolean isBalanced(int n) {
        int[] count = new int[10];
        while (n!=0){
            int rem = n%10;
            count[rem]++;
            if (count[rem]>rem)
                return false;
            n/=10;
        }
        for (int i = 0 ; i < 10;i++){
            if (count[i]<i&&count[i]!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(nextBeautifulNumber(1000));
    }
}
