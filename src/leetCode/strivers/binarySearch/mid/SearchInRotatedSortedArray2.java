package leetCode.strivers.binarySearch.mid;

/// 81. Search in Rotated Sorted Array II
public class SearchInRotatedSortedArray2 {
    public static boolean search(int[] nums, int target) {
        int left = 0 , right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            System.out.println("left : "+left+" right : "+right+" mid : "+mid);
            int midValue = nums[mid];
            if (midValue==target){
                return true;
            }
            /// int[] arr = {1,0,1,1,1};
            /// int target = 0 ;
            //for this case we use this where both array come sorted but they are not
            if (nums[left]==midValue&&midValue==nums[right]){
                left++;right--;
            } else if (midValue>=nums[left]) {
                if (target>=nums[left]&&target<=midValue){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }else {
                if (target<=nums[right]&&target>=midValue){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        int target = 0 ;
        System.out.println(search(arr,target));
    }
}
