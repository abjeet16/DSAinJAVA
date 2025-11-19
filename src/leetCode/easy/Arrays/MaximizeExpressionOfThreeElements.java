package leetCode.easy.Arrays;

/// 3745. Maximize Expression of Three Elements
public class MaximizeExpressionOfThreeElements {
    public int maximizeExpressionOfThree(int[] nums) {
        int num1 = Integer.MIN_VALUE;
        int num2 = num1;
        int num3 = Integer.MAX_VALUE;
        for(int i : nums){
            if(i>=num1){
                num2 = num1;
                num1 = i;
            }else if(i>num2){
                num2 = i;
            }
            if(i<num3){
                num3=i;
            }
        }
        return num1+num2-num3;
    }
}
