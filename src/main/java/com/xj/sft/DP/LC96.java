package com.xj.sft.DP;

/**
 * @ClassName LC96
 * @Description 96. 不同的二叉搜索树
 * @Author 嘻精
 * @Date 2023/2/28 16:00
 * @Version 1.0
 */

public class LC96 {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
            
        }
        return dp[n];

    }
    
    public static void main(String[] args) {
    
    }
}
