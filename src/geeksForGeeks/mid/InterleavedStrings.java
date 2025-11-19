package geeksForGeeks.mid;

public class InterleavedStrings {
        static boolean isInleaveRec(String s1, String s2, String s3, int i, int j) {

            int k = i + j;

            // If all strings are fully traversed
            if (i == s1.length() && j == s2.length() && k == s3.length())
                return true;

            boolean a = (i < s1.length()) && (s3.charAt(k) == s1.charAt(i))
                    && isInleaveRec(s1, s2, s3, i + 1, j);

            boolean b = (j < s2.length()) && (s3.charAt(k) == s2.charAt(j))
                    && isInleaveRec(s1, s2, s3, i, j + 1);

            // If any of the above two possibilities return true
            // otherwise return false.
            return a || b;
        }

        static boolean isInterleave(String s1, String s2, String s3) {
            if (s1.length() + s2.length() != s3.length())
                return false;

            return isInleaveRec(s1, s2, s3, 0, 0);
        }

        public static void main(String[] args) {
            String s1 = "AAB";
            String s2 = "AAC";
            String s3 = "AAAABC";
            System.out.println(isInterleave(s1, s2, s3) ? "true" : "false");
        }
}
