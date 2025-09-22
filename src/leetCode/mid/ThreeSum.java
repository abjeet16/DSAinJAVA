package leetCode.mid;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSumMyWay(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0 ; i < nums.length-2 ; i ++){
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            for (int j = i+1;j<nums.length;j++){
                if (hashMap.containsKey(nums[j])){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(hashMap.get(nums[j]));
                    list.add(nums[j]);
                    Collections.sort(list);
                    result.add(list);
                }else
                    hashMap.put(-(nums[i]+nums[j]),nums[j]);
            }
        }
        return result.stream().toList();
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate i

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // move l and r past duplicates
                    int lv = nums[l], rv = nums[r];
                    while (l < r && nums[l] == lv) l++;
                    while (l < r && nums[r] == rv) r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
