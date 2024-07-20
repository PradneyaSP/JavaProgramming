package DP;

import java.util.Arrays;

public class OutOfBoundaryPaths {
    private int MOD = 1000000009;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove+1];
        for (int[][] dpt : dp)
            for(int[] dps : dpt)
                Arrays.fill(dps, -1);
        // return helperRec(m, n, maxMove, startRow, startColumn) % MOD;
        return helperMemo(m, n, maxMove, startRow, startColumn, dp) % MOD;
    }

    public int helperRec(int m, int n, int maxMove, int i, int j) {
        if (i >= m || j >= n || i < 0 || j < 0)
            return 1;

        if (maxMove == 0)
            return 0;

        int right = helperRec(m, n, maxMove - 1, i, j + 1) % MOD;
        int left = helperRec(m, n, maxMove - 1, i, j - 1) % MOD;
        int up = helperRec(m, n, maxMove - 1, i - 1, j) % MOD;
        int down = helperRec(m, n, maxMove - 1, i + 1, j) % MOD;

        return (right + left + up + down) % MOD;
    }

    public int helperMemo(int m, int n, int maxMove, int i, int j, int[][][] dp) {
        if (i >= m || j >= n || i < 0 || j < 0) {
            System.out.println(i + " " + j);
            return 1;
        }

        if (maxMove == 0)
            return 0;

        if(dp[i][j][maxMove] != -1)
            return dp[i][j][maxMove];

        int right = helperMemo(m, n, maxMove - 1, i, j + 1, dp) % MOD;
        int left = helperMemo(m, n, maxMove - 1, i, j - 1, dp) % MOD;
        int up = helperMemo(m, n, maxMove - 1, i - 1, j, dp) % MOD;
        int down = helperMemo(m, n, maxMove - 1, i + 1, j, dp) % MOD;

        dp[i][j][maxMove] = (right + left + up + down) % MOD;
        return dp[i][j][maxMove];
    }

    public static void main(String[] args) {
        OutOfBoundaryPaths o = new OutOfBoundaryPaths();
        System.out.println(o.findPaths(2,3,8,1,0));
    }
}
