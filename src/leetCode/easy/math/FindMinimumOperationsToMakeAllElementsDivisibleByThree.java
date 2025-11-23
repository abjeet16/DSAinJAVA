package leetCode.easy.math;

/// 3190. Find Minimum Operations to Make All Elements Divisible by Three
public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    public int minimumOperations(int[] nums) {
        int res = 0;
        for (int i : nums) {
            if (i % 3 != 0)
                res++;
        }
        return res;
    }
}
