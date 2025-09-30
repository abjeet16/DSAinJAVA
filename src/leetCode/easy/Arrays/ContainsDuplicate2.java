package leetCode.easy.Arrays;

import java.util.*;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k <= 0) return false;

        Map<Integer, Integer> last = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer j = last.get(nums[i]);
            if (j != null && i - j <= k) return true;
            last.put(nums[i], i);
        }
        return false;
    }
}
