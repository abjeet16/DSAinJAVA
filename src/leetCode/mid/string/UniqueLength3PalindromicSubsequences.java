package leetCode.mid.string;

/// 1930. Unique Length-3 Palindromic Subsequences
public class UniqueLength3PalindromicSubsequences {
    public static int countPalindromicSubsequence(String s) {
        int [] freq = new int[26];
        for (char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int res = 0;
        boolean[] done = new boolean[26];
        for (int i = 0; i < 26; i++) {
            if (freq[i]>=2){
                freq[i]-=2;
                for (int j = 0; j < 26; j++) {
                    if (freq[j]>0) {
                        System.out.println((char) ('a'+i)+" "+(char) ('a'+j));
                        res++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "ckafnafqo";
        System.out.println(countPalindromicSubsequence(str));
    }
}
