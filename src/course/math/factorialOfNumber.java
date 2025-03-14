package course.math;

import java.math.BigInteger;

public class factorialOfNumber {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(factorial(num));
    }
    static BigInteger factorial(int num) {
        if (num < 0) {
            return BigInteger.ZERO;
        }
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
