public class O_MaximalSquares {
    public int maximalSquare(char[][] matrix) {
//        int[][]dp = new int[matrix.length][matrix[0].length];
//        int[] max = new int[1];
//        helperRec(matrix, 0, 0, max);
//        helperMemo(matrix, 0, 0, max, dp);
        return helperTab(matrix);
    }

    public int helperRec(char[][] matrix, int i, int j, int[] max) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        if (i >= m || j >= n)
            return 0;

        int right = helperRec(matrix, i, j + 1, max);
        int diagonal = helperRec(matrix, i + 1, j + 1, max);
        int down = helperRec(matrix, i + 1, j, max);

        if (matrix[i][j] == '0')
            return 0;
        else {
            ans = 1 + Math.min(right, Math.min(down, diagonal));
            max[0] = Math.max(max[0], ans);
        }
        return ans;
    }

    public int helperMemo(char[][] matrix, int i, int j, int[] max, int[][] dp) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (i >= m || j >= n)
            return 0;

        int right = helperMemo(matrix, i, j + 1, max, dp);
        int diagonal = helperMemo(matrix, i + 1, j + 1, max, dp);
        int down = helperMemo(matrix, i + 1, j, max, dp);

        if (matrix[i][j] == '0')
            return 0;
        else {
            dp[i][j] = 1 + Math.min(right, Math.min(down, diagonal));
            max[0] = Math.max(max[0], dp[i][j]);
        }
        return dp[i][j];
    }

    public int helperTab(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n + 1];
        int max = 0;

        for (int i = 0; i < m; i++)
            dp[i][n] = 0;

        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                int right = dp[i][j + 1];
                int diagonal = dp[i + 1][j + 1];
                int down = dp[i + 1][j];

                if (matrix[i][j] == '0')
                    dp[i][j]= 0;
                else {
                    dp[i][j] = 1 + Math.min(right, Math.min(down, diagonal));
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max*max;
    }

    public static void main(String[] args) {

    }
}
