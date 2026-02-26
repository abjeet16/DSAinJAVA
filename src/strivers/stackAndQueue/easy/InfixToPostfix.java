package strivers.stackAndQueue.easy;

import java.util.Stack;

/// Infix to Postfix Conversion
public class InfixToPostfix {
    public static String infixToPostfix(String exp) {
        // Write your code here
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (char ch : exp.toCharArray()){
            if (isOperator(ch)){
                while (!stack.isEmpty() &&getPrecedence(stack.peek()) <= getPrecedence(ch)){
                    res.append(stack.pop());
                }
                stack.push(ch);
            } else if (ch=='(') {
                stack.push(ch);
            } else if (ch==')') {
                char popped = stack.pop();
                while (popped!='('){
                    res.append(popped);
                    popped = stack.pop();
                }
            }else{
                res.append(ch);
            }
        }
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();
    }
    private static boolean isOperator(char ch){
        return ch=='^'||ch=='*'||ch=='/'||ch=='+'||ch=='-';
    }
    private static int getPrecedence(char ch){
        int res;
        switch (ch){
            case '^':res=1;break;
            case '*' : case '/':res=2;break;
            case '+' : case '-':res=3;break;
            default :res=4;break;
        }
        return res;
    }
}
