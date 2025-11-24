package leetCode.mid.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/// 1262. Greatest Sum Divisible by Three
public class GreatestSumDivisibleByThree {
    /**private int solve(int i, int remainder, int[] nums, int[][] t) {
        if (i >= nums.length) {
            return (remainder == 0) ? 0 : Integer.MIN_VALUE;
        }

        if (t[i][remainder] != -1)
            return t[i][remainder];

        int pick = nums[i] + solve(i + 1, (remainder + nums[i]) % 3, nums, t);
        int notPick = solve(i + 1, remainder, nums, t);

        return t[i][remainder] = Math.max(pick, notPick);
    }

    public int maxSumDivThree(int[] nums) {
        int n = nums.length;
        int[][] t = new int[n][3];

        for (int i = 0; i < n; i++)
            Arrays.fill(t[i], -1);

        return solve(0, 0, nums, t);
    }*/
    public static int maxSumDivThree(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        List<Integer> remain1 = new ArrayList<>();
        List<Integer> remain2 = new ArrayList<>();

        for (int num : nums) {
            sum += num;

            if (num % 3 == 1)
                remain1.add(num);
            else if (num % 3 == 2)
                remain2.add(num);
        }

        if (sum % 3 == 0)
            return sum;

        int result = 0;

        if (sum % 3 == 1) {
            int remove1 = remain1.size() >= 1 ? remain1.get(0) : Integer.MAX_VALUE;
            int remove2 = remain2.size() >= 2 ? remain2.get(0) + remain2.get(1) : Integer.MAX_VALUE;
            result = sum - Math.min(remove1, remove2);
        }
        else { // sum % 3 == 2
            int remove1 = remain2.size() >= 1 ? remain2.get(0) : Integer.MAX_VALUE;
            int remove2 = remain1.size() >= 2 ? remain1.get(0) + remain1.get(1) : Integer.MAX_VALUE;
            result = sum - Math.min(remove1, remove2);
        }

        return Math.max(result, 0);
    }

    public static void main(String[] args) {
        //int[] arr = {2,6,2,2,7};
        int[] arr = {2,3,36,8,32,38,3,30,13,40};
        //int[] arr = {366,809,6,792,822,181,210,588,344,618,341,410,121,864,191,749,637,169,123,472,358,908,235,914,322,946,738,754,908,272,267,326,587,267,803,281,586,707,94,627,724,469,568,57,103,984,787,552,14,545,866,494,263,157,479,823,835,100,495,773,729,921,348,871,91,386,183,979,716,806,639,290,612,322,289,910,484,300,195,546,499,213,8,623,490,473,603,721,793,418,551,331,598,670,960,483,154,317,834,352};
        System.out.println(maxSumDivThree(arr));
    }
}
