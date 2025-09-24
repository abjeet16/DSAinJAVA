package leetCode.mid;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FractionToRecurringDecimal {
    public static String fractionToDecimal(int numerator, int denominator) {
        // Step 1: Handle special case: numerator = 0
        if (numerator == 0) return "0";

        StringBuilder result = new StringBuilder();

        // Step 2: Handle negative result
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        // Step 3: Work with positive values (long to avoid overflow)
        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);

        // Step 4: Integer part
        result.append(n / d);
        long remainder = n % d;

        // If no remainder, return result
        if (remainder == 0) return result.toString();

        result.append(".(");

        Set<Integer> set = new HashSet<>();
        System.out.println(remainder);
        while (remainder!=0){
            if (set.contains((int)(remainder*10))){
                break;
            }
            set.add((int)(remainder*10));
            result.append((int)(remainder*10));
            remainder/=10;
        }
        result.append(")");
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(1,3));
    }
}
