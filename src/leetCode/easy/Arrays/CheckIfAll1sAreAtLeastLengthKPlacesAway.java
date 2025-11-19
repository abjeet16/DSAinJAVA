package leetCode.easy.Arrays;

/// 1437. Check If All 1's Are at Least Length K Places Away
public class CheckIfAll1sAreAtLeastLengthKPlacesAway {
    public static boolean kLengthApart(int[] nums, int k) {
        int len = nums.length;
        for(int i = 0 ; i < len ; i++){
            if (nums[i]==1) {
                if (hasOne(nums, i + 1, Math.min(i+k+1, len))) {
                    return false;
                }else {
                    i+=k;
                }
            }
        }
        return true;
    }

    private static boolean hasOne(int[] nums, int i, int j) {
        while (i<j){
            if (nums[i]==1)
                return true;
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,0,1,0,1};
        int k = 2;
        System.out.println(kLengthApart(nums,k));
    }
}
