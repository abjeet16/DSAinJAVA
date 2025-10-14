package leetCode.easy.Arrays;

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int res = 0;
        for (int i = 0 ; i < nums.length ; i++){
            int count = 1;
            int j = i + 1;
            while (j< nums.length&&nums[j]>=nums[j-1]){
                if (nums[j]>nums[j-1])
                    count++;
                j++;
            }
            res = Math.max(count,res);
            i=j;
        }
        return res;
    }
    public int findLengthOfLCISBetter(int[] nums) {
        int max = 1, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                count++;
            else
                count = 1;
            max = Math.max(max, count);
        }
        return max;
    }
}
