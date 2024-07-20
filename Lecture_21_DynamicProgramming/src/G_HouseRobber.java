public class G_HouseRobber {
    /*
    - Recursion
        class Solution {
            public int helper(int[] nums , int n){
                if(n < 0) return 0;
                if(n == 0) return nums[0];

                return Math.max(helper(nums,n-1) , helper(nums,n-2) + nums[n]);
            }
            public int rob(int[] nums) {
                int n = nums.length;
                return helper(nums,n-1);
            }
        }
    - Recursion + Memoization
         class Solution {
            public int helper(int[] nums , int n, int[] dp){
                if(n < 0) return 0;
                if(n == 0) return nums[0];

                if(dp[n] != -1)
                    return dp[n];

                dp[n] = Math.max(helper(nums,n-1,dp) , helper(nums,n-2,dp) + nums[n]);
                return dp[n];
            }
            public int rob(int[] nums) {
                int n = nums.length;
                int[] dp = new int [n];
                Arrays.fill(dp , -1);

                return helper(nums,n-1 , dp);
            }
        }
    - Tabulation
        class Solution {
            public int rob(int[] nums) {
                int n = nums.length;
                int[] dp = new int [n+1];

                dp[0] = 0;
                dp[1] = nums[0];

                for(int i = 2 ; i <= n ; i++){
                    dp[i] = Math.max(dp[i-1] , dp[i-2] + nums[i-1]);
                }
                return dp[n];
            }
        }
     */
//   - Space Optimisation
    public static int rob(int[] nums) {
        int n = nums.length;
        int prev2 = 0;
        int prev1 = nums[0];

        for(int i = 2 ; i <= n ; i++){
            int curr = Math.max(prev1 , prev2 + nums[i-1]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,4,3,3,4};
        System.out.println(rob(nums));
    }
}
