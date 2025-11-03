package leetCode.easy.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MajorityElement {
    public static int majorityElementWithoutHashMap(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int maxValue = -1;
        int max = -1;
        for (int i = 0 ; i < nums.length ; i++){
            System.out.println(i);
            int j = i+1;
            while (j< nums.length&&nums[j]==nums[i])
                j++;
            if (max<j-i+1) {
                max = j - i + 1;
                maxValue = nums[i];
            }
            i=j-1;
        }
        return maxValue;
    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            hash.put(n, 1 + hash.getOrDefault(n, 0));
            if (hash.get(n) > majority) {
                res = n;
                majority = hash.get(n);
            }
        }

        return res;
    }

    public int majorityElementBest(int[] nums) {
        return print(nums,nums[0],0);
    }
    public static int print(int[] nums,int a,int b){
        int count=1;
        for(int i=b;i<nums.length;i++){
            if(nums[i]==a)
                count++;
            else
                count--;
            if(count==0)
                return print(nums,nums[i],i);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(majorityElementWithoutHashMap(new int[]{2,2,1,1,1,2,2}));
    }
}
