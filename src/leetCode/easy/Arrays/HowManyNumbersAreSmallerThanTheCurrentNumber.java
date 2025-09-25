package leetCode.easy.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0 ; i < nums.length; i ++){
            for (int num : nums) {
                if (num < nums[i]) {
                    result[i]++;
                }
            }
        }
        return result;
    }

    public static int[] anotherWay(int[] nums){
        int[] temp = nums.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            if (!map.containsKey(temp[i])){
                map.put(temp[i],i);
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0 ; i < nums.length ; i++){
            temp[i] = map.get(nums[i]);
        }
        return temp;
    }

    public static int[] bestWay(int[] nums){
        int[] freq = new int[101];
        for (int i = 0 ; i < nums.length ; i++){
            freq[nums[i]]++;
        }
        System.out.println(Arrays.toString(freq));
        for (int i = 1 ; i < freq.length;i++){
            freq[i]+=freq[i-1];
        }
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] == 0)
                nums[i]=0;
            else
                nums[i] = freq[nums[i]-1];
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        anotherWay(new int[]{6, 5, 4, 8});
        bestWay(new int[]{5,0,10,0,10,6});
    }
}
