import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TC_MaximumHeightByStackingCuboids {
    public boolean check(int[]a , int[]b){
        return b[0] <= a[0] && b[1] <= a[1] && b[2] <= a[2];
    }
    public int helperSO(int[][] cuboids) {
        int n = cuboids.length;
        int[] dp = new int[n + 1];
        int[] next = new int[n + 1];

        for (int curr = n - 1; curr >= 0; curr--) {
            for (int prev = curr - 1; prev >= -1; prev--) {
                int incl = 0, excl = 0;
                if (prev == -1 || check(cuboids[curr] , cuboids[prev])) incl = cuboids[curr][2] + next[curr + 1];
                excl = next[prev + 1];
                dp[prev + 1] = Math.max(incl, excl);
            }
            System.arraycopy(dp, 0, next, 0, n + 1);
        }
        return dp[0];
    }

    public int maxHeight(int[][] cuboids) {
        int n = cuboids.length;
        for(int[] cuboid : cuboids)
            Arrays.sort(cuboid);
        Arrays.sort(cuboids, Comparator.comparingInt(arr -> arr[0]));

        return helperSO(cuboids);
    }
}
