package leetCode.mid.array;

//81. Search in Rotated Sorted Array II
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
            boolean leftSorted = midValue>=nums[left];
            if (nums[left]==midValue&&midValue==nums[right]){
                left++;
            } else if (leftSorted) {
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
