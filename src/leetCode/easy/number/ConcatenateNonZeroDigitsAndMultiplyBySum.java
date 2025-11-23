package leetCode.easy.number;

public class ConcatenateNonZeroDigitsAndMultiplyBySum {
    public long sumAndMultiply(int n) {
        int noZeroNumber = 0;
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            if (rem>0){
                sum+=rem;
                noZeroNumber = noZeroNumber*10+rem;
            }
            n/=10;
        }
        int temp = noZeroNumber;
        noZeroNumber=0;
        while (temp!=0){
            noZeroNumber= noZeroNumber*10+temp%10;
            temp/=10;
        }
        return (long) noZeroNumber*sum;
    }
}
