package leetCode.hard.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/// 3719. Longest Balanced Subarray I
public class LongestBalancedSubarray {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxL = 0;
        int freqL = Integer.MIN_VALUE;
        for (int i : nums){
            freqL = Math.max(freqL,i);
        }

        for (int i = 0; i < n; i++) {
            boolean[] freq = new boolean[freqL+1];
            int even = 0;
            int odd = 0;

            for (int j = i; j < n; j++) {
                if (!freq[nums[j]]){
                    if (nums[j]%2==0)
                        even++;
                    else
                        odd++;
                    freq[nums[j]] = true;
                }

                if (even==odd) {
                    maxL = Math.max(maxL, j - i + 1);
                }
            }
        }

        return maxL;
    }
}
