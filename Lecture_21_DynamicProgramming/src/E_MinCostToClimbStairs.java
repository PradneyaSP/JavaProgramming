//import java.util.Arrays;

public class E_MinCostToClimbStairs {
    /*
    - Recursion
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int ans = Math.min(helper(n-1,cost) , helper(n-2,cost));
        return ans;
    }

    private int helper(int n, int[] cost) {
        if(n<=1) return cost[n];
        return Math.min(helper(n-1,cost) , helper(n-2,cost)) + cost[n];
    }

    - Recursion + Memoization
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int ans = Math.min(helper(n-1,cost,dp) , helper(n-2,cost,dp));
        System.out.println(Arrays.toString(dp));
        return ans;
    }

    private int helper(int n, int[] cost, int[] dp) {
        if(n<=1) return dp[n] = cost[n];
        if(dp[n] != -1) return dp[n];
        dp[n] =  Math.min(helper(n-1,cost,dp) , helper(n-2,cost,dp)) + cost[n];
        return dp[n];
    }

    - Tabulation
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int ans = helper(n,cost);
        return ans;
    }

    private int helper(int n, int[] cost) {
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2 ; i < n ; i++){
            dp[i] =  Math.min(dp[i-1] , dp[i-2]) + cost[i];
        }
       return Math.min(dp[n-1],dp[n-2]);
    }
   */
//    Space Optimisation
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return helper(n, cost);
    }

    private static int helper(int n, int[] cost) {
        int prev2 = cost[0];
        int prev1 = cost[1];

        for (int i = 2; i < n; i++) {
            int temp = prev1;
            prev1 = Math.min(prev1,prev2) + cost[i];
            prev2 = temp;
        }
        return Math.min(prev1,prev2);
    }

    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int ans = minCostClimbingStairs(cost);
        System.out.println(ans);
    }
}
