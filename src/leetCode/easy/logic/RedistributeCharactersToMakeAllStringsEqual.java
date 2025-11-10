package leetCode.easy.logic;

/// 1897. Redistribute Characters to Make All Strings Equal
public class RedistributeCharactersToMakeAllStringsEqual {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];
        int len = words.length;
        for (String s : words)
            for (char ch : s.toCharArray())
                count[ch-'a']++;
        for (int ele : count)
            if (ele%len!=0)
                return false;
        return true;
    }
}
