package leetCode.easy.string;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        if(t.length()==1)
            return t.charAt(0);
        int[] charCount = new int[26];
        for (char ch : s.toCharArray())
            charCount[ch - 'a']++;
        for (char ch : t.toCharArray())
            if (charCount[ch-'a']==0)
                return ch;
            else
                charCount[ch-'a']--;
        return ' ';
    }

    public char findTheDifferenceBetter(String s, String t) {
        int sumS = 0, sumT = 0;

        for (char ch : s.toCharArray())
            sumS += ch;

        for (char ch : t.toCharArray())
            sumT += ch;

        return (char)(sumT - sumS);
    }
}
