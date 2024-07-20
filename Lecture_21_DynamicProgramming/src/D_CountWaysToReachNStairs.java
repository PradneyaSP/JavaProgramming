import java.util.Arrays;

public class D_CountWaysToReachNStairs {
    static long MOD = 100000007;
/*
    - Recursion + Memoization
    public static long helper(int n , long[] dp){
        if(n <= 1) return 1;
        if(dp[n] != -1) return dp[n];
        dp[n] = (helper(n-1, dp)+helper(n-2,dp))%MOD;
        return dp[n];
    }
    public static long countDistinctWayToClimbStair(int nStairs) {
        long[] dp = new long[nStairs+1];
        Arrays.fill(dp,-1);
        return helper(nStairs, dp);
    }

    - Tabulation
    public static long helper(int n){
		if(n==0) return 1;
		long[] dp = new long[n+1];
		Arrays.fill(dp,-1);

		dp[0] = 1;
		dp[1] = 1;

		for(int i = 2 ; i <= n ; i++){
			dp[i] = (dp[i-1]+dp[i-2])%MOD;
		}
		return dp[n];
	}
	public static long countDistinctWayToClimbStair(int nStairs) {
		return helper(nStairs);
	}
 */

    //    Space Optimisation
    public static long helper(int n) {
        if (n == 0) return 1;

        long prev2 = 1;
        long prev1 = 1;

        for (int i = 2; i <= n; i++) {
            long temp = prev1;
             prev1 = (prev1 + prev2)%MOD;
             prev2 = temp;
        }
        return prev1;
    }

    public static long countDistinctWayToClimbStair(int nStairs) {
        return helper(nStairs);
    }

    public static void main(String[] args) {
        System.out.println(countDistinctWayToClimbStair(5));
    }
}
