package leetCode.easy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/// 3318. Find X-Sum of All K-Long Subarrays I
public class FindXSumOfAllKLongSubarrays {
    public static int[] findXSum(int[] nums, int k, int x) {
        int[] freq = new int[50];
        int[] res = new int[nums.length+1-k];
        for (int i = 0 ; i < k;i++)
            freq[nums[i]-1]++;
        res[0]=findSum(freq,x);
        int resIdx = 0;
        System.out.println(Arrays.toString(freq));
        for (int i = k ; i < nums.length ; i ++){
            freq[nums[resIdx]-1]--;
            freq[nums[i]-1]++;
            resIdx++;
            res[resIdx] = findSum(freq,x);
        }
        return res;
    }

    private static int findSum(int[] freq, int x) {
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                list.add(new int[]{i + 1, freq[i]}); // value, frequency
            }
        }

        // Sort by: frequency DESC, value DESC
        list.sort((a, b) -> {
            if (a[1] != b[1]) return b[1] - a[1];
            return b[0] - a[0];
        });

        int sum = 0;
        for (int i = 0; i < Math.min(x, list.size()); i++) {
            sum += list.get(i)[0] * list.get(i)[1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr ={1,1,2,2,3,4,2,3};
        int k = 6;
        int x = 2;
        System.out.println(Arrays.toString(findXSum(arr, k, x)));
    }
}
