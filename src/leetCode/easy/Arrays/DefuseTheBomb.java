package leetCode.easy.Arrays;

import java.util.Arrays;

/// 1652. Defuse the Bomb
public class DefuseTheBomb {
    public static int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] res = new int[len];
        if (k==0)
            return res;
        int start,end,sum;
        if (k>0){
            sum=computeSum(code,1,k+1);
            if (k==len){
                end=0;
            }else {
                end=k;
            }
            start=len-k-1;
        }else {
            sum=computeSum(code,code.length+k,code.length);
            start=len+k-1;
            end=len-1;
        }
        res[0]=sum;
        for (int i = 1; i < len ; i++) {
            start++;
            end++;
            if (start == len)
                start = 0;
            if (end == len)
                end = 0;
            System.out.println(code[start]+" "+code[end]);
            sum -= code[start];
            sum += code[end];
            res[i]=sum;
        }
        return res;
    }

    private static int computeSum(int[] code, int i, int j) {
        int sum = 0 ;
        while (i < j){
            sum+=code[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        //int[] arr = {5, 7, 1, 4};
        //int[] arr = {2,4,9,3};
        int[] arr = {5,2,2,3,1};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(decrypt(arr,3)));
    }
}
