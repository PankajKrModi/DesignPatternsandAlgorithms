package DynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1="abcde", s2="fgh";
        int n=s1.length(), m=s2.length();
        int dp[][] = new int[n][m];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        System.out.println(lcs(s1,s2,0,0,dp));
    }

    private static int lcs(String s1, String s2, int i, int j, int[][] dp) {
        if (i >= s1.length() || j >= s2.length())
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = 1 + lcs(s1, s2, i + 1, j + 1, dp);
        } else {
            dp[i][j] = Math.max(lcs(s1, s2, i + 1, j, dp), lcs(s1, s2, i, j + 1, dp));
        }

        return dp[i][j];
    }
}
