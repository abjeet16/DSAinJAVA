package leetCode.easy.Arrays;

import java.util.Arrays;

public class PlusOne {
    /**
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Incrementing by one gives 123 + 1 = 124.
     * Thus, the result should be [1,2,4].
     */
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0 ; i--){
            if (digits[i]!=9){
                digits[i]+=1;
                return digits;
            }else {
                if (i==0){
                    int[] res = new int[digits.length+1];
                    res[0]=1;
                    return res;
                }
                digits[i]=0;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                plusOne(new int[]{9,9,9})
        ));
    }
}
