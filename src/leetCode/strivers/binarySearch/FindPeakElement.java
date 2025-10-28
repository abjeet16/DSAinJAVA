package leetCode.strivers.binarySearch;
//162. Find Peak Element
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int right = nums.length-1;
        if (right==0||nums[0]>nums[1])
            return 0;
        if (nums[right]>nums[right-1])
            return right;
        int left = 1;
        right--;
        while (left <= right){
            int mid = (left+right)/2;
            if (nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                return mid;
            }
            if (nums[mid]<nums[mid+1]){
                left =mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }
}
