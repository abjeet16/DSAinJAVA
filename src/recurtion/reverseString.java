package recurtion;

public class reverseString {
    public static void main(String[] args) {
        String str = "abjeet Yadav";
        int lastIndex = str.length()-1;
        printString(lastIndex,str);
    }

    private static void printString(int lastIndex, String str) {
        System.out.print(str.charAt(lastIndex));
        if (lastIndex>0){
            printString(lastIndex-1,str);
        }
    }
}
