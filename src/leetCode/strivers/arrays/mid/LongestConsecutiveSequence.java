package leetCode.strivers.arrays.mid;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/// 128. Longest Consecutive Sequence
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxCount = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                int localNum = num;

                while(set.contains(localNum + 1)) {
                    localNum++;
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}
