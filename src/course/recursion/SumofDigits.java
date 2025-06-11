package course.recursion;

public class SumofDigits {
    public static void main(String[] args) {
        int num = 1234;
        digitSum(num,0);
    }
    static void digitSum(int num,int sum){
        if (num <= 0){
            System.out.println(sum);
            return;
        }
        sum+=num%10;
        num/=10;
        digitSum(num,sum);
    }
}
