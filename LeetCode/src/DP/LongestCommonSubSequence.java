package DP;

import java.util.Arrays;

public class LongestCommonSubSequence {

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i < m+1; i++) {
//            System.out.println("\n" + i);
            for (int j = 1; j < n+1; j++) {
                System.out.println(Arrays.deepToString(dp));
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
//                    System.out.print(j + " ");
                    if(text1.charAt(i-1) == 'e') System.out.println((i-1 )+ " " + (j-1)+ " " +dp[i - 1][j - 1]);
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        LongestCommonSubSequence l = new LongestCommonSubSequence();
        String s1 = "abcde" , s2="ace";
        l.longestCommonSubsequence(s1,s2);
    }
}
