package leetCode.easy;

public class MinimumTimeVisitingAllPoints {

    public static int minTimeToVisitAllPoints(int[][] points) {
        int sec = 0;
        for (int i = 1; i < points.length; i++) {
            int dx = Math.abs(points[i][0] - points[i-1][0]);
            int dy = Math.abs(points[i][1] - points[i-1][1]);
            sec += Math.max(dx, dy);
        }
        return sec;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{3,2},{-2,2}};
        minTimeToVisitAllPoints(arr);
    }
}
