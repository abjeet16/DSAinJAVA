package leetCode.strivers.binarySearch.mid;

/// 153. Find Minimum in Rotated Sorted Array
public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        if(nums.length == 1){
            return nums[0];
        }
        int left = 0 , right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            System.out.println("left : "+left+" right : "+right+" mid : "+mid);
            if (nums[left]<=nums[mid]){
                min = Math.min(min,nums[left]);
                left=mid+1;
            }else {
                min = Math.min(min,nums[mid]);
                right = mid-1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        System.out.println(findMin(arr));
    }
}
