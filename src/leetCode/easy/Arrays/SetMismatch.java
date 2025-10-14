package leetCode.easy.Arrays;

import java.util.HashSet;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int curr = 0;
        int[] res = new int[2];
        for (int i = 0 ; i<nums.length ; i++){
            sum+=i+1;
            if (set.add(nums[i])){
                curr+=nums[i];
            }else {
                res[0]=nums[i];
            }
        }
        res[1] = sum-curr;
        return res;
    }
}
