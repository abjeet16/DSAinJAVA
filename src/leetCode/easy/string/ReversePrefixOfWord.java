package leetCode.easy.string;

/// 2000. Reverse Prefix of Word
public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int i = 0;
        int len = word.length();
        while(i<len) {
            if (word.charAt(i) == ch)
                break;
            i++;
        }
        if (i==len)
            return word;
        StringBuilder res = new StringBuilder();
        for (int j = i ; j >= 0 ; j--){
            res.append(word.charAt(j));
        }
        for (int j = i + 1; j < len ; j++){
            res.append(word.charAt(j));
        }
        return res.toString();
    }
}
