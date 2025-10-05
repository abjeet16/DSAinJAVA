package leetCode.easy.Arrays;

public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int boarderCount = 0;
        for (int i = 0 ; i < grid.length;i++){
            for (int j = 0 ; j < grid[0].length;j++) {
                if (grid[i][j] == 1) {
                    if (i != 0) {
                        if (grid[i - 1][j] != 1) {
                            boarderCount++;
                        }
                    }else {
                        boarderCount++;
                    }
                    if (j != 0) {
                        if (grid[i][j - 1] != 1) {
                            boarderCount++;
                        }
                    }else {
                        boarderCount++;
                    }
                    if (i != grid.length - 1) {
                        if (grid[i + 1][j] != 1) {
                            boarderCount++;
                        }
                    }else {
                        boarderCount++;
                    }
                    if (j != grid[0].length - 1) {
                        if (grid[i][j + 1] != 1) {
                            boarderCount++;
                        }
                    }else {
                        boarderCount++;
                    }
                }
            }
        }
        return boarderCount;
    }

    public static void main(String[] args) {
        int[][] arr = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int[][] arr1 = {{0,1}};
        //System.out.println(islandPerimeter(arr));
        System.out.println(islandPerimeter(arr1));
    }
}
