import java.util.ArrayList;
import java.util.List;

public class TA_LongestIncreasingSubsequence {
    public int lowerBound(List<Integer> a, int target) {
        int n = a.size();
        int low = 0;
        int high = n - 1;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            if (a.get(mid) == target) return mid;
            else if (target > a.get(mid)) low = mid + 1;
            else high = mid - 1;
            mid = low + (high - low) / 2;
        }
        return mid;
    }

    public int LIS(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] > ans.get(ans.size() - 1)) ans.add(nums[i]);
            else {
                index = lowerBound(ans, nums[i]);
                ans.set(index, nums[i]);
            }
        }
        return ans.size();
    }

    public int lengthOfLIS(int[] nums) {
//        int n = nums.length;
//        int[][] dp = new int[n][n + 1];
//        for (int[] dps : dp)
//            Arrays.fill(dps, -1);
        // return helperRec(nums, 0, -1);
        // return helperMemo(nums, 0, -1, dp);
        // return helperTab(nums);
        // return helperSO(nums);
        return LIS(nums);
    }

    public int helperSO(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        int[] next = new int[n + 1];

        for (int curr = n - 1; curr >= 0; curr--) {
            for (int prev = curr - 1; prev >= -1; prev--) {
                int incl = 0, excl = 0;
                if (prev == -1 || nums[curr] > nums[prev]) incl = 1 + next[curr + 1];
                excl = next[prev + 1];
                dp[prev + 1] = Math.max(incl, excl);
            }
            System.arraycopy(dp, 0, next, 0, n + 1);
        }
        return dp[0];
    }

    public int helperTab(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n + 1][n + 1];

        for (int curr = n - 1; curr >= 0; curr--) {
            for (int prev = curr - 1; prev >= -1; prev--) {
                int incl = 0, excl = 0;
                if (prev == -1 || nums[curr] > nums[prev]) incl = 1 + dp[curr + 1][curr + 1];
                excl = dp[curr + 1][prev + 1];
                dp[curr][prev + 1] = Math.max(incl, excl);
            }
        }
        return dp[0][0];
    }

    public int helperMemo(int[] nums, int curr, int prev, int[][] dp) {
        int n = nums.length;
        if (curr == n) return 0;

        if (dp[curr][prev + 1] != -1) return dp[curr][prev + 1];
        int incl = 0;
        if (prev == -1 || nums[curr] > nums[prev]) incl = 1 + helperMemo(nums, curr + 1, curr, dp);
        int excl = helperMemo(nums, curr + 1, prev, dp);
        dp[curr][prev + 1] = Math.max(incl, excl);
        return dp[curr][prev + 1];
    }

    public int helperRec(int[] nums, int curr, int prev) {
        int n = nums.length;
        if (curr == n) return 0;

        int incl = 0;
        if (prev == -1 || nums[curr] > nums[prev]) incl = 1 + helperRec(nums, curr + 1, curr);
        int excl = helperRec(nums, curr + 1, prev);
        return Math.max(incl, excl);
    }
}
