package leetCode.easy;

public class FindClosestPerson {
    /**
     *Input: x = 2, y = 7, z = 4
     *
     * Output: 1
     *
     * Explanation:
     *
     * Person 1 is at position 2 and can reach Person 3 (at position 4) in 2 steps.
     * Person 2 is at position 7 and can reach Person 3 in 3 steps.
     * Since Person 1 reaches Person 3 first, the output is 1.
     */
    public int findClosest(int x, int y, int z) {
        int disx = Math.abs(z-x);
        int disy = Math.abs(z-y);
        if (disx<disy){
            return 1;
        } else if (disx>disy) {
            return 2;
        }
        return 0;
    }
}
