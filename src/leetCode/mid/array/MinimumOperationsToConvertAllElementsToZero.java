package leetCode.mid.array;


import java.util.*;

/// 3542. Minimum Operations to Convert All Elements to Zero
public class MinimumOperationsToConvertAllElementsToZero {
    /**My way
     * public static int minOperations(int[] nums) {
        int res = 0;
        int start = getFirstNonZero(nums);
        int end = start+1;
        int len = nums.length;
        if (start==len)
            return 0;
        int min = nums[start];
        while (start<len){
            if (end==len||nums[end]==0){
                markAllZero(min,nums,start,end);
                start = getFirstNonZero(nums);
                end = start;
                min=Integer.MAX_VALUE;
                res++;
                continue;
            }
            if (nums[end]<min){
                min = nums[end];
                start = end;
            }
            end++;
        }
        return res;
    }

    private static void markAllZero(int value, int[] nums ,int start, int end) {
        while (start<end){
            if (nums[start]==value)
                nums[start]=0;
            start++;
        }
    }

    private static int getFirstNonZero(int[] nums) {
        int i = 0;
        int len = nums.length;
        while (i<len){
            if (nums[i]!=0)
                break;
            i++;
        }
        return i;
    }*/
    public static int minOperations(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int ops = 0;

        for (int num : nums) {
            while (!st.isEmpty() && st.peek() > num) {
                st.pop();
            }

            if (num == 0) continue;

            if (st.isEmpty() || st.peek() < num) {
                st.push(num);
                ops++;
            }
        }

        return ops;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1,2};
        System.out.println(minOperations(nums));
    }
}
