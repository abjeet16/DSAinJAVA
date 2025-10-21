package leetCode.hard.simulation;

/**<a href="https://youtu.be/9WYhuzn8hd8">...</a>*/
public class SwimInRisingWater {
    static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    int n;
    public int swimInWater(int[][] grid) {
        n = grid.length;
        int l = grid[0][0];
        int r = n*n-1;

        int result = 0;

        while (l<=r){
            int mid = l+(r-l)/2;
            boolean[][] visited = new boolean[n][n];
            if (possibleToReach(grid,0,0,mid,visited)){
                result = mid;
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return result;
    }

    private boolean possibleToReach(int[][] grid, int i, int j, int currWaterLevel, boolean[][] visited) {
        if (i < 0 || i >=n || j < 0 || j >= n || visited[i][j] || grid[i][j] > currWaterLevel){
            return false;
        } else if (i == n-1 && j==n-1) {
            return true;
        }

        visited[i][j] = true;

        for (int[] d : dir){
            if (possibleToReach(grid,i+d[0],j+d[1],currWaterLevel,visited))
                return true;
        }
        return false;
    }
}
