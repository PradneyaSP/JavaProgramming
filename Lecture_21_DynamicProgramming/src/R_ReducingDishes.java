import java.util.Arrays;

public class R_ReducingDishes {
    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
        Arrays.sort(satisfaction);
        // return helperRec(satisfaction,0,1);
//        int[][] dp = new int[n][n+1];
//        for (int[] dps : dp)
//            Arrays.fill(dps, -1);
//        return helperMemo(satisfaction, 0, 1, dp);
//        return helperTab(satisfaction);
        return helperSO(satisfaction);
    }

    public int helperSO(int[] satisfaction){
        int n = satisfaction.length;
        int[] curr = new int[n+1];
        int[] prev = new int[n+1];

        for(int index = n-2 ; index >= 0 ;index --){
            for(int time = n-1 ; time >= 1 ; time--){
                int incl = (time * satisfaction[index]) + prev[ time + 1];
                int excl = prev[time];
                curr[time] = Math.max(incl, excl);
            }
            System.out.println(Arrays.toString(curr));
            prev = curr;
        }
        return curr[1];
    }

    public int helperTab(int[] satisfaction){
        int n = satisfaction.length;
        int[][] dp = new int[n+1][n+2];

        for(int index = n-1 ; index >= 0 ;index --){
            for(int time = n ; time >= 1 ; time--){
                int incl = (time * satisfaction[index]) + dp[index + 1][ time + 1];
                int excl = dp[index + 1] [time];
                dp[index][time] = Math.max(incl, excl);
            }
        }
        return dp[0][1];
    }

    public int helperMemo(int[] satisfaction, int index, int time, int[][] dp) {
        int n = satisfaction.length;
        if (index >= n) return 0;

        if (dp[index][time] != -1) return dp[index][time];

        int incl = (time * satisfaction[index]) + helperMemo(satisfaction, index + 1, time + 1, dp);
        int excl = helperMemo(satisfaction, index + 1, time, dp);
        dp[index][time] = Math.max(incl, excl);

        return dp[index][time];
    }

    public int helperRec(int[] satisfaction, int index, int time) {
        int n = satisfaction.length;
        if (index >= n) return 0;
        int incl = (time * satisfaction[index]) + helperRec(satisfaction, index + 1, time + 1);
        int excl = helperRec(satisfaction, index + 1, time);
        return Math.max(incl, excl);
    }

    public static void main(String[] args) {
        int[] satisfaction = {4,3,2};
        R_ReducingDishes s = new R_ReducingDishes();
        System.out.println(s.maxSatisfaction(satisfaction));
    }
}
