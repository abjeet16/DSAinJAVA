package leetCode.easy.stackAndQueue;

import java.util.Stack;

/// 2696. Minimum String Length After Removing Substrings
public class MinimumStringLengthAfterRemovingSubstrings {
    public static int minLength(String s) {
        int len = s.length();
        char[] ch = new char[len];
        ch[0]=s.charAt(0);
        int res = 1;
        int index = 1;
        for (int i = 1 ; i < len ; i++){
            if (index>0&&((s.charAt(i)=='B'&&ch[index-1]=='A')||
                    s.charAt(i)=='D'&&ch[index-1]=='C')){
                res--;
                index--;
            }else {
                ch[index]=s.charAt(i);
                index++;
                res++;
            }
        }
        return res;
    }

    public static int minLengthUsingStack(String s){
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch=='B'&&!stack.isEmpty()){
                char last = stack.peek();
                if (last=='A')
                    stack.pop();
                else
                    stack.push(ch);
            } else if (ch=='D'&&!stack.isEmpty()) {
                char last = stack.peek();
                if (last=='C')
                    stack.pop();
                else
                    stack.push(ch);
            }else {
                stack.push(ch);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(minLength(s));
    }
}
