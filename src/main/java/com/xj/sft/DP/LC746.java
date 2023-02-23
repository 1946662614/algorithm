package com.xj.sft.DP;

/**
 * @ClassName LC746
 * @Description 746. 使用最小花费爬楼梯
 * @Author 嘻精
 * @Date 2023/2/22 15:47
 * @Version 1.0
 */

public class LC746 {

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[len];
    }
    
    public static void main(String[] args) {
        LC746 lc746 = new LC746();
        int[] cost = new int[]{10,15,20};
        int res = lc746.minCostClimbingStairs(cost);
        System.out.println(res);
    }

}
