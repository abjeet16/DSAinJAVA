package leetCode.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n) {
        return isHappyHelper(n, new HashSet<>());
    }

    private static boolean isHappyHelper(int n, Set<Integer> seen) {
        if (n == 1) return true;
        if (seen.contains(n)) return false; // cycle detected
        seen.add(n);

        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return isHappyHelper(sum, seen);
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
