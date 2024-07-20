import java.util.Arrays;

public class H_CutIntoSegments {
    /*
    - Problem Statement
    You are given an integer ‘N’ denoting the length of the rod.
    You need to determine the maximum number of segments you can
    make of this rod provided that each segment should be of the length 'X', 'Y', or 'Z'

    - Recursion
    public static int helper(int n, int x, int y, int z, int count) {
        // Write your code here.
        if (n < 0) return 0;
        if (n == 0) return count;

        return Math.max(helper(n - x, x, y, z, count + 1), Math.max(helper(n - y, x, y, z, count + 1), helper(n - z, x, y, z, count + 1)));
    }

    public static int cutSegments(int n, int x, int y, int z) {
        return helper(n, x, y, z, 0);
    }

    ~~~~~~~~~~~~~~~~~~~~~~~~ OR ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static int helper(int n, int x, int y, int z) {
        // Write your code here.
        if (n < 0) return Integer.MIN_VALUE;
        if (n == 0) return 0;

        int a = helper(n - x, x, y, z) + 1;
        int b = helper(n - y, x, y, z) + 1;
        int c = helper(n - z, x, y, z) + 1;
        return Math.max(a, Math.max(b, c));
    }

    public static int cutSegments(int n, int x, int y, int z) {
        int ans =  helper(n, x, y, z);
        if (ans < 0)
            return 0;
        return ans;
    }

    -Recursion + Memoization

    public static int helper(int n, int x, int y, int z , int[]dp) {
        // Write your code here.
        if (n < 0) return Integer.MIN_VALUE;
        if (n == 0) return 0;

        if(dp[n] != -1)
            return dp[n];

        int a = helper(n - x, x, y, z,dp) + 1;
        int b = helper(n - y, x, y, z,dp) + 1;
        int c = helper(n - z, x, y, z,dp) + 1;
        dp[n] =  Math.max(a, Math.max(b, c));
        return dp[n];
    }
     */
// Tabulation
    public static int cutSegments(int n, int x, int y, int z) {
        int[] dp = new int[n+1];
        dp[0] = 0;

        for(int i = 1 ; i <= n ; i++){
            int a = Integer.MIN_VALUE , b = Integer.MIN_VALUE , c = Integer.MIN_VALUE;
            if(i-x >=0)
                a = dp[i-x] + 1;
            if(i-y >=0)
                b = dp[i-y] + 1;
            if(i-z >=0)
                c = dp[i-z] + 1;
            dp[i] =  Math.max(a, Math.max(b, c));
        }
        return Math.max( dp[n],0);
    }
}
