package strivers.Recursion.mid;

import java.util.List;

/// 139. Word Break
/// Microsoft Amazon Google Walmart
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        //leetcode code
        for (String word : wordDict){
            int len = word.length();
            boolean flag = false;
            for (int i = 0 ; i < s.length()-len+1;i++){
                if (s.substring(i,i+len).equals(word)){
                    flag = true;
                    break;
                }
            }
            if (!flag)return false;
        }
        return true;
    }
}
