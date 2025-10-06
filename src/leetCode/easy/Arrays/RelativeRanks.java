package leetCode.easy.Arrays;

import java.util.Arrays;

public class RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        String[] res = new String[score.length];
        for (int i = 0 ; i < score.length ; i++){
            res[i] = finkRank(sorted,score[i]);
        }
        return res;
    }

    private static String finkRank(int[] sorted, int i) {
        int left = 0,right = sorted.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (sorted[mid]==i) {
                if (mid == sorted.length-1)
                    return "Gold Medal";
                else if (mid == sorted.length-2)
                    return "Silver Medal";
                else if (mid == sorted.length-3)
                    return "Bronze Medal";
                else
                    return String.valueOf(sorted.length-mid);
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
