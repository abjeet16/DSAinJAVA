package leetCode.easy;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < nums.length ; i++){
            if (!set.add(nums[i]))
                set.remove(nums[i]);
            else
                set.add(nums[i]);
        }
        return set.iterator().next();
    }
}
