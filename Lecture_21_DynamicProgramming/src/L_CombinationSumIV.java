import java.util.Arrays;

public class L_CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);
//        return helperRec(nums, target);
//        return helperMemo(nums,target,dp);
        return helperTab(nums, target);
    }

    public int helperRec(int[] nums, int target) {
        if (target == 0) return 1;
        if (target < 0) return 0;
        int ans = 0;
        for (int num : nums) {
            ans += helperRec(nums, target - num);
        }
        return ans;
    }

    public int helperMemo(int[] nums, int target, int[] dp) {
        if (target == 0) return 1;
        if (target < 0) return 0;

        if (dp[target] != -1)
            return dp[target];
        int ans = 0;
        for (int num : nums) {
            ans += helperMemo(nums, target - num, dp);
        }
        dp[target] = ans;
        return dp[target];
    }

    public int helperTab(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            for (int num : nums) {
                if (i - num >= 0)
                    dp[i] += dp[i - num];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        L_CombinationSumIV s = new L_CombinationSumIV();
        int[] nums = {1, 2, 3};
        int target = 4;
        System.out.println(s.combinationSum4(nums, target));
    }
}
