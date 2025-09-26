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
            System.out.println("right "+right+" left : "+left);
            if (s.charAt(right)>='a'&&s.charAt(right)<='z'
                    &&
                    s.charAt(left)>='a'&&s.charAt(left)<='z'){
                if (s.charAt(right)!=s.charAt(left)){
                    return false;
                }
                right++;
                left--;
            } else if (s.charAt(right)>='a'&&s.charAt(right)<='z') {
                left--;
                System.out.println("left--");
            } else {
                right++;
                System.out.println("right++");
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
