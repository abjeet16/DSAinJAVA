package leetCode.easy.Arrays;

import java.util.PriorityQueue;

/// 3264. Final Array State After K Multiplication Operations I
public class FinalArrayStateAfterKMultiplicationOperations {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k>0){
            int minIndex = getMin(nums);
            nums[minIndex]*=multiplier;
            k--;
        }
        return nums;
    }

    private int getMin(int[] nums) {
        int res = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[res]>nums[i])
                res=i;
        }
        return res;
    }
}
