package leetCode.mid.array;

import java.util.Arrays;

public class ValidTriangleNumber {
    /**
     * Counts the number of valid triangles that can be formed from the given array.
     *
     * A triangle is valid if for sides a, b, c (where a ≤ b ≤ c), the triangle inequality holds:
     *      a + b > c
     *
     * Approach:
     * 1. Sort the array to simplify checking the triangle inequality.
     * 2. Fix two sides (nums[i], nums[j]) in nested loops.
     * 3. For each pair, use binary search to find the farthest index k such that:
     *        nums[k] < nums[i] + nums[j]
     *    (this ensures nums[i] + nums[j] > nums[k], so a valid triangle can be formed).
     * 4. Add (k - j) to the count, since every index from (j+1 … k) with this pair is valid.
     * 5. Skip zeros, since side length cannot be zero.
     *
     * Time Complexity: O(n^2 log n) due to sorting + nested loops + binary search.
     * Space Complexity: O(1) (ignoring sorting cost).
     */
    public static int triangleNumberBinarySearch(int[] nums) {
        if(nums.length<3){
            return 0;
        }

        Arrays.sort(nums);
        int count = 0;

        for (int i = 0 ; i < nums.length;i++){
            if (nums[i]==0){
                continue;
            }
            for (int j = i+1 ; j < nums.length;j++){
                if (nums[j]==0){
                    continue;
                }
                int target = nums[i]+nums[j];
                int k = binarySearchTriangleSide(nums,j,nums.length-1,target);
                if(k!=-1){
                    count+=(k-j);
                }
            }
        }
        return count;
    }

    private static int binarySearchTriangleSide(int[] nums, int i, int j, int target) {
        int k = -1;
        while (i<=j){
            int mid = i+(j-i)/2;
            if (nums[mid]<target){
                k=mid;
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return k;
    }

    /**
     * Counts the number of valid triangles that can be formed from the given array.
     *
     * A triangle is valid if for sides a, b, c (where a ≤ b ≤ c), the triangle inequality holds:
     *      a + b > c
     *
     * Approach (Two Pointers, O(n^2)):
     * 1. Sort the array to make checking easier (so we know nums[i] ≤ nums[j] ≤ nums[k]).
     * 2. Fix the largest side as nums[k] (looping k from end to start).
     * 3. Use two pointers:
     *      - i = 0 (smallest side candidate)
     *      - j = k - 1 (middle side candidate)
     * 4. While i < j:
     *      - If nums[i] + nums[j] > nums[k]:
     *           → This means nums[i] with all values from i…(j-1) will also satisfy
     *             the condition (since array is sorted).
     *           → So we add (j - i) to the count.
     *           → Move j-- (try a smaller middle side).
     *      - Else:
     *           → Increase i (need a bigger small side).
     * 5. Skip zeros if needed, because side length cannot be zero.
     *
     * Time Complexity: O(n^2) (faster than binary search method).
     * Space Complexity: O(1).
     */
    public static int triangleNumberTwoPointer(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int count =0;
        for (int k = nums.length-1;k>=2;k--){
            if (nums[k]==0)
                continue;
            int i = 0;
            int j = k-1;
            while (i<j){
                if (nums[i]+nums[j]>nums[k]){
                    count+=(j-i);
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }
}