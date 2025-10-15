package leetCode.easy.string;

public class IsSubsequence {
    /**
     * Given two strings s and t, return true if s is a subsequence
     * of t, or false otherwise.
     */
    public boolean isSubsequence(String s, String t) {
        int n=s.length(),m=t.length();
        if(n>m) return false;
        int i = 0,j = 0;
        while (i<n&&j<m){
            if (t.charAt(j)==s.charAt(i))
                i++;
            j++;
        }
        return i==n;
    }
}
