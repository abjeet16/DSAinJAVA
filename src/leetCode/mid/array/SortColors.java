package leetCode.mid.array;

/// 75. Sort Colors
public class SortColors {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int ele : nums){
            count[ele]++;
        }
        int len = nums.length;
        for (int i = 0 ; i < len ; i++){
            if (count[0]!=0){
                count[0]--;
                nums[i]=0;
            } else if (count[1]!=0) {
                count[1]--;
                nums[i]=1;
            }else {
                nums[i]=2;
            }
        }
    }

    public void sortColorsAnother(int[] nums){
        int low = 0 , mid = 0 , high = nums.length-1;
        while (mid<=high){
            if (nums[mid]==0){
                swap(nums,mid,low);
                mid++;low++;
            } else if (nums[mid]==1) {
                mid++;
            }else {
                swap(nums,mid,high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int mid, int low) {
        int temp = nums[mid];
        nums[mid] = nums[low];
        nums[low] = temp;
    }
}
