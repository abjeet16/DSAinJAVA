package leetCode.easy.string;

public class RansomNote {
    /**
     *Given two strings ransomNote and magazine,
     *return true if ransomNote can be constructed
     *by using the letters from magazine and false
     *otherwise.
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];
        for (char curr : magazine.toCharArray()){
            charCount[curr-'a']++;
        }
        for (char curr : ransomNote.toCharArray()){
            if (charCount[curr-'a']==0)
                return false;
            charCount[curr-'a']--;
        }
        return true;
    }
}
