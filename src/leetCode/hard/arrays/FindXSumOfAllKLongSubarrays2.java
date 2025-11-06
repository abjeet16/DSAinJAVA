package leetCode.hard.arrays;

import javax.swing.text.html.parser.Entity;
import java.util.*;

/// 3321. Find X-Sum of All K-Long Subarrays II
/// TODO
public class FindXSumOfAllKLongSubarrays2 {
    public static long[] findXSum(int[] nums, int k, int x) {
        //int[] freq = new int[50];
        HashMap<Integer,Integer> freq = new HashMap<>();
        long[] res = new long[nums.length+1-k];
        for (int i = 0 ; i < k;i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }
        res[0]=findSum(freq,x);
        int resIdx = 0;
        for (int i = k ; i < nums.length ; i ++){
            freq.put(nums[resIdx], freq.get(nums[resIdx])-1);
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
            res[++resIdx] = findSum(freq,x);
        }
        return res;
    }

    private static long findSum(HashMap<Integer, Integer> freq, int x) {
        List<int[]> list = new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 0) {
                list.add(new int[]{entry.getKey(), entry.getValue()}); // value, frequency
            }
        }

        // Sort by: frequency DESC, value DESC
        list.sort((a, b) -> {
            if (a[1] != b[1]) return b[1] - a[1];
            return b[0] - a[0];
        });

        long sum = 0;
        for (int i = 0; i < Math.min(x, list.size()); i++) {
            sum += (long) list.get(i)[0] * list.get(i)[1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr ={1000000000,1000000000,1000000000,1000000000,1000000000,1000000000};
        int k = 6;
        int x = 1;
        System.out.println(Arrays.toString(findXSum(arr, k, x)));
    }
}
