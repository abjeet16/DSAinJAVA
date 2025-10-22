package leetCode.mid.array;

import java.util.Arrays;

import static leetCode.mid.array.PrintArrayWIthIndex.printArrayWithIndex;

//3346. Maximum Frequency of an Element After Performing Operations I
public class MaximumFrequencyOfAnElementAfterPerformingOperations {
    public static int maxFrequency(int[] nums, int k, int ops) {
        int ans = Integer.MAX_VALUE;
        int biggestNumber = Integer.MIN_VALUE;
        for (int num : nums)
            biggestNumber = Math.max(biggestNumber,num);

        int[] freq = new int[biggestNumber+k+1];
        int[] count = new int[biggestNumber+1];
        for (int num : nums)
            addToFreq(count,freq,num,k);
        printArrayWithIndex(freq);
        printArrayWithIndex(count);
        for (int num : nums){
            int inRange = Math.max(freq[Math.max(num-k,0)],freq[num+k])-count[num];
            System.out.println(num+" : "+inRange);
            ans = Math.min(inRange,ops)+count[num];
        }
        return ans;
    }


    private static void addToFreq(int[] count,int[] freq, int num, int k) {
        count[num]++;
        int low = Math.max(num-k,0) , high = num+k;
        for (int i = num ; i <= high ; i++)
            freq[i]++;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5};
        int k = 1;
        int noOp = 2;
        System.out.println(maxFrequency(arr,k,noOp));
    }
}
