package leetCode.easy.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class KeyboardRow {
    public static String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        HashSet<Character> row1 = new HashSet<>(
                Arrays.asList('q','w','e','r','t','y','u','i','o','p')
        );
        HashSet<Character> row2 = new HashSet<>(
                Arrays.asList('a','s','d','f','g','h','j','k','l')
        );
        HashSet<Character> row3 = new HashSet<>(
                Arrays.asList('z','x','c','v','b','n','m')
        );
        for (int i = 0 ; i < words.length ; i++){
            String word = words[i].toLowerCase();
            boolean isRow1 = row1.contains(word.charAt(0));
            boolean isRow2 = row2.contains(word.charAt(0));
            boolean isRow3 = row3.contains(word.charAt(0));
            for (int j = 1 ; j <  word.length() ; j++){
                if (isRow1 && !row1.contains( word.charAt(j))){
                    isRow1 = false;
                } else if (isRow2 && !row2.contains( word.charAt(j))) {
                    isRow2 = false;
                }else if (isRow3 && !row3.contains( word.charAt(j))){
                    isRow3 = false;
                }
            }
            if (isRow1||isRow2||isRow3) {
                res.add(words[i]);
            }
        }
        return res.toArray(new String[0]);
    }

    public String[] findWordBetter(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
        String first = "qwertyuiop";
        String Secound ="asdfghjkl";
        String Third="zxcvbnm";
        for(String i : words){
            if(isinrow(i,first) || isinrow(i,Secound) || isinrow(i,Third))
                ans.add(i);
        }
        return ans.toArray(new String[0]);
    }
    private boolean isinrow(String s,String row){
        for(char c:s.toCharArray()){
            if(row.indexOf(Character.toLowerCase(c))==-1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(arr)));
    }
}
