package leetCode.easy.string;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        int i = 0 , j = s.length()-1;
        char[] ch = s.toCharArray();
        while (i<j){
            char iChar = s.charAt(i);
            char jChar = s.charAt(j);
            if (!isVowel(iChar)){
                i++;
            }
            if (!isVowel(jChar)){
                j--;
            }
            if (isVowel(iChar)&&isVowel(jChar)){
                ch[i] = jChar;ch[j] = iChar;
                i++;j--;
            }
        }
        StringBuilder res = new StringBuilder();
        for (char c : ch){
            res.append(c);
        }
        return res.toString();
    }

    private boolean isVowel(char c) {
        switch (c){
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':return true ;
            default: return false;
        }
    }
}
