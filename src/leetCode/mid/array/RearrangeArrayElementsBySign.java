package leetCode.mid.array;

import java.util.Arrays;

/// 2149. Rearrange Array Elements by Sign
public class RearrangeArrayElementsBySign {
    public static int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int len = nums.length;
        int[] res = new int[len];
        for (int ele : nums){
            if (ele>0){
                res[pos]=ele;
                pos+=2;
            }else {
                res[neg]=ele;
                neg+=2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
}
