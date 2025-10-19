package leetCode.easy.Arrays;

import java.util.Arrays;

public class SmallestMissingMultipleOfK {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int multiple = k;
        for(int i : nums){
            if (i != k){
                return i;
            }
            multiple*=k;
        }
        return 0;
    }
}
