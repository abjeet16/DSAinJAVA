package leetCode.easy.Arrays;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int resIndex=0;
        for (int i : nums){
            if (i != val){
                nums[resIndex] = i;
                resIndex++;
            }
        }
        return resIndex;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}
