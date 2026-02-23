package strivers.Recursion.mid;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/// 40. Combination Sum II
public class CombinationSum2 {
    public void solve(int[] candidates, int target, List<Integer> curr, List<List<Integer>> result, int idx) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue; // Ignore duplicate elements
            }
            curr.add(candidates[i]);
            solve(candidates, target - candidates[i], curr, result, i + 1);
            curr.removeLast();
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        solve(candidates, target, curr, result, 0);
        return result;
    }
}
