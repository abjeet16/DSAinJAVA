package QSpider.JavaProgramming.Number;

import java.util.Scanner;

public class class14_07_25 {
    public static void main(String[] args) {
        int num = askInt();
        /**
         * to check neon number
         * */
        //checkNeon(num);
        /**
         * to check strong number
         */
        //checkStrongNumber(num);
        /**
         * to check perfect number
         */
        //checkPerfectNumber(num);
        /**
         * to check spy number
         */
        //checkSpyNumber(num);
        /**
         * to find sum of natural number from 1 to 100
         */
        //sumOfNaturalNumber(num);
    }

    private static void sumOfNaturalNumber(int num) {
        int sum = num*(num+1)/2;
        System.out.println(sum);
    }
    private static void checkSpyNumber(int num) {
        int pro=1,sum=0;
        while (num!=0){
            int temp = num%10;
            pro*=temp;
            sum+=temp;
            num/=10;
        }
        if (sum==pro)
            System.out.println("yes, it is a Spy number");
        else
            System.out.println("no , it is not a Spy number");
    }
    private static void checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1;i<=num/2;i++){
            if (num%i==0)
                sum+=i;
            if (sum>num)
                break;
        }
        if (sum==num)
            System.out.println("yes , it is a perfect number");
        else{
            System.out.println("no , it is not a perfect number");
        }
    }
    private static void checkStrongNumber(int num) {
        int temp = num;
        int sum = 0;
        while (temp!=0){
            sum += factorialOfNum(temp%10);
            temp/=10;
        }
        if (sum==num)
            System.out.println("yes it is Strong number");
        else
            System.out.println("no, it is not a Strong number");

    }
    private static int factorialOfNum(int i) {
        int fact = 1;
        for (int j = 2;j<=i;j++){
            fact*=j;
        }
        return fact;
    }
    static void checkNeon(int num){
        int sq = num*num;
        int sum = 0;
        while (sq!=0){
            sum+=sq%10;
            sq/=10;
        }
        if (sum==num)
            System.out.println("yes it is neon number");
        else
            System.out.println("no, it is not a neon number");
    }
    private static int askInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        return scan.nextInt();
    }

}
