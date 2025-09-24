package leetCode.easy;

import java.util.Stack;

public class ValidParentheses {
    //s consists of parentheses only '()[]{}'.
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++){
            char curr = s.charAt(i);
            if (curr=='('||curr=='['||curr=='{')
                stack.add(curr);
            else if (stack.isEmpty()) {
                return false;
            } else if (curr==')'&&stack.pop()!='('){
                return false;
            } else if (curr==']'&&stack.pop()!='[') {
                return false;
            } else if (curr=='}'&&stack.pop()!='{') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
