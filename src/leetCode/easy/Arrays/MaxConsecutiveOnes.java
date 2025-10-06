package leetCode.easy.Arrays;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        for (int i = 0 ; i < nums.length ; i ++){
            int currCount=0;
            if(nums[i]==1){
                while (i< nums.length&&nums[i]==1){
                    currCount++;
                    i++;
                    if (i==nums.length)
                        return Math.max(maxOnes,currCount);
                }
            }
            maxOnes = Math.max(maxOnes,currCount);
        }
        return maxOnes;
    }
}
