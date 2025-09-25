package leetCode.easy.Arrays;

import java.util.HashMap;

public class TwoSum {
    /**
     Question: Given an array of integers nums and an integer target,
     return the indices of the two numbers such that they add up to target.
     Assume each input has exactly one solution, and you may not use the same element twice.

     Example: nums = [2,7,11,15], target = 9 → output: [0,1]
     Because nums[0] + nums[1] = 2 + 7 = 9
     */
    public static int[] twoSum(int[] nums, int target) {
        // HashMap will store the "partner number needed" as key, and the index of the current element as value
        // Example: if nums[i] = 7 and target = 9 → we store (2, index of 7)
        HashMap<Integer,Integer> map = new HashMap<>();

        // Array to hold the result (two indices)
        int[] result = new int[2];

        // Loop through all elements of nums
        for (int i = 0 ; i < nums.length ; i ++){

            // Step 1: Check if current number is already stored as a "needed partner"
            // If yes, it means we have found the pair that adds up to target
            if (map.containsKey(nums[i])){
                result[0] = map.get(nums[i]); // index of the earlier number
                result[1] = i;                // index of the current number
                break; // exit loop because solution found
            }

            // Step 2: If not found, store the number needed to complete the target
            // Example: if nums[i] = 7 and target = 9 → store (2, index of 7)
            map.put(target - nums[i], i);
        }

        // Return the two indices that form the answer
        return result;
    }

    public static void main(String[] args) {
        twoSum(new int[]{2, 7, 11, 15},9);
    }
}
