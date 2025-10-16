package leetCode.mid.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//3350. Adjacent Increasing Subarrays Detection II
public class AdjacentIncreasingSubarraysDetection2 {
    public static int maxIncreasingSubarrays(List<Integer> nums) {
        int prevLen = 1;
        int currLen = 1;
        int res = 0;
        int n = nums.size();
        for (int i = 1 ; i < n;i++){
            if (nums.get(i-1)<nums.get(i)){
                currLen++;
            }else {
                res = Math.max(res,currLen/2);
                res = Math.max(res,Math.min(prevLen,currLen));
                prevLen = currLen;
                currLen = 1;
            }
        }
        res = Math.max(res,currLen/2);
        res = Math.max(res,Math.min(prevLen,currLen));
        return res;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(-15,-13,4,7);
        System.out.println(maxIncreasingSubarrays(list));
    }
}
