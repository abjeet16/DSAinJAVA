package leetCode;

public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        int sum = num/2;
        for (int i = 1 ; i<=num/3 ; i ++){
            if (num%i==0)
                sum+=i;
        }
        if (sum==num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(1));
    }
}
