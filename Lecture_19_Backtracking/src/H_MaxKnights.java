import java.util.Arrays;

public class H_MaxKnights {
    static int max = -1;
    static int num = 5;

    private static boolean isSafe(char[][] board, int x, int y) {
        int n = board.length;
        int i, j;
        // pos 1
        i = x + 1;
        j = y - 2;
        if (i < n && j < n && i >= 0 && j >= 0 && board[i][j] == 'K') return false;
        // pos 2
        i = x + 2;
        j = y - 1;
        if (i < n && j < n && i >= 0 && j >= 0 && board[i][j] == 'K') return false;
        // pos 3
        i = x + 2;
        j = y + 1;
        if (i < n && j < n && i >= 0 && j >= 0 && board[i][j] == 'K') return false;
        // pos 4
        i = x + 1;
        j = y + 2;
        if (i < n && j < n && i >= 0 && j >= 0 && board[i][j] == 'K') return false;
        // pos 5
        i = x - 1;
        j = y + 2;
        if (i < n && j < n && i >= 0 && j >= 0 && board[i][j] == 'K') return false;
        // pos 6
        i = x - 2;
        j = y + 1;
        if (i < n && j < n && i >= 0 && j >= 0 && board[i][j] == 'K') return false;
        // pos 7
        i = x - 2;
        j = y - 1;
        if (i < n && j < n && i >= 0 && j >= 0 && board[i][j] == 'K') return false;
        // pos 8
        i = x - 1;
        j = y - 2;
        if (i < n && j < n && i >= 0 && j >= 0 && board[i][j] == 'K') return false;

        return true;
    }

    public static void nKnight(char[][] board, int row, int col, int curr) {
        int n = board.length;
        if (curr > max) max = curr;

        if (row == n) {
            if (curr >= n) System.out.println(Arrays.deepToString(board));
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = 'K';
            if (col < n - 1) nKnight(board, row, col + 1, curr + 1);
            else nKnight(board, row + 1, 0, curr + 1);
            board[row][col] = 'X';
        }
        if (col < n - 1) nKnight(board, row, col + 1, curr);
        else nKnight(board, row + 1, 0, curr);
    }

    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = 'X';

        nKnight(board, 0, 0, 0);
        System.out.println(max);
    }
}
