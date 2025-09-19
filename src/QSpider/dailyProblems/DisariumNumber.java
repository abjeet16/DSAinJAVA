package QSpider.dailyProblems;

public class DisariumNumber {
    public static void main(String[] args) {
        checkDisarium(25);
    }

    private static void checkDisarium(int num) {
        int count = digitCount(num);
        int temp = num;
        int sum = 0;
        while (num!=0){
            int rem = num%10;
            sum+=pro(rem,count);
            count--;
            num/=10;
        }
        if (sum==temp)
            System.out.println("yes");
        else
            System.out.println("no");
    }

    private static int pro(int rem, int count) {
        int pro = 1;
        for (int i = 0 ; i < count ; i++){
            pro*=rem;
        }
        return pro;
    }

    private static int digitCount(int num) {
        int count = 0 ;
        while (num!=0){
            count++;
            num/=10;
        }
        return count;
    }
}
