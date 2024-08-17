package recurtion.Hard;

import java.util.Scanner;

public class RatEscape {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, false, true, true},
                {true, true, true, false},
                {false, false, false, true}
        };
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the X and Y coordinates you want to reach inside the maze:");
        int goalX = scan.nextInt();
        int goalY = scan.nextInt();
        scan.close();
        // maze.length is used to get the number of ROWS and
        // maze[0].length is used to get the number of COLUMNS
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        System.out.println(findNumberOfPaths(0, 0, goalX, goalY, maze, visited));
    }

    private static int findNumberOfPaths(int startX, int startY, int goalX, int goalY, boolean[][] maze, boolean[][] visited) {
        // Check if out of bounds, at a blocked cell, or already visited
        if (startX < 0 || startY < 0 || startX >= maze.length || startY >= maze[0].length
                || !maze[startX][startY] || visited[startX][startY]) {
            return 0;
        }

        // Check if the goal is reached
        if (startX == goalX && startY == goalY) {
            return 1;
        }

        // Mark the current cell as visited
        visited[startX][startY] = true;

        // Explore all possible directions
        int right = findNumberOfPaths(startX + 1, startY, goalX, goalY, maze, visited);
        int down = findNumberOfPaths(startX, startY + 1, goalX, goalY, maze, visited);
        int left = findNumberOfPaths(startX - 1, startY, goalX, goalY, maze, visited);
        int up = findNumberOfPaths(startX, startY - 1, goalX, goalY, maze, visited);

        // Unmark the current cell before returning (backtracking)
        visited[startX][startY] = false;

        return right + down + left + up;
    }
}
