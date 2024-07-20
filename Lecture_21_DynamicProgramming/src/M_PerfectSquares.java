import java.util.Arrays;

public class M_PerfectSquares {
    public int numSquares(int n) {
//        int[] dp = new int[n + 1];
//        Arrays.fill(dp, -1);
//        return helperRec(n);
//        return helperMemo(n, dp);
        return helperTab(n);
    }

    public int helperRec(int n) {
        if (n == 1 || n == 0) return n;
        int ans = Integer.MAX_VALUE;
        for (int i = (int) Math.floor(Math.sqrt(n)); i > 0; i--) {
            ans = Math.min(ans, 1 + helperRec(n - (i * i)));
        }
        return ans;
    }

    public int helperMemo(int n, int[] dp) {
        if (n == 1 || n == 0) return n;
        int ans = Integer.MAX_VALUE;
        if (dp[n] != -1) return dp[n];

        for (int i = (int) Math.floor(Math.sqrt(n)); i > 0; i--) {
            ans = Math.min(ans, 1 + helperMemo(n - (i * i), dp));
        }

        dp[n] = ans;
        return dp[n];
    }

    public int helperTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int j = 2; j <= n; j++) {
            int ans = Integer.MAX_VALUE;
            for (int i = (int) Math.floor(Math.sqrt(j)); i > 0; i--) {
                ans = Math.min(ans, 1 + dp[j - (i * i)]);
            }
            dp[j] = ans;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        M_PerfectSquares s = new M_PerfectSquares();
        System.out.println(s.numSquares(22));
    }

}
