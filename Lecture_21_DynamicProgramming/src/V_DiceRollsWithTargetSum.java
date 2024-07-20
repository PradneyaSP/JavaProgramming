import java.util.Arrays;

public class V_DiceRollsWithTargetSum {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int a : nums)
            sum += a;

        int[][] dp = new int[sum+1][nums.length+1];
        for(int[] b : dp)
            Arrays.fill(b,-1);
        // return helperRec(nums,0,0,nums.length);
        return helperMemo(nums,0,sum,nums.length,dp) == 1;
    }

    public int helperMemo(int[] nums, int sum1 , int total , int i , int[][] dp){
        if(i==0){
            if(sum1 == (total/2)) return 1;
            return 0;
        }
        if(dp[sum1][i] != -1) return dp[sum1][i];
        dp[sum1][i] =  helperMemo(nums, sum1+nums[i-1] , total , i-1,dp) | helperMemo(nums, sum1 , total , i-1,dp);
        return dp[sum1][i];
    }

    public boolean helperRec(int[] nums, int sum1 , int sum2 , int i){
        if(i==0){
            if(sum1 == sum2) return true;
            return false;
        }
        return helperRec(nums, sum1+nums[i-1] , sum2 , i-1) || helperRec(nums, sum1 , sum2+nums[i-1] , i-1);
    }

    public static void main(String[] args) {
        V_DiceRollsWithTargetSum s = new V_DiceRollsWithTargetSum();
        int[] nums = {1,2,3,5};
        System.out.println(s.canPartition(nums));
    }
}
