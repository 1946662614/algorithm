package com.xj.sft.DP;

/**
 * @ClassName LC343
 * @Description 343. 整数拆分
 * @Author 嘻精
 * @Date 2023/2/27 21:49
 * @Version 1.0
 */

public class LC343 {
    
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                dp[i] = Math.max(dp[i],(Math.max((i - j) * j, dp[i - j] * j)));
            }
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
        LC343 lc343 = new LC343();
        int n = 3;
        int res = lc343.integerBreak(n);
        System.out.println(res);
    }
}
