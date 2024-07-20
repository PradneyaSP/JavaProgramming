import java.util.Arrays;

public class Q_MinSidewaysJump {
    public int minSideJumps(int[] obstacles) {
        int m = obstacles.length;
        int[][] dp = new int[m][4];
        for (int[] dps : dp)
            Arrays.fill(dps, -1);
//        return helperRec(obstacles, 0, 2);
        return helperMemo(obstacles, 0, 2, dp);
    }

    public int helperTab(int[] obstacles){
        int n = obstacles.length-1;
        int[][] dp = new int[n][4];

        for(int i = n-1 ; i >= 0 ; i--){
            for(int currlane = 1 ; currlane <= 3 ; currlane++){
                if (obstacles[i + 1] == currlane) {
                    int ans = Integer.MAX_VALUE;
                    for (int lane = 1; lane <= 3; lane++) {
                        if (currlane != lane && obstacles[i] != lane) ans = Math.min(ans, dp[i][lane+1]);
                    }
                    dp[i][currlane]= ans + 1;
                } else dp[i][currlane] = dp[ i + 1][ currlane];
            }
        }
        return Math.min(dp[0][2] , 1 + Math.min(dp[0][1] , dp[0][3]));
    }

    public int helperRec(int[] obstacles, int i, int curr) {
        int m = obstacles.length;
        if (i == m - 1) return 0;
        if (obstacles[i + 1] == curr) {
            int ans = Integer.MAX_VALUE;
            for (int lane = 1; lane <= 3; lane++) {
                if (curr != lane && obstacles[i] != lane) ans = Math.min(ans, helperRec(obstacles, i, lane));
            }
            return ans + 1;
        } else return helperRec(obstacles, i + 1, curr);
    }

    public int helperMemo(int[] obstacles, int i, int curr, int[][] dp) {
        int m = obstacles.length;
        if (i == m - 1) return 0;

        if(dp[i][curr] != -1 ) return dp[i][curr];
        if (obstacles[i + 1] == curr) {
            int ans = Integer.MAX_VALUE;
            for (int lane = 1; lane <= 3; lane++) {
                if (curr != lane && obstacles[i] != lane) ans = Math.min(ans, helperMemo(obstacles, i, lane, dp));
            }
            dp[i][curr] = ans + 1;
        } else {
            dp[i][curr] = helperMemo(obstacles, i + 1, curr, dp);
        }

        return dp[i][curr];
    }

    public static void main(String[] args) {
        int[] obstacles = {0, 1, 2, 3, 0};
        Q_MinSidewaysJump m = new Q_MinSidewaysJump();
        System.out.println(m.minSideJumps(obstacles));
    }
}
