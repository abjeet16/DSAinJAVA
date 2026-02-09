package strivers.Recursion.mid;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringsWithNoConsecutive1s {
    public static List< String > generateString(int N) {
        // Write your code here.
        List<String> res = new ArrayList<>();
        gen(res,N,-1,new StringBuilder());
        return res.reversed();
    }

    private static void gen(List<String> res, int n, int last, StringBuilder s) {
        if (s.length()==n){
            res.add(s.toString());
            return;
        }
        if (last != 1) {
            s.append('1');
            gen(res, n, 1, s);
            s.deleteCharAt(s.length() - 1);
        }
        s.append('0');
        gen(res, n, 0, s);
        s.deleteCharAt(s.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(generateString(4));
    }
}
