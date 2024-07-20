package DP;

public class KInversePairs {
    int MOD = 1000000007;
    public int kInversePairs(int n, int k) {
        int[][] dp = new int[n+1][k+1];
        for(int i = 0 ; i <= n ; i++){
            for(int j = 0 ; j <= k ; j++ )
                dp[i][j] = -1;
        }
        return f(n,k,dp);
    }

    private int f(int n , int k , int[][] dp){
        if(n == 1){
            if(k==0)
                return 1;
            return 0;
        }

        if(k<0) return 0;

        if(dp[n][k] != -1)
            return dp[n][k];

        dp[n][k] = (f(n-1,k,dp)+f(n,k-1,dp)) % MOD;
        dp[n][k] = (dp[n][k] + f(n-1,k-n,dp)) % MOD;

        if(dp[n][k]<0)
            dp[n][k] += MOD;
        return dp[n][k];
    }

    public static void main(String[] args) {
        KInversePairs s = new KInversePairs();
        System.out.println(s.kInversePairs(3,1));
    }
}
