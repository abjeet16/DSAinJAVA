package leetCode.easy.Arrays;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE , min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE , max2 = Integer.MIN_VALUE , max3 = Integer.MIN_VALUE;
        for (int i : nums){
            if (min1>i){
                min2 = min1;
                min1 = i;
            }else if(min2>i){
                min2 = i;
            }
            //-1 -2 -3
            if (max1<i){
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (max2 <i) {
                max3 = max2;
                max2 = i ;
            } else if (max3<i){
                max3 = i;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
        System.out.println(((long) max1 *max2*max3));
        return Math.max(
                min1*min2*max1,
                max1*max2*max3
        );
    }

    public static void main(String[] args) {
        int[] arr = {-1,-2,-3};
        System.out.println(maximumProduct(arr));
    }
}
