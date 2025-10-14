package leetCode.mid.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdjacentIncreasingSubarraysDetection {
    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();

        for (int i = 0; i + 2 * k <= n; i++) {
            if (isStrictlyIncreasing(nums, i, i + k - 1) &&
                    isStrictlyIncreasing(nums, i + k, i + 2 * k - 1)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isStrictlyIncreasing(List<Integer> nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums.get(i) >= nums.get(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasIncreasingSubarrays(new ArrayList<>(Arrays.asList(0,8,-19,4,-19,-6,17)),3));
    }
}
