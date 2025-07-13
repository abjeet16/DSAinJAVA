package QSpider.JavaProgramming.Number;

import java.util.Scanner;

public class class12_07_25 {
    public static void main(String[] args) {
        int num = askInt();
        /**
         * to check whether a number is automorphic number
         */
        //checkAutomorphism(num);

        /**
         * to check weather a number is armstrong number
         */
        //checkArmstrong(num);
    }

    private static void checkArmstrong(int num) {
        int sum = 0;
        int temp = num;
        int count = class09_07_25.countNumberOfDegitInaNumber(num);
        while (temp!=0){
            int rem = temp%10;
            int pro = rem;
            for (int i = 0; i < count-1;i++){
                pro*=rem;
            }

            if (temp/10!=0)
                System.out.print(pro+"("+rem+"^"+count+") + ");
            else
                System.out.print(pro+"("+rem+"^"+count+")");

            sum+=pro;
            temp/=10;
        }
        System.out.print(" = "+sum);
        if (sum==num){
            System.out.println();
            System.out.println(num+" == "+sum+" so yes "+num+" is an Armstrong Number");
        }else {
            System.out.println();
            System.out.println(num+" != "+sum+" so no "+num+" is not an Armstrong Number");
        }
    }

    private static void checkAutomorphism(int num) {
        boolean ismor = true;
        System.out.println(num+" x "+num+" = "+num*num);
        for (int result = num*num ; num!=0;result/=10,num/=10){
            if (result%10!=num%10){
                System.out.println("no , it is not Automorphic");
                ismor = false;
                break;
            }
        }
        /*while (num!=0){
            if (result%10!=num%10){
                System.out.println("no");
                ismor = false;
                break;
            }
            result/=10;
            num/=10;
        }*///using while loop
        if (ismor)
            System.out.println("yes , it is Automorphic");
    }

    private static int askInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        return scan.nextInt();
    }
}
