package leetCode.easy.Arrays;

import java.util.Arrays;

/// 1652. Defuse the Bomb
public class DefuseTheBomb {
    public static int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] res = new int[len];
        if (k==0)
            return res;
        int st,en;
        if (k<0){
            st=len-k;
            en=len;
        }else {
            st=1;
            en=k+1;
        }
        int currSum = getSum(code,st,en);
        res[0]=currSum;
        for (int i = 1; i < len; i++) {
            currSum-=code[st];
            st++;en++;
            if (st>=len)
                st=0;
            if (en>=len)
                en=0;
            currSum+=code[en];
            res[i]=currSum;
        }
        return res;
    }

    private static int getSum(int[] code, int i, int j) {
        int sum = 0;
        while (i < j) {
            sum += code[i++];
        }
        return sum;
    }

    public static void main(String[] args) {
        //int[] arr = {5, 7, 1, 4};
        //int[] arr = {2,4,9,3};
        int[] arr = {5,2,2,3,1};
        System.out.println(Arrays.toString(decrypt(arr,3)));
    }
}
