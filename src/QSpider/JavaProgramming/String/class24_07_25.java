package QSpider.JavaProgramming.String;

public class class24_07_25 {
    public static void main(String[] args) {
        /**
         * count the number char leaving space
         */
        //numberOfCharInString("hi i am abjeet");
        /**
         * rev string
         */
        //revString("abjeet");
        /**
         *
         */
        //checkPalString("abjajba");
    }

    private static void checkPalString(String string) {
        for (int i = 0; i < string.length()/2;i++)
            if (string.charAt(i)!=string.charAt(string.length()-1-i)){
                System.out.println("no");
                return;
            }
        System.out.println("yes");
    }

    private static void numberOfCharInString(String message) {
        int count = 0;
        for (int i=0;i<message.length();i++)
            if (message.charAt(i)!=' ')
                count++;
        System.out.println(count);
    }
    private static void revString(String message) {
        String rev="";
        for (int i=message.length()-1;i>=0;i--)
            rev +=message.charAt(i);
        System.out.println(rev);
    }
}
