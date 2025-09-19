package leetCode;


import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check: ");
        int number = scanner.nextInt();

        if (isUgly(number)) {
            System.out.println(number + " is an ugly number.");
        } else {
            System.out.println(number + " is not an ugly number.");
        }
    }

    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }

        // If the remaining number is 1, it's an ugly number
        return num == 1;
    }
}
