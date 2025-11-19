package leetCode.mid.stack;

import java.util.ArrayList;
import java.util.List;

/// 1441. Build an Array With Stack Operations
public class BuildAnArrayWithStackOperations {
    public static List<String> buildArray(int[] target, int n) {
        int i = 1;
        int j = 0;
        int len = target.length;
        List<String> res = new ArrayList<>();
        while (j<len&&i<=n){
            res.add("Push");
            if (target[j]!=i){
                res.add("Pop");
            }else {
                j++;
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] target = {1,3};
        int n = 3;
        System.out.println(buildArray(target,n));
    }
}
