package leetCode.mid.array;

/// 53. Maximum Subarray
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int currSum = 0;
        for (int ele : nums){
            if (currSum<0){
                currSum=0;
            }
            currSum+=ele;
            res = Math.max(res,currSum);
        }
        return res;
    }
}
