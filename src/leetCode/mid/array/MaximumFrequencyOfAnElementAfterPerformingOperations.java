package leetCode.mid.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static leetCode.mid.array.PrintArrayWIthIndex.printArrayWithIndex;

//3346. Maximum Frequency of an Element After Performing Operations I
public class MaximumFrequencyOfAnElementAfterPerformingOperations {
    //using freq array
    /*public static int maxFrequency(int[] nums, int k, int numOperations) {
        int maxEl = Integer.MIN_VALUE;
        for (int num : nums)
            if (maxEl<num)
                maxEl = num;
        maxEl+=k;

        int[] freq = new int[maxEl + 1];
        for (int num : nums) {
            freq[num]++;
        }
        printArrayWithIndex(freq);

        // cumulative sum of frequencies
        for (int i = 1; i <= maxEl; i++) {
            freq[i] += freq[i - 1];
        }

        printArrayWithIndex(freq);

        int result = 0;
        for (int target = 0; target <= maxEl; target++) {
            if (freq[target] == 0)
                continue;

            int leftNum = Math.max(0, target - k);
            int rightNum = Math.min(maxEl, target + k);

            int totalCount = freq[rightNum] - (leftNum > 0 ? freq[leftNum - 1] : 0);
            int targetCount = freq[target] - (target > 0 ? freq[target - 1] : 0);

            int needConversion = totalCount - targetCount;
            int maxPossibleFreq = targetCount + Math.min(needConversion, numOperations);

            result = Math.max(result, maxPossibleFreq);
        }

        return result;
    }*/

    //difference array
    public static int maxFrequency(int[] nums, int k, int numOperations) {
        int maxEl = Integer.MIN_VALUE;
        for (int num : nums)
            if (maxEl<num)
                maxEl = num;
        maxEl+=k;
        int result = 1;
        int[] diff = new int[maxEl + 2];
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            int l = Math.max(num - k, 0);
            int r = Math.min(num + k, maxEl);

            diff[l]++;
            diff[r + 1]--;
        }

        for (int target = 0; target <= maxEl; target++) {
            if (target > 0) diff[target] += diff[target - 1];

            int targetFreq = freq.getOrDefault(target, 0);
            int needConversion = diff[target] - targetFreq;

            int maxPossibleFreq = Math.min(needConversion, numOperations);
            result = Math.max(result, targetFreq + maxPossibleFreq);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {999999997,999999999,999999999};
        int k = 999999999;
        int noOp = 2;
        System.out.println(maxFrequency(arr,k,noOp));
    }
}
