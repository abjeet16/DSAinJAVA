package leetCode.easy.Arrays;

import java.util.Arrays;

/// 506. Relative Ranks
public class RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        int len = score.length;
        String[] res = new String[len];
        for (int i = 0 ; i < len ; i++){
            res[i] = finkRank(sorted,score[i]);
        }
        return res;
    }

    private static String finkRank(int[] sorted, int i) {
        int len = sorted.length;
        int left = 0,right = len-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (sorted[mid]==i) {
                if (mid == len-1)
                    return "Gold Medal";
                else if (mid == len-2)
                    return "Silver Medal";
                else if (mid == len-3)
                    return "Bronze Medal";
                else
                    return String.valueOf(len-mid);
            }
            else if (sorted[mid]>i) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        int[] arr = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(arr)));
    }
}
