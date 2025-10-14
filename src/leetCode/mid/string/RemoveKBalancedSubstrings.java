package leetCode.mid.string;

public class RemoveKBalancedSubstrings {
    /**
     * You are given a string s consisting of '(' and ')', and an integer k.
     * A string is k-balanced if it is exactly k consecutive '(' followed by k consecutive ')', i.e., '(' * k + ')' * k.
     * For example, if k = 3, k-balanced is "((()))".
     * You must repeatedly remove all non-overlapping k-balanced substrings from s, and then join the remaining parts. Continue this process until no k-balanced substring exists.
     * Return the final string after all possible removals.
     * Note: Please do not copy the description during the contest to maintain the integrity of your submissions.
     */
    public static String removeSubstringMoreTime(String s, int k) {
        String pattern = "(".repeat(k) + ")".repeat(k);
        int index = s.indexOf(pattern);
        if (index == -1) return s; // no k-balanced substring found

        // remove the found substring and check again
        String newString = s.substring(0, index) + s.substring(index + 2 * k);
        return removeSubstringMoreTime(newString, k);
    }

    public static String removeSubstring(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int openCount = 0;  // counts '(' sequence
        int closeCount = 0; // counts ')' after k '('

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c);

            if (c == '(') {
                openCount++;
                closeCount = 0; // reset closing count
            } else {
                closeCount++;
                if (closeCount == k && openCount >= k) {
                    // remove last 2*k characters
                    sb.setLength(sb.length() - 2 * k);
                    openCount -= k;
                    closeCount = 0;
                }
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {

    }
}

