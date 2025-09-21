package leetCode.easy;

import java.util.HashSet;

public class ContainsDuplicate {
    /*public boolean containsDuplicate(int[] nums) {
        for (int i = 0 ;i<nums.length-1;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }*/
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num: nums){
            if (!hashSet.add(num))
                return true;
        }
        return false;
    }
}
