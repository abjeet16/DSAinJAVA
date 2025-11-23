package leetCode.mid.array;

import java.util.Arrays;

public class FindMaximumBalancedXORSubarrayLength {
    public static int maxBalancedSubarray(int[] nums) {
        int even;
        int odd;
        if (nums[0]%2==0) {
            even = 1;
            odd = 0;
        }else {
            even = 0;
            odd = 1;
        }
        int xor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]%2==0)
                even++;
            else
                odd++;
            xor^=nums[i];
        }
        int i = 0;
        int j = nums.length-1;
        while (i<j){
            if (even==odd&&xor==0)
                return j-i+1;
            if (even>odd){
                if (nums[i]%2==0) {
                    xor^=nums[i];
                    i++;
                }else {
                    xor^=nums[j];
                    j--;
                }
                even--;
            }else {
                if (nums[i]%2!=0) {
                    xor^=nums[i];
                    i++;
                }else {
                    xor^=nums[j];
                    j--;
                }
                odd--;
            }
        }
        return 0;
    }

    private static void getOddEventBalance(int[] prefixEvenOdd, int[] nums) {
        int len = nums.length;
        int[] oddCount = new int[len];
        int[] evenCount = new int[len];
        if (nums[0]%2==0){
            evenCount[0]=1;
        }else {
            oddCount[0]=1;
        }
        for (int i = 1; i < len; i++) {
            if (nums[i]%2==0){
                evenCount[i]=evenCount[i-1]+1;
                oddCount[i]=oddCount[i-1];
            }else {
                oddCount[i]=oddCount[i-1]+1;
                evenCount[i]=evenCount[i-1];
            }
        }
        for (int i = 0; i < len; i++) {
            prefixEvenOdd[i]=oddCount[i]-evenCount[i];
        }
    }

    private static void getXOR(int[] prefixXOR,int[] nums) {
        prefixXOR[0] = nums[0];
        for (int i = 1; i < prefixXOR.length; i++) {
            prefixXOR[i]=prefixXOR[i-1]^nums[i];
        }
    }

    public static void main(String[] args) {
        //int[] arr = {3,2,8,5,4,14,9,15};
        int[] arr = {4,1,2,3,2,2,0,4,2,3,4};
        System.out.println(maxBalancedSubarray(arr));
    }
}
