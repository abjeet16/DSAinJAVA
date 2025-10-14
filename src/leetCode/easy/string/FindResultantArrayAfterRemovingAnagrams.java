package leetCode.easy.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams {
    public static List<String> removeAnagrams(String[] words) {
        List<String> list= new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++){

            if(!isAnagram(words[i],words[i-1])){
                list.add(words[i]);
            }
        }

        return list;
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = {"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams(arr));
    }
}
