package recurtion.Hard;

import java.util.Scanner;

public class ratExcape {
    public static void main(String[] args) {
        boolean [][] maze = {{true,true,false},
                             {false,true,false},
                             {false,true,true}};
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the X and Y coordinate you wanna reach inside MAZE");
        int goalA = scan.nextInt();
        int goalB = scan.nextInt();
        System.out.println(findNumberOfPath(0,0,goalA,goalB,maze));
    }

    private static int findNumberOfPath(int startX, int startY, int goalA, int goalB, boolean[][] maze) {
        if (startX==goalA && startY==goalB){
            return 1;
        }
        if (!maze[startX][startY]){
            return 0;
        }
        int right=0,down=0,up=0,left=0;
        if (startX+1<maze.length){
            right = findNumberOfPath(startX+1,startY,goalA,goalB,maze);
        }
        if (startY+1<maze.length){
            down = findNumberOfPath(startX,startY+1,goalA,goalB,maze);
        }
        if (startX-1>0){
            left = findNumberOfPath(startX-1,startY,goalA,goalB,maze);
        }
        if (startY-1>0){
            up = findNumberOfPath(startX,startY-1,goalA,goalB,maze);
        }
        return right+down+up+left;
    }
}
