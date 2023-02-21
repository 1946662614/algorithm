package com.xj.sft.DP;

/**
 * @ClassName LC70
 * @Description 70. 爬楼梯
 * @Author 嘻精
 * @Date 2023/2/21 11:03
 * @Version 1.0
 */

public class LC70 {
    
    public int climbStairs (int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
    
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
        LC70 lc70 = new LC70();
        int n = 10;
        int res = lc70.climbStairs(n);
        System.out.println(res);
    }
}
