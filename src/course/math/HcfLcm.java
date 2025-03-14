package course.math;

public class HcfLcm {
    public static void main(String[] args) {
        int num1 = 10, num2 = 15;
        System.out.println(hcf(num1, num2));
        System.out.println(lcm(num1,num2));
    }
    private static int hcf(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        return num1;
    }
    private static int lcm(int num1,int num2){
        // so num1 X num2 = lcm * hcf
        return (num1*num2)/hcf(num1,num2);
    }
}
