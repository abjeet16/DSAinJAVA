package leetCode.mid.array.binarySearch;
//704. Binary Search
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0 , right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            int midValue = nums[mid];
            if (midValue==target){
                return mid;
            } else if (midValue>target) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }
}
