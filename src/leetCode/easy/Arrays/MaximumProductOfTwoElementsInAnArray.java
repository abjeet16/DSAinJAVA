package leetCode.easy.Arrays;

/// 1464. Maximum Product of Two Elements in an Array
public class MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int ele : nums)
            if (ele>=max){
                secondMax = max;
                max = ele;
            }else if (ele > secondMax)
                secondMax = ele;
        return (max-1)*(secondMax-1);
    }
}
