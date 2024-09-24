package recurtion.backTracking;

public class SudokuSolver {

    private static final int SIZE = 9;

    // Solves the Sudoku using backtracking
    public boolean solveSudoku(char[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                // Look for an empty cell
                if (board[row][col] == '.') {
                    // Try numbers 1-9 in this cell
                    for (char num = '1'; num <= '9'; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;  // Place number

                            // Recursively solve the rest of the board
                            if (solveSudoku(board)) {
                                return true;
                            }
                            // Backtrack if the number doesn't work
                            board[row][col] = '.';
                        }
                    }
                    return false;  // Trigger backtracking
                }
            }
        }
        return true;  // Puzzle solved
    }

    // Check if placing num in board[row][col] is valid
    private boolean isSafe(char[][] board, int row, int col, char num) {
        // Check the row
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check the column
        for (int i = 0; i < SIZE; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check the 3x3 sub-grid
        int boxRowStart = row/3*3;
        int boxColStart = col/3*3;
        for (int i = boxRowStart;i<boxRowStart+3;i++){
            for (int j = boxColStart;j<boxColStart+3;j++){
                if (board[i][j] == num){
                    return false;
                }
            }
        }
        /*int boxRowStart = row - row % 3;
        int boxColStart = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + boxRowStart][j + boxColStart] == num) {
                    return false;
                }
            }
        }*/
        return true;  // It's safe to place num here
    }

    // Print the Sudoku board
    public void printBoard(char[][] board) {
        for (int r = 0; r < SIZE; r++) {
            for (int d = 0; d < SIZE; d++) {
                System.out.print(board[r][d]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample Sudoku puzzle with '.' as empty cells
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        SudokuSolver solver = new SudokuSolver();

        System.out.println("Sudoku Puzzle:");
        solver.printBoard(board);

        if (solver.solveSudoku(board)) {
            System.out.println("Solved Sudoku:");
            solver.printBoard(board);
        } else {
            System.out.println("No solution exists for the Sudoku puzzle.");
        }
    }
}
