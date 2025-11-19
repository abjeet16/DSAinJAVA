package leetCode.mid.string;

import java.util.Arrays;

/// 3. Longest Substring Without Repeating Characters
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty())
            return 0;
        if (s.length()==1)
            return 1;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 1;
        int len = s.length();
        boolean[] seen = new boolean[128];
        seen[s.charAt(i)]=true;
        while (j<len){
            int index = s.charAt(j);
            if (j==len-1&&!seen[index]) {
                return Math.max(max, j + 1 - i);
            }
            if (seen[index]){
                System.out.println(i+" "+j);
                max = Math.max(max,j-i);
                Arrays.fill(seen,false);
                i=find(s.charAt(j),i,s);
            }
            seen[index]=true;
            j++;
        }
        return max;
    }

    private static int find(char c, int i, String s) {
        while (s.charAt(i)!=c)
            i++;
        return i+1;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
