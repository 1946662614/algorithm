package com.xj.sft.DP;

/**
 * @ClassName LC62
 * @Description  62. 不同路径
 * @Author 嘻精
 * @Date 2023/2/23 16:15
 * @Version 1.0
 */

public class LC62 {
    
    public int uniquePaths(int m, int n) {
     
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
    
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        
        return dp[m - 1][n - 1];
        
    }
    
    public static void main(String[] args) {
        LC62 lc62 = new LC62();
        int res = lc62.uniquePaths(3, 7);
        System.out.println(res);
    }
}
