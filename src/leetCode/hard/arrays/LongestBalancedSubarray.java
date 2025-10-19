package leetCode.hard.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestBalancedSubarray {
    public int longestBalanced(int[] nums) {

        Set<Integer> seenEven = new HashSet<>();
        Set<Integer> seenOdd = new HashSet<>();
        Map<String, Integer> firstOccurrence = new HashMap<>();

        int maxLen = 0;
        String diffKey = "0#0";
        firstOccurrence.put(diffKey, -1);
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if (num % 2 == 0) seenEven.add(num);
            else seenOdd.add(num);

            String key = seenEven.size() + "#" + seenOdd.size();

            if (firstOccurrence.containsKey(key)) {
                int prevIndex = firstOccurrence.get(key);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                firstOccurrence.put(key, i);
            }
        }

        return maxLen;
    }
}
