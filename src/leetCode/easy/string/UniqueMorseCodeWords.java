package leetCode.easy.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    static String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String str : words){
            String code = generateMorse(str);
            set.add(code);
        }
        return set.size();
    }

    private static String generateMorse(String word) {
        StringBuilder sb = new StringBuilder();
        for (char ch : word.toCharArray())
            sb.append(morse[ch-'a']);
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        uniqueMorseRepresentations(words);
    }
}
