package leetCode.easy.string;

//409. Longest Palindrome
public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int res = 0;
        int[] charCount = new int[52];
        for (char ch : s.toCharArray()){
            if (ch<'a')
                charCount[ch-'A']++;
            else
                charCount[26+ch-'a']++;
        }
        for (int i : charCount){
            if (i>=2) {
                if (i % 2 == 0) {
                    res+=i;
                }else {
                    res+=i-1;
                }
            }
        }
        if (s.length()>res)
            res++;
        return res;
    }

    public static void main(String[] args) {
        String str = "zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez";
        System.out.println(longestPalindrome(str));
    }
}
