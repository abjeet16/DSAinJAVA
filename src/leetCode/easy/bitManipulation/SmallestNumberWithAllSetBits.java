package leetCode.easy.bitManipulation;

/// 3370. Smallest Number With All Set Bits
public class SmallestNumberWithAllSetBits {
    public static int smallestNumberBetter(int n) {
        int nextAddition = 1;
        int res = 0;
        while (res<n) {
            res += nextAddition;
            nextAddition*=2;
        }
        return res;
    }

    public static int smallestNumber(int n) {
        int noOnes = 0;
        int res = 0;
        while (res<n) {
            res += power(noOnes);
            noOnes++;
        }
        return res;
    }

    private static int power(int n) {
        int res = 1;
        for (int i = 0 ; i < n ; i++){
            res*=2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(smallestNumber(5));
    }
}
