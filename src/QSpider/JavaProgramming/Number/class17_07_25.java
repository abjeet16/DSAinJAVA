package QSpider.JavaProgramming.Number;

import java.util.Scanner;

public class class17_07_25 {
    public static void main(String[] args) {
        int num = askInt();
        /**
         *to check fascinating number 192 219 273
         */
        //checkFascinatingNumber(num);
    }
    private static int askInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        return scan.nextInt();
    }
    /**
     * ex 192 =  192 192*2=384 192*3=576 all together 192384576
     * now check if the result has all number from 1 to 9 were each number should appear 1's but 0 can appear any number of times
     * if all number from 1 to 9 are found then YES else NO
     * @param num
     */
    private static void checkFascinatingNumber(int num) {
        int digitCount = class09_07_25.countNumberOfDegitInaNumber(num);
        //digits should be more than 3 because only 3 + 3 + 3 and more can have all 9 numbers
        if (digitCount<3){
            System.out.println("less then 3 digit");
            return;
        }
        //boolean array to check if the number is found or not
        boolean[] count = new boolean[10];
        //0 can appear any time and also 0 times so default value of true
        count[0] = true;

        //ex 192 returns 192 384 576
        String col =""+num+num*2+num*3;
        System.out.println(col);
        //loops throw all elements of the string
        for (int i = 0 ; i < col.length();i++){
            //get the current int value by converting it into string then int
            int chat = Integer.parseInt(String.valueOf(col.charAt(i)));
            //to check if the current number if already marked true or not , except for 0
            if (count[chat]&&chat!=0){
                System.out.println("no");
                return;
            }
            //if not marked then we mark it true
            count[chat] = true;
        }
        //check all the values in boolean array to determine if all number are found or not
        for (boolean bool : count){
            //if not found then return
            if (!bool){
                System.out.println("no");
                return;
            }
        }
        //if all found then print yes
        System.out.println("yes");
    }


}
