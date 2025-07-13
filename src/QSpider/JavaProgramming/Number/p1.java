package QSpider.JavaProgramming.Number;

public class p1 {
    public static void main(String[] args) {
        swapUsingMultiplication(5,8);
        swapUsingTempVariable(5,8);
        swapUsingAddition(5,8);
    }

    private static void swapUsingTempVariable(int num1, int num2) {
        System.out.println("--------------------swapUsingTempVariable--------------------");
        System.out.println("before swap : num1 : "+num1+" num2 : "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("after swap : num1 : "+num1+" num2 : "+num2);
    }

    static void swapUsingMultiplication(int num1 , int num2){
        System.out.println("--------------------swapUsingMultiplication--------------------");
        System.out.println("before swap : num1 : "+num1+" num2 : "+num2);
        num1 = num2*num1;
        num2 = num1/num2;
        num1 = num1/num2;
        System.out.println("after swap : num1 : "+num1+" num2 : "+num2);
    }

    static void swapUsingAddition(int num1 , int num2){
        System.out.println("--------------------swapUsingAddition--------------------");
        System.out.println("before swap : num1 : "+num1+" num2 : "+num2);
        num1 += num2;
        num2 = num1-num2;
        num1 -= num2;
        System.out.println("after swap : num1 : "+num1+" num2 : "+num2);
    }
}// write a program to print even number from 1 to 20
