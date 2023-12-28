import java.util.Arrays;

public class J_SudokuSolver {
    private boolean checkPosition(char[][] board, int row, int col, char currNum) {
        int n = board.length;
        //Row
        for (int j = 0; j < n; j++)
            if (j != col && board[row][j] == currNum) return false;

        //Column
        for (int i = 0; i < n; i++)
            if (i != row && board[i][col] == currNum) return false;

        //Matrix
        int subBoxX = 3 * (row / 3);
        int subBoxY = 3 * (col / 3);
        for (int i = subBoxX; i < subBoxX + 3; i++)
            for (int j = subBoxY; j < subBoxY + 3; j++)
                if (i != row && j != col && board[i][j] == currNum) return false;

        return true;
    }

    public boolean helper(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char k = '1'; k <= '9'; k++) {
                        if (checkPosition(board, i, j, k)) {
                            board[i][j] = k;
                            if(helper(board)) return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        helper(board);
    }

    public static void main(String[] args) {
        J_SudokuSolver s = new J_SudokuSolver();
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        s.solveSudoku(board);
    }
}
