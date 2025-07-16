package QSpider.JavaProgramming.Number;

import java.util.Scanner;

public class class16_07_25 {
    public static void main(String[] args) {
        /**
         * to check tech number
         */
        int num = askInt();
        checkTechNumber(num);
    }

    private static void checkTechNumber(int num) {
        int part1 = 0 , part2 = 0;
        int digitCount = class09_07_25.countNumberOfDegitInaNumber(num);
        if (digitCount%2!=0){
            System.out.println("its a odd number");
            return;
        }
        int dev = 1;
        digitCount /=2;
        while (digitCount!=0){
            dev*=10;
            digitCount--;
        }
        part1 = num%dev;
        part2 = num/dev;

        int sum = part1+part2;
        if (sum*sum==num)
            System.out.println("yes it is Tech number");
        else
            System.out.println(sum*sum+"is not");
    }

    private static int askInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        return scan.nextInt();
    }
}
