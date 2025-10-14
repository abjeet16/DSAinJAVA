package leetCode.easy.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Input: nums = [1,3,2,2,5,2,3,7]
 *
 * Output: 5
 *
 * Explanation:
 *
 * The longest harmonious subsequence is [3,2,2,2,3].
 */
public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for (int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for (int i = 0 ; i < nums.length ; i++){
            int curr = map.get(nums[i]);
            if (map.containsKey(nums[i]-1))
                res = Math.max(res, map.get(nums[i] - 1) + curr);
            if (map.containsKey(nums[i]+1))
                res = Math.max(res, map.get(nums[i] + 1) + curr);
        }
        return res;
    }

    public int findLHSBetter(int[] nums) {
        Arrays.sort(nums);
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (nums[i] - nums[j] > 1) {
                j++;
            }
            if (nums[i] - nums[j] == 1) {
                maxLength = Math.max(maxLength, i - j + 1);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(arr));
    }
}
