package leetCode.easy.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//819. Most Common Word
public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> wordCount = new HashMap<>();
        paragraph = paragraph.toLowerCase();

        StringBuilder currWord = new StringBuilder();
        String[] maxWord = {""}; // use array to modify inside lambda or method
        int[] maxWordCount = {0};

        for (int i = 0; i < paragraph.length(); i++) {
            char curr = paragraph.charAt(i);
            if (Character.isLetter(curr)) {
                currWord.append(curr);
            } else {
                processWord(currWord, bannedWords, wordCount, maxWord, maxWordCount);
            }
        }

        // handle last word if paragraph ends with a letter
        processWord(currWord, bannedWords, wordCount, maxWord, maxWordCount);

        return maxWord[0];
    }

    // helper function to process each word
    private static void processWord(StringBuilder currWord, Set<String> bannedWords,
                                    HashMap<String, Integer> wordCount,
                                    String[] maxWord, int[] maxWordCount) {
        if (currWord.isEmpty()) return;

        String word = currWord.toString();
        if (!bannedWords.contains(word)) {
            int count = wordCount.getOrDefault(word, 0) + 1;
            wordCount.put(word, count);

            if (count > maxWordCount[0]) {
                maxWordCount[0] = count;
                maxWord[0] = word;
            }
        }
        currWord.setLength(0); // clear for next word
    }

    public static void main(String[] args) {
        System.out.println((int)'a');
        System.out.println((int)'z');
        String para = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(para,banned));
    }
}
