package leetCode.easy.string;

public class ValidPalindrome {
    /**
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome
     */
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int right = 0 , left = s.length()-1;
        while(right<left){
            char rightChar = s.charAt(right);
            char leftChar = s.charAt(left);
            if (((rightChar>='a'&& rightChar<='z')||(rightChar>='0'&&rightChar<='9'))
                    &&
                    ((leftChar>='a'&&leftChar<='z')||(leftChar>='0'&&leftChar<='9')))
            {
                if (rightChar!=leftChar){
                    System.out.println("right "+right+" left "+left);
                    return false;
                }
                right++;
                left--;
            } else if ((rightChar>='a'&&rightChar<='z')||(rightChar>='0'&&rightChar<='9')) {
                left--;
            } else {
                right++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        //System.out.println(isPalindrome("0u"));
        System.out.println(isPalindrome("abj a a jba"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
