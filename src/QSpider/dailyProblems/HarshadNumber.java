package QSpider.dailyProblems;

public class HarshadNumber {
    public static void main(String[] args) {
        if (isHarshadNumber(171))
            System.out.println("yes");
        else
            System.out.println("no");
    }

    private static boolean isHarshadNumber(int num) {
        int temp = num;
        int divisor = 0;
        while (temp!=0){
            divisor+=temp%10;
            temp/=10;
        }
        return num%divisor==0;
    }
}
