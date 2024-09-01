package recurtion.backTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static void main(String[] args) {
        int n = 4; // Change this value for a different board size
        List<List<String>> solutions = solveNQueens(n);
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,solutions,0);
        return solutions;
    }

    private static void helper(char[][] board, List<List<String>> solutions, int column) {
        if (column == board.length){
            saveBoard(board,solutions);
            return;
        }
        for (int row = 0 ; row < board.length;row++){
            if (isSafe(board,row,column)){
                board[row][column]='Q';
                helper(board,solutions,column+1);
                //if the solution goes wrong in future
                board[row][column]='.';
            }
        }
    }

    private static void saveBoard(char[][] board, List<List<String>> solutions) {
        StringBuilder row ;
        List<String> newBoard = new ArrayList<>();
        for (int i = 0 ; i < board.length;i++){
            row = new StringBuilder();
            for (int j = 0 ; j < board.length;j++){
                if (board[i][j]=='Q')
                    row.append('Q');
                else
                    row.append('.');
            }
            newBoard.add(row.toString());
        }
        solutions.add(newBoard);
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

