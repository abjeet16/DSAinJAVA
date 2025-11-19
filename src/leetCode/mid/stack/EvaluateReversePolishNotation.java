package leetCode.mid.stack;

import java.util.Arrays;
import java.util.Stack;

/// 150. Evaluate Reverse Polish Notation
public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        //'+', '-', '*', and '/'
        for (String str: tokens){
            if(isOprator(str)){
                int num2 = stack.pop();
                int num1 = stack.pop();
                int res = performOpration(num1,str,num2);
                stack.push(res);
            }else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }

    private static int performOpration(int num1, String str, int num2) {
        return switch (str) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> num1 / num2;
        };
    }

    private static boolean isOprator(String str) {
        return switch (str) {
            case "+", "-", "*", "/" -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        String[] arr = {"4","13","5","/","+"};
        System.out.println(evalRPN(arr));
    }
}
