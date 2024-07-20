import java.util.Arrays;

public class N_MinimumCostForTickets {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length];
        Arrays.fill(dp, -1);
//        return helperRec(days, costs, 0);
//        return helperMemo(days, costs, 0, dp);
        return helperTab(days, costs);
    }

    private int helperTab(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n+1];
        dp[n] = 0;

        int i;
        for (int j = n-1; j >= 0; j--) {
//        For 1 day pass
            for (i = j; i < n && days[i] <= days[j]; i++) {
            }
            int oneDayPass = costs[0] + dp[i];
//        For 7 day pass
            for (i = j; i < n && days[i] <= days[j] + 6; i++) {
            }
            int sevenDayPass = costs[1] + dp[i];
//        For 30 day pass
            for (i = j; i < n && days[i] <= days[j] + 29; i++) {
            }
            int thirtyDayPass = costs[2] + dp[i];

            dp[j] = Math.min(oneDayPass, Math.min(sevenDayPass, thirtyDayPass));

        }
        return dp[0];
    }

    private int helperMemo(int[] days, int[] costs, int index, int[] dp) {
        int n = days.length;
        if (index >= n) return 0;
//        For 1 day pass
        if (dp[index] != -1) return dp[index];
        int i;
        for (i = index; i < n && days[i] <= days[index]; i++) {
        }
        int oneDayPass = costs[0] + helperMemo(days, costs, i, dp);
//        For 7 day pass
        for (i = index; i < n && days[i] <= days[index] + 6; i++) {
        }
        int sevenDayPass = costs[1] + helperMemo(days, costs, i, dp);
//        For 30 day pass
        for (i = index; i < n && days[i] <= days[index] + 29; i++) {
        }
        int thirtyDayPass = costs[2] + helperMemo(days, costs, i, dp);

        dp[index] = Math.min(oneDayPass, Math.min(sevenDayPass, thirtyDayPass));
        return dp[index];
    }

    public int helperRec(int[] days, int[] costs, int index) {
        int n = days.length;
        if (index >= n) return 0;
//        For 1 day pass
        int i;
        for (i = index; i < n && days[i] <= days[index]; i++) {
        }
        int oneDayPass = costs[0] + helperRec(days, costs, i);
//        For 7 day pass
        for (i = index; i < n && days[i] <= days[index] + 6; i++) {
        }
        int sevenDayPass = costs[1] + helperRec(days, costs, i);
//        For 30 day pass
        for (i = index; i < n && days[i] <= days[index] + 29; i++) {
        }
        int thirtyDayPass = costs[2] + helperRec(days, costs, i);

        return Math.min(oneDayPass, Math.min(sevenDayPass, thirtyDayPass));
    }

    public static void main(String[] args) {
//        int[] days = {1, 4, 6, 7, 8, 20};
//        int[] costs = {2, 7, 15};
        int[] days = {2, 3, 5, 6, 7, 8, 9, 10, 11, 17, 18, 19, 23, 26, 27, 29, 31, 32, 33, 34, 35, 36, 38, 39, 40, 41, 42, 43, 44, 45, 47, 51, 54, 55, 57, 58, 64, 65, 67, 68, 72, 73, 74, 75, 77, 78, 81, 86, 87, 88, 89, 91, 93, 94, 95, 96, 98, 99};
        int[] costs = {5, 24, 85};
        N_MinimumCostForTickets s = new N_MinimumCostForTickets();
        System.out.println(s.mincostTickets(days, costs));
    }
}
