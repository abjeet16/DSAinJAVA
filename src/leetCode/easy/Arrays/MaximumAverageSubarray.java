package leetCode.easy.Arrays;

public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        int right = 0;
        double total = 0;
        while (right<k) {
            total += nums[right];
            right++;
        }
        int left = 1;
        double maxTotal = total;
        while (right<nums.length){
            total-=nums[left-1];
            total+=nums[right];
            maxTotal = Math.max(
                    maxTotal,
                    total
            );
            right++;left++;
        }
        return maxTotal/k;
    }

    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        findMaxAverage(arr,4);
    }
}
