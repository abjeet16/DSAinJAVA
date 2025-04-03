package course.math;

public class PowerOfnumber {
    public static void main(String[] args) {
        System.out.println(power(2, 3));

    }
    static int power(int num, int power) {
        int result = 1;
        for (int i = 1; i <= power/2; i++) {
            result *= num;
        }
        // if number is odd number
        if (power % 2 != 0) {
            return result*result*num;
        }
        return result*result;
    }
}
