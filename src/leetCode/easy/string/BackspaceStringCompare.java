package leetCode.easy.string;

public class BackspaceStringCompare {
    /*public static boolean backspaceCompare(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        char[] sReal = new char[sLen];
        char[] tReal = new char[tLen];
        int i = 0 , j = 0 ;
        for (char ch : s.toCharArray()){
            if (ch!='#')
        }
    }

    private static boolean checkRemaining(String string, int i) {
        int hasCount = 0 ;
        int charCount = 0 ;
        while (i>=0){
            if (string.charAt(i)=='#')
                hasCount++;
            else
                charCount++;
            i--;
        }
        return hasCount==charCount;
    }

    public static void main(String[] args) {
        String s = "bxj##tw";
        String t = "bxj###tw";
        System.out.println(backspaceCompare(s,t));
    }*/
}
