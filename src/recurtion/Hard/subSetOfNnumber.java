package recurtion.Hard;

import java.util.ArrayList;
import java.util.Scanner;

public class subSetOfNnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a positive number");
        int number = scan.nextInt();
        String StringOfNumberTillN = "";
        for (int i = 1;i<number+1;i++){
            StringOfNumberTillN += i;
        }
        // using String
        PrintSubString(StringOfNumberTillN,0,"");
        // using ArrayList
        ArrayList<Integer> subString = new ArrayList<>();
        PrintSubArray(number,subString);
    }

    private static void PrintSubArray(int number, ArrayList<Integer> subString) {
        if (number == 0){
            PrintArrayList(subString);
            return;
        }
        //number wants to come in the Array
        subString.add(number);
        PrintSubArray(number-1,subString);

        //number doesn't want to be in the Array
        // remove the number we added before in Line 28
        subString.removeLast();
        PrintSubArray(number-1,subString);
    }

    private static void PrintArrayList(ArrayList subString) {
        for (int i = 0 ; i < subString.size();i++){
            System.out.print(subString.get(i));
        }
        System.out.println();
    }

    private static void PrintSubString(String StringNumber, int index, String subString) {
        if (index == StringNumber.length()){
            System.out.println(subString);
            return;
        }
        char currentChar = StringNumber.charAt(index);
        // if the current char wants to be in String
        PrintSubString(StringNumber,index+1,subString+currentChar);
        // if the current char doesn't want to in String
        PrintSubString(StringNumber,index+1,subString);
    }
}
