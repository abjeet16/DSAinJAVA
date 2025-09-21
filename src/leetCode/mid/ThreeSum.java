package leetCode.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0 ; i < nums.length-2 ; i ++){
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            for (int j = i+1;j<nums.length;j++){
                if (hashMap.containsKey(nums[j])){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(hashMap.get(nums[j]));
                    list.add(nums[j]);

                    result.add(list);
                }else
                    hashMap.put(-(nums[i]+nums[j]),nums[j]);
            }
            System.out.println(hashMap);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
