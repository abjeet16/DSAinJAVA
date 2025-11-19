package leetCode.mid.logic;

import java.util.HashSet;

/// 3747. Count Distinct Integers After Removing Zeros
public class CountDistinctIntegersAfterRemovingZeros {
    public static long countDistinct(long n) {
        int res = 0;
        String strNum = String.valueOf(n);
        int len = strNum.length();
        int[] product = new int[len];
        product[0]=1;
        for (int i = 0 ; i < len ; i++){
            product[0]*=9;
        }
        for (int i = 1;i<len;i++){
            product[i]=product[i-1]/9;
        }
        for (int i = 0 ; i < len-1;i++){
            int limit = strNum.charAt(i)-'0';
            for (int j = limit ; j > 0 ;j--){
                res+=j*product[i+1];
            }
        }
        res+=(int)n%10;
        return res;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(countDistinct(n));
    }
}
