package leetCode.hard.arrays;

import java.util.Arrays;

/// 3013. Divide an Array Into Subarrays With Minimum Cost II
/// TODO
/*public class DivideAnArrayIntoSubarraysWithMinimumCost2 {
    public long minimumCost(int[] nums, int k, int dist) {
        int[] mins = new int[k-1];
        Arrays.fill(mins,Integer.MAX_VALUE);
        for (int i = 1 ; i < nums.length-dist ; i++){
            if (mins[k-2]>nums[i]){
                int j = k-3;
                while(j>=0){
                    if (mins[j]>nums[i]){
                        mins[j+1] = mins[j];
                    }
                    j--;
                }
                if ()
            }
        }
    }
}*/
