package leetCode.mid.math;

import java.util.Arrays;

/// 1513. Number of Substrings With Only 1s
public class NumberOfSubstringsWithOnly1s {
    public static int numSub(String s) {
        char[] chars = s.toCharArray();
        long ans = 0, count = 0;
        for (char c : chars) {
            if (c == '1') {
                count++;
            } else {
                ans += count * (count + 1) / 2;
                count = 0;
            }
        }
        ans += count * (count + 1) / 2;
        return (int) (ans % 1000000007);
    }

    public static void main(String[] args) {
        String str = "1110001010101111000001";
        System.out.println(numSub(str));
    }
}
