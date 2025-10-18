package leetCode.mid.array;

import java.util.Arrays;

/**
 * <a href="https://youtu.be/Vg3NjGAgOzU">...</a>
 */
//3397. Maximum Number of Distinct Elements After Operations
public class MaximumNumberOfDistinctElementsAfterOperations {
    public int maxDistinctElements(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        nums[0] -= k;
        int res = 1;
        for (int i = 1 ; i < len ; i++){
            int diff = nums[i] - (nums[i-1]+1);
            if (diff <= k && diff>= -k){
                nums[i]-=diff;
                res++;
            } else if (nums[i]-k>nums[i-1]) {
                nums[i] = nums[i]-k;
                res++;
            } else{
                nums[i] = nums[i-1];
            }
        }
        return res;
    }
}
