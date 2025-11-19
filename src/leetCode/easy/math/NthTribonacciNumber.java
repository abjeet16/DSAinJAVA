package leetCode.easy.math;

/// 1137. N-th Tribonacci Number
public class NthTribonacciNumber {
    public int tribonacci(int n) {
        if (n<2)
            return n;
        if (n==2)
            return 1;
        int num1 = 0, num2 = 1, num3 =1;
        n-=2;
        while (n>0){
            int sum = num1+num2+num3;
            num1 = num2;
            num2 = num3;
            num3 = sum;
            n--;
        }
        return num3;
    }
}
