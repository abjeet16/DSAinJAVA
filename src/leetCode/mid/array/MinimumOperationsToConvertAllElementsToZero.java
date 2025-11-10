package leetCode.mid.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

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
        ArrayList<Integer> toChangeIndex = new ArrayList<>();
        int res = 0;
        int start = getFirstNonZero(nums);
        int end = start+1;
        int len = nums.length;
        if (start==len)
            return 0;
        toChangeIndex.add(start);
        int min = nums[start];
        while (start<len){
            if (end==len||nums[end]==0){
                markAllZero(nums,toChangeIndex);
                start = getFirstNonZero(nums);
                end = start;
                min=Integer.MAX_VALUE;
                res++;
                continue;
            }
            if (nums[end]<min){
                min = nums[end];
                start = end;
                toChangeIndex = new ArrayList<>();
            }
            if (nums[end]==min)
                toChangeIndex.add(end);
            end++;
        }
        return res;
    }

    private static void markAllZero(int[] nums,ArrayList<Integer> list) {
        for (Integer integer : list) {
            nums[integer] = 0;
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
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1,2};
        System.out.println(minOperations(nums));
    }
}
