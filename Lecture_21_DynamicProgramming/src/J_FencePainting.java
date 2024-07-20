// Java program for Painting Fence Algorithm

import java.util.*;

public class J_FencePainting {
    /*
        - Recursion
        public static int numberOfWays(int n, int k) {
            if(n==1) return k;
            if(n==2) return k*k;
            // Write your code here.
            int diff = (k-1) * numberOfWays(n-1, k);
            int same = (k-1)* numberOfWays(n-2, k);
            // System.out.println(same + " " + diff);
            int mod = 1000000007;
            return (same + diff)% mod;
        }

        - Recursion + Memoization
        public static int numberOfWays(int n , int k){
            int[] dp = new int[n+1];
            Arrays.fill(dp,-1);
            return helper(n,k,dp);
        }

        private static int helper(int n, int k, int[] dp) {
            int mod = 1000000007;
            if(n==1) return k%mod;
            if(n==2) return (k*k)%mod;

            if(dp[n] != -1) return dp[n];
            int diff = ((k-1)*helper(n-1,k,dp))%mod;
            int same = ((k-1)*helper(n-2,k,dp))%mod;
            dp[n] = (same + diff)%mod;
            return dp[n];
        }

        - Tabulation
    public static int numberOfWays(int n, int k) {
        int mod = 1000000007;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[1] = k % mod;
        dp[2] = (k * k) % mod;
        for(int i = 3 ; i <= n ; i++){
            int same = ((k-1)*dp[i-2])%mod;
            int diff = ((k-1)*dp[i-1])%mod;
            dp[i] = (same+diff)%mod;
        }
        return dp[n];
    }
    */

    //  Space Optimisation
    public static int numberOfWays(int n, int k) {
        int mod = 1000000007;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int prev2 = k % mod;
        int prev1 = (k * k) % mod;
        for (int i = 3; i <= n; i++) {
            int same = ((k - 1) * prev2) % mod;
            int diff = ((k - 1) * prev1) % mod;
            prev2 = prev1;
            prev1 = (same + diff) % mod;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int ans = numberOfWays(3, 3);
        System.out.println(ans);
    }
}

