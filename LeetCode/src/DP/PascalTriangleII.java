package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleII {
    /*
    - Recursive
    public List<Integer> getRow(int rowIndex) {
        List<Integer> curr = new ArrayList<>();
        for(int i= 0 ; i <= rowIndex ; i++ ){
            if(i==0 || i == rowIndex)
                curr.add(1);
            else
                curr.add(getRow(rowIndex-1).get(i-1) + getRow(rowIndex-1).get(i));
            System.out.println(curr + " " + rowIndex);
        }
        return curr;
    }

    - Memoization
    public List<Integer> getRow(int rowIndex) {
        int[][] dp = new int[rowIndex+1][rowIndex+1];
        for(int i = 0 ; i <= rowIndex ; i++ )
            Arrays.fill(dp[i],-1);
        int[] ans = helper(rowIndex,dp);
        List<Integer> curr = new ArrayList<>();
        for(int n : ans)
            curr.add(n);
        System.out.println(Arrays.deepToString(dp));
        return curr;
    }

    private int[] helper(int rowIndex, int[][] dp) {
        if(dp[rowIndex][0] != -1)
            return dp[rowIndex];

        for(int i = 0 ; i <= rowIndex ; i++){
            if(i== 0 || i== rowIndex )
                dp[rowIndex][i] = 1;
            else
                dp[rowIndex][i] = helper(rowIndex-1,dp)[i-1] + helper(rowIndex-1,dp)[i];
        }
        return dp[rowIndex];
    }

    - Tabulation
    public List<Integer> getRow(int rowIndex) {
        int[][] dp = new int[rowIndex + 1][rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++) {
            if (i == 0) {
                dp[0][0] = 1;
                continue;
            }
            for (int j = 0; j <= rowIndex; j++) {
                if (j == 0 || j == i) dp[i][j] = 1;
                else dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int n : dp[rowIndex])
            ans.add(n);
        return ans;
    }
    - Space Optimisation
*/
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        int[] dp = new int[rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++) {
            if (i == 0) {
                dp[0] = 1;

            } else {
                for (int j = 0; j <= rowIndex; j++) {
                    if (j == 0 || j == i) dp[j] = 1;
                    else dp[j] = ans.get(j - 1) + ans.get(j);
                }
            }
            ans.clear();
            for (int n : dp)
                ans.add(n);
        }
        return ans;
    }

    public static void main(String[] args) {
        PascalTriangleII p = new PascalTriangleII();
        System.out.println(p.getRow(3));
    }
}
