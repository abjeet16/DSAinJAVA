package leetCode.easy.math;

/// 231. Power of Two
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        while (n>0&&n%2==0) {
            n /= 2;
            System.out.println(n);
        }
        return n==1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
