package QSpider.JavaProgramming.Number;

import java.util.Scanner;

/**
 * rev of number is in class10_07_25
 * prime number is in class10_07_25
 * count of digit in number is in class09_07_25
 */
public class class16_07_25 {
    public static void main(String[] args) {
        /**
         * to check tech number
         */
        int num = askInt();
        //checkTechNumber(num);
        /**
         * to check sunny number
         */
        //sunnyNumber(num);
        /**
         * to check a year is a leap year
         */
        //checkLeapYear(num);
    }

    private static void checkLeapYear(int num) {
        if (num % 100 == 0){
            System.out.println("is cen");
            if (num%400==0){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }else {
            System.out.println("not cen");
            if (num%4==0){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
    private static void sunnyNumber(double num) {
        double root = class15_07_25.findSquareRoot(num+1);
        if(root-(int)root==0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    private static void checkTechNumber(int num) {
        //count the digits
        int digitCount = class09_07_25.countNumberOfDegitInaNumber(num);
        //check if it is even or not , if odd then return back from the function
        if (digitCount%2!=0){
            System.out.println("it contains odd number of digits");
            return;
        }
        /*
            ex - 2025
            to get 20 we need 2025%dev , here div = 100
            to get 25 we need 2025/dev
            here, we get 100 as the dev always has digitCount/2 number of 0's
         */
        int dev = 1;
        digitCount /=2;
        while (digitCount!=0){
            dev*=10;
            digitCount--;
        }

        //(num/100)20 + (num%100)25 is 45 and 45^2 is 2025 so it is a tech number
        int sum = num%dev+num/10;
        if (sum*sum==num)
            System.out.println("yes it is Tech number");
        else
            System.out.println("is not");
    }
    private static int askInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        return scan.nextInt();
    }
}
