package HackerRank.easy.array;

import java.util.List;

public class SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int res = 0;
        for (int i : ar)
            res+=i;
        return res;
    }
}
