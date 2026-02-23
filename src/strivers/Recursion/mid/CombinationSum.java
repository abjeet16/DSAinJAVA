package strivers.Recursion.mid;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/// 39. Combination Sum
public class CombinationSum {
    /*HashSet<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, c, t, 0, new ArrayList<>());
        return res;
    }

    private void backtrack(List<List<Integer>> res, int[] c, int t, int idx, List<Integer> curr) {
        if (t == 0) {
            if (!set.contains(curr)){
                res.add(curr);
                set.add(curr);
            }
            return;
        }
        if (idx==c.length||t<0)
            return;
        curr.add(c[idx]);
        backtrack(res,c,t-c[idx],idx+1,curr);
        backtrack(res,c,t-c[idx],idx,curr);
        curr.removeLast();
        backtrack(res,c,t,idx+1,curr);
    }*/
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> list = new ArrayList<>();

        helper(list, new ArrayList<>(), candidates, target, 0);

        return list;
    }

    public void helper( List<List<Integer>> OList, List<Integer> InList, int[] candidates, int target, int startPos)
    {
        if(target == 0)
        {
            OList.add(new ArrayList<>(InList));
            return;
        } else if(target < 0)
            return;

        for(int i=startPos; i<candidates.length; i++)
        {
            // if(candidates[i] > target)
            //     return;

            InList.add(candidates[i]);
            helper(OList, InList, candidates, target - candidates[i], i);
            InList.remove(InList.size() - 1);
        }
    }
}
