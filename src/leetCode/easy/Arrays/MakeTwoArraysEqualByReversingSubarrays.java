package leetCode.easy.Arrays;

/// 1460. Make Two Arrays Equal by Reversing Subarrays
public class MakeTwoArraysEqualByReversingSubarrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] count = new int[1001];
        int len = target.length;
        for (int i = 0; i < len; i++) {
            count[target[i]]++;
            count[arr[i]]--;
        }
        for (int ele : count){
            if (ele!=0)
                return false;
        }
        return true;
    }
}
