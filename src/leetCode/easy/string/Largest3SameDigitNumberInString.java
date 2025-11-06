package leetCode.easy.string;

/// 2264. Largest 3-Same-Digit Number in String
public class Largest3SameDigitNumberInString {
    public static String largestGoodInteger(String num) {
        String max = "";
        int len = num.length();
        for (int i = 0 ; i < len-2 ; i++){
            String curr = num.substring(i,i+3);
            if (valid(curr))
                max = compair(max,curr);
        }
        return max;
    }

    private static String compair(String max, String curr) {
        if (max.isEmpty())
            return curr;
        for (int i = 0 ; i < 3 ; i++){
            if (curr.charAt(i)>max.charAt(i))
                return curr;
            else if (max.charAt(i)>curr.charAt(i)) {
                return max;
            }
        }
        return max;
    }

    private static boolean valid(String curr) {
        char digit = curr.charAt(0);
        for (char ch : curr.toCharArray())
            if (ch!=digit)
                return false;
        return true;
    }
    public static void main(String[] args) {
        String num = "222";
        System.out.println(largestGoodInteger(num));
    }
}
