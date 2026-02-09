package leetCode.mid.array;

import java.util.Arrays;

/// 3634. Minimum Removals to Balance Array
public class MinimumRemovalsToBalanceArray {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int maxLen = 1;
        for (int j = 0 ; j < n ; j++){
            while (i<j&&(long)nums[i]*k<nums[j])
                i++;
            maxLen = Math.max(maxLen,j-i+1);
        }
        return n-maxLen;
    }
}
