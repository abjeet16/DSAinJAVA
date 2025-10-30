package leetCode.hard.arrays;

import java.util.Arrays;

/// 1526. Minimum Number of Increments on Subarrays to Form a Target Array
public class MinimumNumberOfIncrementsOnSubarraysToFormTargetArray {
    public static int minNumberOperations(int[] target) {
        int len = target.length;
        int[] initial = new int[len];
        int i = 0;
        int res = 0;
        while (i < len){
            if (initial[i]==target[i])
                i++;
            else{
                int toChange = target[i]-initial[i];
                int j = i+1;
                while (j<len){
                    if (target[j]-initial[j]==0)
                        break;
                    toChange = Math.min(toChange,target[j]-initial[j]);
                    j++;
                }
                res+=toChange;
                incrementValues(initial,i,j,toChange);
            }
        }
        return res;
    }

    private static void incrementValues(int[] initial, int i, int j, int toChange) {
        while (i!=j)
            initial[i++]+=toChange;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        System.out.println(minNumberOperations(arr));
    }
}
