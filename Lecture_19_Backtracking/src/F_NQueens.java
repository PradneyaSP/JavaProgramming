import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F_NQueens {

    private void helper(int n, String[][] board, int row, List<List<String>> ans, List<String> curr, StringBuilder s) {

        if (row == n) {
            System.out.println(Arrays.deepToString(board));
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = "Q";
                String Q = s.substring(0, j) + "Q" + s.substring(j + 1);
                curr.add(Q);
                helper(n, board, row + 1, ans, curr, s);
                curr.remove(curr.size() - 1);
                board[row][j] = ".";        // Backtracking
            }
        }
    }

    private boolean isSafe(String[][] board, int row, int col) {
        int n = board.length;
        //Horizontal
        for (int k = 0; k < n; k++) {
            if (board[row][k].equals("Q")) return false;
        }
        //Vertical
        for (int k = 0; k < n; k++) {
            if (board[k][col].equals("Q")) return false;
        }
        //Primary Diagonal
        for (int l = row, m = col; l >= 0 && m >= 0; l--, m--) {
            if (board[l][m].equals("Q")) return false;
        }
        //Secondary Diagonal
        for (int l = row, m = col; l >= 0 && m < n; l--, m++) {
            if (board[l][m].equals("Q")) return false;
        }

        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        String[][] board = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                board[i][j] = ".";
        }
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < n; i++)
            s.append(".");

        helper(n, board, 0, ans, curr, s);

        return ans;
    }

    public static void main(String[] args) {
        F_NQueens q = new F_NQueens();
        System.out.println(q.solveNQueens(4));
    }
}
