package leetCode.easy.Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    /**
     *Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * Output: [1,2,2,3,5,6]
     * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
     * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // If nums2 is empty, nothing to do
        if (n == 0) return;

        int i = m - 1;          // last valid index in nums1
        int j = n - 1;          // last index in nums2
        int k = m + n - 1;      // fill position from the end in nums1

        // Merge while both sides have elements
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If anything remains in nums2, copy it (nums1's leftovers are already in place)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
      merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}
