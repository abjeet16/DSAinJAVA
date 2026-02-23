package strivers.Recursion.mid;

import java.util.ArrayList;
import java.util.List;

/// 216. Combination Sum III
public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        generate(res,new ArrayList<Integer>(),0,1,k,n);
    }

    private void generate(List<List<Integer>> res, ArrayList<Integer> curr, int sum ,int i , int numRem, int target) {
        if (sum==target){
            res.add(new ArrayList<>(curr));
            return;
        }
        generate(res, curr, sum, i+1, numRem, target);
    }
}
