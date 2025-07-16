package QSpider.JavaProgramming.Number;


import java.util.Scanner;

public class class10_07_25 {
    public static void main(String[] args) {
        int num = askInt();
        /**
         * to Reverse a number
         */
        //revOfDigitOfANumber();
        /**
         * to check a number is palandrom
         */
        //checkPalindrome();
        /**
         * to check a number is prime or not
         */
        /*if (checkPrimeOrNot())
            System.out.println("prime");
        else
            System.out.println("not prime");*/
        /**
         * print prime number from 1 to 1000
         */
        //printPrimeNumberFrom1To1000();

        /**
         * to calculate tha factorial of a number using recurssion*/
        //System.out.println(factorial(i));

        /**to first 10 numbers in fibonacci*/
        //fibonacci(0,0,1);

        /**
         * to find the sum of even number and odd numbers from 1 to 100
         */
        //sumOddEven();
    }


    private static void sumOddEven() {
        int sumEven = 0,sumOdd=0;
        for (int i = 1;i<=100;i++){
            if (i%2==0)
                sumEven+=i;
            else
                sumOdd+=i;
        }
        System.out.println("sum of even is "+sumEven+"sum of odd is "+sumOdd);
    }
    private static void fibonacci(int count, int num1, int num2) {
        if (count==10)
            return;
        System.out.print(num1+" , ");
        fibonacci(count+1,num2,num1+num2);
    }
    private static int askInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        return scan.nextInt();
    }
    static int factorial(int num){
        if (num==1) {
            return 1;
        }
        return num*factorial(num-1);
    }
    private static void printPrimeNumberFrom1To1000() {
        for (int num = 2;num<1000;num++){
            if (num==2||num==3) {
                System.out.println(num);
                continue;
            }else if (num%2==0||num%3==0)
                continue;
            boolean isprime = true;
            for (int j = 5;j*j<=num;j+=6)
                if (num%j==0||num%(j+2)==0){
                    isprime=false;
                    break;
                }
            if (isprime)
                System.out.println(num);
        }
    }
    static boolean checkPrimeOrNot(int num) {
        if (num==2||num==3)
            return true;
        else if (num%2==0||num%3==0)
            return false;
        for (int j = 5;j*j<=num;j+=6)
            if (num%j==0||num%(j+2)==0)
                return false;
        return true;
    }
     static int revOfDigitOfANumber(int i) {
        int rev = 0;
        while (i!=0){
            //567%10 = 7
            int temp=i%10;
            //rev = 0*10+7
            rev = rev*10+temp;
            //567/10 = 56
            i/=10;
        }
        return rev;
    }
    private static void checkPalindrome() {
        System.out.println();
        System.out.println("----------------------------countNumberOfDegitInaNumber------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int numCopy = num;
        int rev = 0;
        while (numCopy!=0){
            //567%10 = 7
            int temp=numCopy%10;
            //rev = 0*10+7
            rev = rev*10+temp;
            //567/10 = 56
            numCopy/=10;
        }
        if (rev==num)
            System.out.println("yes "+num+" is a palandrom");
        else
            System.out.println("no "+num+" is not a palandrom");

    }

}
