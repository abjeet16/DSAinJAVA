package leetCode.mid.stack;

import java.util.Stack;

/// 1653. Minimum Deletions to Make String Balanced
public class MinimumDeletionsToMakeStringBalanced {
    public int minimumDeletions(String s) {
        Stack<Character> stack = new Stack<>();
        int res = 0;
        for (char ch : s.toCharArray()){
            if (stack.isEmpty()){
                stack.push(ch);
            } else if (ch == 'a'&&stack.peek()=='b') {
                stack.pop();
                res++;
            } else {
                stack.push(ch);
            }
        }
        return res;
    }
}
