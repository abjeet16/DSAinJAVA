package recurtion.backTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueen2 {
    public static void main(String[] args) {
        int n = 4; // Change this value for a different board size
        System.out.println(solveNQueens(n));
    }

    public static int solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        int count = helper(board,solutions,0);
        return count;
    }

    private static int helper(char[][] board, List<List<String>> solutions, int column) {
        if (column == board.length){
            return 1;
        }
        int count = 0;
        for (int row = 0 ; row < board.length;row++){
            if (isSafe(board,row,column)){
                board[row][column]='Q';
                count += helper(board,solutions,column+1);
                //if the solution goes wrong in future
                board[row][column]='.';
            }
        }
        return count;
    }

    private static boolean isSafe(char[][] board, int row, int column) {
        //check horizontal
        for (int i = 0;i < board.length;i++){
            if (board[row][i]=='Q'){
                return false;
            }
        }
        //upper left
        for (int i = row,j=column;i>=0&&j>=0;i--,j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        //lower left
        for (int i = row,j=column;i<board.length&&j>=0;i++,j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}
