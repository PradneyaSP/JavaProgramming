import java.util.Arrays;

public class P_MinScoreTriangulationOfPolygon {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];
        for (int[] dps : dp)
            Arrays.fill(dps, -1);
        // return helperRec(values, 0, n-1);
//        int ans = helperMemo(values, 0, n - 1, dp);
//        System.out.println(Arrays.deepToString(dp));
//        return ans;
        return helperTab(values);
    }

    public int helperRec(int[] values, int i, int j) {
        if (i + 1 >= j)
            return 0;
        int min = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            int ans = values[i] * values[j] * values[k] + helperRec(values, i, k) + helperRec(values, k, j);
            min = Math.min(ans, min);
        }
        return min;
    }

    public int helperMemo(int[] values, int i, int j, int[][] dp) {
        if (i + 1 >= j)
            return 0;
        int min = Integer.MAX_VALUE;

        if (dp[i][j] != -1)
            return dp[i][j];

        for (int k = i + 1; k < j; k++) {
            int ans = values[i] * values[j] * values[k] + helperMemo(values, i, k, dp) + helperMemo(values, k, j, dp);
            min = Math.min(ans, min);
        }
        dp[i][j] = min;
        return dp[i][j];
    }

    public int helperTab(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (i + 1 >= j)
                    dp[i][j] = 0;
        }

        for (int i = n-1; i >= 0; i--) {
            for (int j = i+2; j < n ; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    int ans = values[i] * values[j] * values[k] + dp[i][k] + dp[k][j];
                    min = Math.min(ans, min);
                }
                dp[i][j] = min;
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[0][n-1];
    }

    public static void main(String[] args) {
        int[] values = {3,7,4,5};
        P_MinScoreTriangulationOfPolygon t = new P_MinScoreTriangulationOfPolygon();
        System.out.println(t.minScoreTriangulation(values));
    }
}
