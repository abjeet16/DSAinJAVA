package QSpider.JavaProgramming.Number;

import java.util.Scanner;

public class class15_07_25 {
    public static void main(String[] args) {
        int num = askInt();
        /**
         * to find square root of a number
         */
        //findSquareRoot(num);
        /**
         *to find the cube root of a number
         */
        //findCubeRoot(num);
        //findRoot(num,3);
        /**
         * to check emirp number
         */
        //checkEmirp(num);
        /**
         *
         */
    }

    private static void checkEmirp(int num) {
        if (class10_07_25.checkPrimeOrNot(
                class10_07_25.revOfDigitOfANumber(num)
        ) && class10_07_25.checkPrimeOrNot(num))
            System.out.println("yes , it is a Emirp number");
        else
            System.out.println("no , it is not a Emirp number");
    }
    private static void findCubeRoot(double num) {
        //(2*currRoot + num/currRoot ^ 2)/3
        double currRoot = num / 5;
        while (true){
            double root = (2*currRoot + num/(currRoot*currRoot))/3;
            if (currRoot==root){
                System.out.println(num+"^3 "+root);
                break;
            }
            currRoot=root;
        }
    }
    // to do
    private static void findRoot(double num,int root) {
        //(2*currRoot + num/currRoot ^ 2)/3
        double currRoot = num / 2;
        while (true){
            double currRootSq = currRoot;
            for (int i = 0 ; i < root-1 ; i++)
                currRootSq*=currRoot;
            System.out.println(currRootSq);
            double result = ((root-1)*currRoot + num/currRootSq)/root;
            if (currRoot==result){
                System.out.println(num+"^"+root+" "+result);
                break;
            }
            currRoot=result;
        }
    }
    private static void findSquareRoot(double num) {
        double currRoot = num / 2;
        while (true){
            double root = (currRoot + num/currRoot)/2;
            if (currRoot==root){
                System.out.println(num+"^2 "+root);
                break;
            }
            currRoot=root;
        }
    }
    private static int askInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        return scan.nextInt();
    }
}