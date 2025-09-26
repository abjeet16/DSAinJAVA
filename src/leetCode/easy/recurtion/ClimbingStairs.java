package leetCode.easy.recurtion;

import java.util.HashMap;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        // Base case: if there are 0 or 1 steps,
        // there is only 1 way to climb (either do nothing or take a single step).
        if (n == 0 || n == 1)
            return 1;

        // 'num1' stores f(i-2), 'num2' stores f(i-1) in Fibonacci style.
        // Initially both are 1 because:
        // f(0) = 1 (1 way to stay at ground), f(1) = 1 (1 way to climb one step).
        int num1 = 1, num2 = 1;

        // 'count' starts at 2 since we already handled f(0) and f(1).
        int count = 2;

        // Loop until we reach f(n).
        // At each iteration, calculate the number of ways to climb 'count' steps.
        while (count != n + 1) {
            // Save previous f(i-2)
            int temp = num1;

            // Shift values: move f(i-1) into f(i-2)
            num1 = num2;

            // New f(i) = f(i-1) + f(i-2)
            num2 = temp + num2;

            // Move to next step
            count++;
        }

        // At the end, 'num2' holds f(n), i.e., total ways to climb 'n' steps.
        return num2;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
