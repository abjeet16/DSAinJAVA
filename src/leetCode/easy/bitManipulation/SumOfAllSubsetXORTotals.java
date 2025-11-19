package leetCode.easy.bitManipulation;

import java.util.Arrays;

/// 1863. Sum of All Subset XOR Totals
public class SumOfAllSubsetXORTotals {
    public static int subsetXORSum(int[] nums) {
        return getSum(nums,0,0);
    }

    private static int getSum(int[] nums, int i,int res) {
        if (i == nums.length){
            return res;
        }
        return getSum(nums,i+1,res^nums[i])+getSum(nums,i+1,res);
    }

    public static void main(String[] args) {
        int[] arr = {1,3};
        System.out.println(subsetXORSum(arr));
    }
}
