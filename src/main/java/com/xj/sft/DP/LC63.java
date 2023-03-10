package com.xj.sft.DP;

/**
 * @ClassName LC63
 * @Description 63. 不同路径 II
 * @Author 嘻精
 * @Date 2023/2/24 15:08
 * @Version 1.0
 */

public class LC63 {
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        
        // 障碍出现在七点或终点
        if (obstacleGrid[m - 1][n - 1] == 1 || obstacleGrid[0][0] == 1) {
            return 0;
        }
        // 初始化数组
        for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n && obstacleGrid[0][i] == 0; i++) {
            dp[0][i] = 1;
        }
        
        // 递推公式
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = (obstacleGrid[i][j] == 0) ? dp[i - 1][j] + dp[i][j - 1] : 0;
            }
        }
        return dp[m - 1][n - 1];
    }
    
    public static void main(String[] args) {
        LC63 lc63 = new LC63();
        int[][] ob = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        int res = lc63.uniquePathsWithObstacles(ob);
        System.out.println(res);
    }
}
