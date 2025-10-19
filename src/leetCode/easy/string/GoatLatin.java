package leetCode.easy.string;

//824. Goat Latin
public class GoatLatin {
    /**
     * Input: sentence = "I speak Goat Latin"
     * Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
     * a e i o u
     */
    public String toGoatLatin(String sentence) {
        StringBuilder res = new StringBuilder();
        int len = sentence.length();
        int wordCount = 1;
        for (int i = 0 ; i < len ; i++){
            StringBuilder word = getNextWord(sentence,i,len);
            boolean startWithVowel = startWithVowel(word);
            i+=word.length();
            if (!startWithVowel){
                char firstChar = word.charAt(0);
                word.delete(0,1);
                word.append(firstChar);
            }
            word.append("ma");
            word.repeat('a',wordCount);
            res.append(word);
            if (i<len)
                res.append(" ");
            wordCount++;
        }
        return res.toString();
    }

    private boolean startWithVowel(StringBuilder word) {
        return switch (Character.toLowerCase(word.charAt(0))) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

    private StringBuilder getNextWord(String sentence, int i, int len) {
        StringBuilder word = new StringBuilder();
        while (i<len && sentence.charAt(i)!=' '){
            word.append(sentence.charAt(i));
            i++;
        }
        return word;
    }
}
