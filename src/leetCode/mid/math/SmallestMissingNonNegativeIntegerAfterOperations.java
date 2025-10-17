package leetCode.mid.math;

import java.util.Arrays;
import java.util.HashMap;

//2598. Smallest Missing Non-negative Integer After Operations
public class SmallestMissingNonNegativeIntegerAfterOperations {
    public static int findSmallestInteger(int[] nums, int value) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ;  i ++){
            nums[i] = nums[i]%value;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            System.out.println( nums[i]+" : "+map.get(nums[i]));
        }
        int MEX = 0 ;
        while (true){
            int rem = MEX%value;
            if (map.containsKey(rem-value)){
                int newCount = map.get(rem-value)-1;
                if (newCount==0){
                    map.remove(rem-value);
                }else {
                    map.put(rem-value, newCount);
                }
                MEX++;
            }else if (map.containsKey(rem)){
                int newCount = map.get(rem)-1;
                if (newCount==0){
                    map.remove(rem);
                }else {
                    map.put(rem, newCount);
                }
                MEX++;
            }else {
                return MEX;
            }
        }
    }

    //Same logic
    public static int findSmallestIntegerBetter(int[] nums, int value) {
        int[] count = new int[value];
        for (int i = 0 ; i < nums.length ;  i ++){
            int rem = nums[i]%value;
            if (rem<0)
                rem+=value;
            count[rem]++;
        }
        int MEX = 0 ;
        while (count[MEX%value]>0){
            count[MEX%value]--;
            MEX++;
        }
        return MEX;
    }

    public static void main(String[] args) {
        int[] arr = {3,0,3,2,4,2,1,1,0,4};
        System.out.println(findSmallestIntegerBetter(arr,5));
    }
}
