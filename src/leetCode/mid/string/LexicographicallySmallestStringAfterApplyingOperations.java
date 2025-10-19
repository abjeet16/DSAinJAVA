package leetCode.mid.string;

import java.util.*;

//1625. Lexicographically Smallest String After Applying Operations
public class LexicographicallySmallestStringAfterApplyingOperations {
    public static String findLexSmallestString(String s, int a, int b) {
        String smallest = s;
        Queue<String> queue = new ArrayDeque<>();
        int[] vist = new int[s.length()];
        Set<String> visted = new HashSet<>();
        queue.add(s);
        visted.add(s);
        while (!queue.isEmpty()){
            s = queue.poll();
            if (isFirstArgsSmaller(s,smallest)){
                smallest = s;
            }
            String temp = add(s,a);
            if (visted.add(temp)){
                queue.add(temp);
            }

            temp = rotate(s,b);
            if (visted.add(temp)){
                queue.add(temp);
            }
        }
        return smallest;
    }

    private static boolean isFirstArgsSmaller(String s, String smallest) {
        int lenS = s.length();
        int lenSmallest = smallest.length();
        if (lenS<lenSmallest){
            return true;
        }
        for (int i = 0 ; i < lenS ; i++){
            int currS = s.charAt(i);
            int currSmallest = smallest.charAt(i);
            if (currS<currSmallest)
                return true;
            else if (currS!=currSmallest) {
                return false;
            }
        }
        return false;
    }

    private static String add(String s, int value) {
        int i = 0;
        StringBuilder res = new StringBuilder();
        int len = s.length();
        while (i < len){
            if (i%2!=0) {
                int sum = s.charAt(i) - '0' + value;
                if (sum > 9) {
                    sum %= 10;
                }
                res.append(sum);
            }else {
                res.append(s.charAt(i));
            }
            i++;
        }
        return res.toString();
    }

    private static String rotate(String s, int b) {
        char[] sChars = s.toCharArray();
        helper(sChars,0,s.length()-1);
        helper(sChars,0,b-1);
        return helper(sChars,b,s.length()-1);
    }

    private static String helper(char[] s, int i, int j) {
        while (i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;j--;
        }
        return new String(s);
    }

    public static void main(String[] args) {
        System.out.println(isFirstArgsSmaller("123","456"));
        String str = "74";
        int a = 5;
        int b = 1;
        System.out.println(findLexSmallestString(str,a,b));
    }
}
