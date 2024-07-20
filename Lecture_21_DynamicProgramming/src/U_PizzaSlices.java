import java.util.Arrays;

public class U_PizzaSlices {
    public int maxSizeSlices(int[] slices) {
        // int m = slices.length;
        // int x = helperRec(slices, 1, m/3);
        // int y = helperRec(slices, 0, m/3);
        // System.out.println(x + " " + y);
        // return Math.max(x,y);
        return helperTab(slices);
    }

    private int helperRec(int[] slices, int i, int n) {
        if (n == 0 || i >= slices.length)
            return 0;
        return Math.max(slices[i] + helperRec(slices, i + 2, n - 1), helperRec(slices, i + 1, n));
    }

    private int helperTab(int[] slices) {
        int m = slices.length;
        int[][] dp = new int[m][m / 3 + 2];

        for (int i = m - 3; i >= 1; m--) {
            for (int n = 0; n <= m / 3; n++) {
                dp[i][n + 1] = Math.max(slices[i] + dp[i + 2][n], dp[i + 1][n + 1]);
            }
        }

        int x = dp[0][1];

        for (int[] a : dp)
            Arrays.fill(a, 0);

        for (int i = m - 3; i >= 0; m--) {
            for (int n = 0; n <= m / 3; n++) {
                dp[i][n + 1] = Math.max(slices[i] + dp[i + 2][n], dp[i + 1][n + 1]);
            }
        }

        int y = dp[0][0];
        System.out.println(x + " " + y);
        return Math.max(x, y);
    }

    public static void main(String[] args) {
        int[] slices = {1,2,3,4,5,6};
        System.out.println();
    }
}
