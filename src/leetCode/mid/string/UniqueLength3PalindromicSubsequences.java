package leetCode.mid.string;

/// 1930. Unique Length-3 Palindromic Subsequences
public class UniqueLength3PalindromicSubsequences {
    /** MY Way
     * public static int countPalindromicSubsequence(String s) {
        int [] freq = new int[26];
        for (char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int res = 0;
        boolean[] done = new boolean[26];
        for (int i = 0 ; i < s.length() ; i++) {
            int charIndex = s.charAt(i)-'a';
            if (done[charIndex])
                continue;
            if (freq[charIndex]>1){
                freq[charIndex]-=2;
                int j = s.length()-1;
                while (s.charAt(j)!=s.charAt(i)){
                    j--;
                }
                boolean[] curr = new boolean[26];
                int temp = i;
                while (temp<j){
                    int currChar = s.charAt(temp)-'a';
                    if (!curr[currChar]){
                        if (freq[currChar]>0) {
                            res++;
                        }
                        curr[currChar]=true;
                    }
                    temp++;
                }
            }
            freq[charIndex]+=2;
            done[charIndex]=true;
        }
        return res;
    }*/

    public static int countPalindromicSubsequence(String s) {
        int n = s.length();
        int res = 0;
        int [] freq = new int[26];
        for (char ch : s.toCharArray()){
            freq[ch-'a']++;
        }

        // For every possible character x
        for (char c = 'a'; c <= 'z'; c++) {
            if (freq[c-'a']<2)
                continue;

            int left = -1, right = -1;

            // Find first and last occurrence
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) {
                    if (left == -1) left = i;
                    right = i;
                }
            }

            // Count unique middles
            boolean[] seen = new boolean[26];
            for (int i = left + 1; i < right; i++) {
                seen[s.charAt(i) - 'a'] = true;
            }

            // Sum distinct middle chars
            for (boolean b : seen) if (b) res++;
        }

        return res;
    }


    public static void main(String[] args) {
        String str = "aabca";
        System.out.println(countPalindromicSubsequence(str));
    }
}
