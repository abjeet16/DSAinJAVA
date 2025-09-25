package leetCode.easy;

import java.util.Stack;

public class ValidParentheses {
    //s consists of parentheses only '()[]{}'.
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char i : s.toCharArray()){
            if (i=='('||i=='['||i=='{')
                stack.add(i);
            else if (stack.isEmpty()) {
                return false;
            } else if (i==')'&&stack.pop()!='('){
                return false;
            } else if (i==']'&&stack.pop()!='[') {
                return false;
            } else if (i=='}'&&stack.pop()!='{') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
