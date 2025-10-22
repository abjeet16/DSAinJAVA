package leetCode.mid.array.binarySearch;

import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted Array
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // First occurrence
        ans[0] = binarySearch(nums, target, true);
        // Last occurrence
        ans[1] = binarySearch(nums, target, false);

        return ans;
    }

    // Helper method to find first or last position
    static int binarySearch(int[] nums, int target, boolean findFirst) {
        int s = 0, e = nums.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target > nums[mid]) {
                s = mid + 1;
            } else if (target < nums[mid]) {
                e = mid - 1;
            } else {
                ans = mid;
                // If finding first, shrink end to search left side
                if (findFirst) {
                    e = mid - 1;
                }
                // If finding last, move start to search right side
                else {
                    s = mid + 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,5,9};
        int target = 3;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
}
