import java.util.Arrays;

public class K_01_Knapsack_Problem {
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
//        int[][] dp = new int[n][maxWeight + 1];
//        for (int[] dpi : dp)
//            Arrays.fill(dpi, -1);
//        return helperRec(n-1, 0, weight, value, n, maxWeight);
//        return helperMem(n-1, 0, weight, value, n, maxWeight, dp);
//        return helperTab(weight, value, n, maxWeight);
        return helperSO(weight, value, n, maxWeight);
    }


    static int helperRec(int i, int currWeight, int[] weight, int[] value, int n, int maxWeight) {
        if (i == 0) {
            if (currWeight + weight[i] <= maxWeight) return value[i];
            return 0;
        }

        int incl = value[i] + helperRec(i - 1, currWeight + weight[i], weight, value, n, maxWeight);
        int excl = helperRec(i - 1, currWeight, weight, value, n, maxWeight);
        return Math.max(incl, excl);
    }

    static int helperMem(int i, int currWeight, int[] weight, int[] value, int n, int maxWeight, int[][] dp) {
        if (i == 0) {
            if (currWeight + weight[i] <= maxWeight) return value[i];
            return 0;
        }

        if (dp[i][currWeight] != -1) return dp[i][currWeight];

        int incl = 0;
//        This if condition is to avoid OutOfBound Exception on line 31
        if (weight[i] <= maxWeight - currWeight)
            incl = value[i] + helperMem(i - 1, currWeight + weight[i], weight, value, n, maxWeight, dp);
        int excl = helperMem(i - 1, currWeight, weight, value, n, maxWeight, dp);
        dp[i][currWeight] = Math.max(incl, excl);
        return dp[i][currWeight];
    }

    static int helperTab(int[] weight, int[] value, int n, int maxWeight) {
        int[][] dp = new int[n][maxWeight + 1];

        for (int j = weight[0]; j <= maxWeight; j++) {
            if (weight[0] <= maxWeight) dp[0][j] = value[0];
            else dp[0][j] = 0;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= maxWeight; j++) {
                int incl = 0;
                if (weight[i] <= j) incl = value[i] + dp[i - 1][j - weight[i]];
                int excl = dp[i - 1][j];
                dp[i][j] = Math.max(incl, excl);
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[n - 1][maxWeight];
    }

    static int helperSO(int[] weight, int[] value, int n, int maxWeight) {
        int[][] dp = new int[n][maxWeight + 1];
        int[] prev = new int [maxWeight+1];
        int[] curr = new int [maxWeight+1];

        for (int j = weight[0]; j <= maxWeight; j++) {
            if (weight[0] <= maxWeight) prev[j] = value[0];
            else prev[j] = 0;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= maxWeight; j++) {
                int incl = 0;
                if (weight[i] <= j) incl = value[i] + prev[j - weight[i]];
                int excl = prev[j];
                curr[j] = Math.max(incl, excl);
            }
            for (int k = 0 ; k <= maxWeight ; k++)
                prev[k] = curr[k];
        }
        System.out.println(Arrays.deepToString(dp));
        return curr[maxWeight];
    }

    public static void main(String[] args) {
        int[] weight = {1, 2, 4};
        int[] value = {5, 4, 8};
        int maxWeight = 5;
        int n = weight.length;
        System.out.println(knapsack(weight, value, n, maxWeight));
    }
}
