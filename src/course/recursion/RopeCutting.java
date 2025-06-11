package course.recursion;

public class RopeCutting {
    public static void main(String[] args) {
        int[] cost = {12, 9, 11,2};
        int ropeSize = 23;
        int maxPieces = cuttingRope(cost, ropeSize);
        System.out.println("Maximum number of pieces: " + maxPieces);
    }

    static int cuttingRope(int[] cost, int ropeSize) {
        if (ropeSize == 0) return 0;
        if (ropeSize < 0) return -1;

        int max = -1;
        for (int i = 0; i < cost.length; i++) {
            int res = cuttingRope(cost, ropeSize - cost[i]);
            if (res != -1) {
                max = Math.max(max, res + 1);
            }
        }
        return max;
    }
}

