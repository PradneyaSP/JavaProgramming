public class I_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') continue;
                if (!checkPosition(board, i, j)) return false;
            }
        }
        return true;
    }

    private boolean checkPosition(char[][] board, int row, int col) {
        int n = board.length;
        char currNum = board[row][col];
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

    public static void main(String[] args) {
        I_ValidSudoku s = new I_ValidSudoku();
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(s.isValidSudoku(board));
    }
}
