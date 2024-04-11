package DynamicProgramming;

import java.util.Arrays;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {

        String s = "bacdcbadb";
        int[][] dp = new int[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(dp[i],-1);
        }

        int maxLength =0;
        // odd palindrome
        for (int i = 0; i < s.length(); i++) {
            traverse(s,i,i,dp);
        }
        //even length palindrome
        for (int i = 0; i < s.length(); i++) {
            traverse(s,i,i+1,dp);
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                max = Math.max(dp[i][j],max);
            }
        }
        System.out.println(max);
    }

    private static int traverse(String s, int left, int right, int[][]dp) {

        if(left<0 || right>=s.length()) return 0;
        if(dp[left][right]!=-1) return dp[left][right];
        if(left==right){
            dp[left][right] =  1 + traverse(s,left-1,right+1,dp);
        }
        else if(s.charAt(left)==s.charAt(right)){
            dp[left][right] = 2+traverse(s,left-1,right+1,dp);
        }else{
            dp[left][right] = Math.max(traverse(s,left-1,right,dp),traverse(s,left,right+1,dp));
        }
        return dp[left][right];

    }
}
