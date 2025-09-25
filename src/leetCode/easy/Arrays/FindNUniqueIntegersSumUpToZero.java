package leetCode.easy.Arrays;

public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        for (int i = 0 ; i<n/2;i++){
            res[i] = n/2-i;
            res[n-i-1] = -n/2+i;
        }
        if (n%2!=0)
            res[n/2] = 0;
        return res;
    }
}
