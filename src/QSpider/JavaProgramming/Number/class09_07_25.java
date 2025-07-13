package QSpider.JavaProgramming.Number;

import java.util.Scanner;

public class class09_07_25 {
    public static void main(String[] args) {
        //print even number from 1 to 20
        printEvenFrom1To20();
        //write program to print odd number from 1 to 20
        printOddFrom1To20();
        //to print number from 1 to 100 without using any loop
        System.out.println();
        System.out.println("--------------------------print1To100WithoutUsingLoop--------------------------");
        print1To100WithoutUsingLoop(1);
        /**to print the number of digit in a number*/
        //countNumberOfDegitInaNumber();
        /**to find the sum of digit of number*/
        //sumOfDigitOfANumber();
        /**to find the Product of digit in a number*/
        //ProductOfDigitOfANumber();

    }


    private static void sumOfDigitOfANumber() {
        System.out.println();
        System.out.println("----------------------------countNumberOfDegitInaNumber------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int i = sc.nextInt();
        int sum = 0;
        while (i!=0){
            sum +=i%10;
            i/=10;
        }
        System.out.println("Sum of digit of number is "+sum);
    }
    private static void ProductOfDigitOfANumber() {
        System.out.println();
        System.out.println("----------------------------countNumberOfDegitInaNumber------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int i = sc.nextInt();
        int sum = 1;
        while (i!=0){
            sum *=(i%10);
            i/=10;
        }
        System.out.println("Product of digit of number is "+sum);
    }
    static int countNumberOfDegitInaNumber(int i) {
        int count = 0;
        while (i!=0){
            count++;
            i/=10;
        }
        return count;
    }
    private static void print1To100WithoutUsingLoop(int num) {
        if (num>100)
            return;
        System.out.print(num +" ");
        print1To100WithoutUsingLoop(++num);
    }
    private static void printEvenFrom1To20() {
        System.out.println();
        System.out.println("--------------------------printEvenFrom1To20--------------------------");
        for (int i = 1 ; i <= 20;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    private static void printOddFrom1To20() {
        System.out.println();
        System.out.println("--------------------------printOddFrom1To20--------------------------");
        for (int i = 1 ; i <= 20;i++){
            if (!(i%2==0)){
                System.out.print(i+" ");
            }
        }
    }

}
