package leetCode.strivers.binarySearch.easy;

import java.util.Arrays;

//Not in LeetCode
public class FloorAndCeilInSortedArray {
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int left = 0 , right = nums.length-1;
        int[] res = {-1,-1};
        while (left<=right){
            int mid = (left+right)/2;
            int midValue = nums[mid];
            if (midValue==x){
                res[0]=midValue;
                res[1]=midValue;
                return res;
            } else if (midValue>x) {
                res[1]=midValue;
                right = mid-1;
            }else {
                res[0]=midValue;
                left = mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(getFloorAndCeil(arr,10)));
    }
}
