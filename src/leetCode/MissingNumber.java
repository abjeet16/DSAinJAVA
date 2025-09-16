package leetCode;

import java.util.Arrays;

public class MissingNumber {
    /**Question: Given an array `nums` containing `n` distinct numbers
    from the range [0, n], find the one number that is missing.
    Example: nums = [3,0,1] → output: 2*/
    public static int missingNumber(int[] nums) {
        int sumOfDigit = 0;  // This will store the sum of all numbers from 1 to n
        int sum = 0;         // This will store the sum of all numbers present in the array

        // Loop through the array
        for (int i = 0 ; i < nums.length ; i ++){
            // Add (i+1) to sumOfDigit → this ensures we are building total sum of numbers from 1 to n
            sumOfDigit += (i + 1);

            // Add the current element in nums to sum
            sum += nums[i];
        }

        // The missing number is the difference between expected sum (1 to n) and actual sum
        return sumOfDigit - sum;
    }

    public static void main(String[] args) {
        missingNumber(new int[]{3, 0, 1});
    }
}
