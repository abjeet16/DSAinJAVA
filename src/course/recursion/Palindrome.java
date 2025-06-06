package course.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abjhhjba";
        checkPalindrome(str,0);
    }
    static void checkPalindrome(String str,int index){
        if (index>str.length()/2){
            System.out.println("yes");
            return;
        }
        char rightCurrent = str.charAt(index);
        char leftCurrent = str.charAt(str.length()-index-1);
        if (rightCurrent!=leftCurrent){
            System.out.println("no");
            return;
        }
        checkPalindrome(str,index+1);
    }
}
