package leetCode.mid.array;

import java.util.Arrays;

/// 1838. Frequency of the Most Frequent Element
public class FrequencyOfTheMostFrequentElement {
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;

        int result = 0;

        int i = 0;
        long currSum = 0;

        for (int j = 0; j < n; j++) {

            long target = nums[j];
            currSum += nums[j];

            while ((j - i + 1) * target - currSum > k) {
                currSum -= nums[i];
                i++;
            }

            result = Math.max(result, j - i + 1);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(maxFrequency(arr,5));
    }
}
