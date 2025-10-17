package leetCode.easy.string;
//459. Repeated Substring Pattern
public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        int sLen = s.length();
        StringBuilder currString = new StringBuilder();
        for (int i = 0 ; i < sLen/2 ; i++){
            currString.append(s.charAt(i));
            if (sLen%(i+1)==0) {
                StringBuilder possibleRes = new StringBuilder();
                possibleRes.append(String.valueOf(currString).repeat(Math.max(0, sLen / currString.length())));
                if (possibleRes.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Same logic but shorten the size
     */
    public boolean repeatedSubstringPatternBetter(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0 && s.substring(0, i).repeat(n / i).equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s));
    }
}
