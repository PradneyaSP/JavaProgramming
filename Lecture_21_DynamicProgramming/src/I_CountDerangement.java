import java.util.Arrays;

public class I_CountDerangement {
    /*
    A Derangement is a permutation of ‘N’ elements, such that no element appears in its original position.
    For example, an instance of derangement of {0, 1, 2, 3} is {2, 3, 1, 0}, because 2 present at index 0
    is not at its initial position which is 2 and similarly for other elements of the sequence.
    Given a number ‘N’, find the total number of derangements possible of a set of 'N’ elements.
    Note: The answer could be very large, output answer %(10 ^ 9 + 7).

    Approach :
     Suppose f(n) represents the derangement of 'n' elements {0,1,....,n-1}. Choosing the first index '0',
     we can say that it can be placed at (n-1) different positions in the permutation. Hence, the answer
     will be (n-1)* (total sub problems). Let's say we place the '0' at ith position. Then there will be
     2 possibilities. 'i' swaps with '0' or 'i' does not swap with '0'. In the first possibility, there's
     n-2 positions and n-2 elements. Hence, it is f(n-2) . In the second case, 'i' is not placed at index 0.
     Hence, it is f(n-1) as the n-1 elements and n-1 positions.

     Therefore, the recursive equation becomes : f(n) = (n-1)*(f(n-2)+f(n-1))

    - Recursion
    public static long countDerangements(int n) {
        if(n == 1) return 0;
        return n + countDerangements(n-1);
    }

    - Recursion + Memoization
        private static final int MOD = 1000000007;
        public static long countDerangements(int n) {
            long[] dp = new long[n+1];
            Arrays.fill(dp,-1);
            return helper(n, dp);
        }
        public static long helper(int n , long[]dp) {
            if(n<=1) return 0;
            if(n == 2) return 1;
            if(dp[n] != -1) return dp[n];
            dp[n] =  (n-1) *( helper(n-1,dp) + helper(n-2,dp))%MOD;
            return dp[n];
        }

    - Tabulation
         private static final int MOD = 1000000007;
        public static long countDerangements(int n) {
            long[] dp = new long[n+1];
            Arrays.fill(dp,-1);
            dp[0] = 0;
            dp[1] = 0;
            dp[2] = 1;
            for(int i = 3 ; i <=n ; i++){
                dp[i] = (i-1) * (dp[i-1] + dp[i-2])%MOD;
            }
            return dp[n];
        }
     */
//    Space Optimisation
    private static final int MOD = 1000000007;

    public static long countDerangements(int n) {
        long prev1 = 1;
        long prev2 = 0;
        for(int i = 3 ; i <=n ; i++){
            long curr = (i-1)*(prev1+prev2)%MOD;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        System.out.println(countDerangements(4));
    }
}
