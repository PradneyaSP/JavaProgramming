import java.util.Arrays;

public class F_CoinChange {
    /*
    - Recursion
    public int helper(int[] coins, int amount) {
        if (amount < 0) return Integer.MAX_VALUE;
        if (amount == 0) return 0;

        int n = coins.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int x = helper(coins, amount - coins[i]);
            if(x != Integer.MAX_VALUE){
                ans = Math.min(ans,x+1);
            }
        }
        return ans;
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int ans = helper(coins, amount);
        if (ans == Integer.MAX_VALUE)
            ans = -1;
        return ans;
    }

    - Recursion + Memoization
    public int helper(int[] coins, int amount,int[] dp) {
        if (amount < 0) return Integer.MAX_VALUE;
        if (amount == 0) return 0;

        if(dp[amount] != -1)
            return dp[amount];
        int n = coins.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int x = helper(coins, amount - coins[i],dp);
            if(x != Integer.MAX_VALUE){
                ans = Math.min(ans,x+1);
            }
        }
        dp[amount] = ans;
        return ans;
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount +1];
        Arrays.fill(dp,-1);
        int ans = helper(coins, amount,dp);
        if (ans == Integer.MAX_VALUE)
            ans = -1;
        return ans;
    }
    */
//    - Tabulation

    public static int helper(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount +1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 1 ; i <= amount ; i++){
            for(int j = 0 ; j < n ; j++) {
                if (i - coins[j] >= 0 && dp[i-coins[j]] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
            }
        }
        if(dp[amount] == Integer.MAX_VALUE )
            return -1;
        return dp[amount];
    }

    public static int coinChange(int[] coins, int amount) {
        int ans = helper(coins, amount);
        if (ans == Integer.MAX_VALUE)
            ans = -1;
        return ans;
    }

    public static void main(String[] args) {
        int[] coins = {370,417,408,156,143,434,168,83,177,280,117};
        int amount = 9953;
        System.out.println(coinChange(coins,amount));
    }
}
