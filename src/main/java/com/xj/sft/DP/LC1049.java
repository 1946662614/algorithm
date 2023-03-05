package com.xj.sft.DP;

/**
 * @ClassName LC1049
 * @Description 1049. 最后一块石头的重量 II
 * @Author 嘻精
 * @Date 2023/3/5 17:25
 * @Version 1.0
 */

public class LC1049 {
    
    private static int lastStoneWeightII(int[] stones) {
        int[] dp = new int[15001];
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            sum += stones[i];
        }
        int target = sum / 2;
        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - dp[target] - dp[target];
    }
    
    public static void main(String[] args) {
        int[] stone = new int[]{2,7,4,1,8,1};
        int res = lastStoneWeightII(stone);
        System.out.println(res);
    }
}
