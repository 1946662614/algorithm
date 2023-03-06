package com.xj.sft.DP;

/**
 * @ClassName LC494
 * @Description 494. 目标和
 * @Author 嘻精
 * @Date 2023/3/6 16:49
 * @Version 1.0
 */

public class LC494 {
    
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        
        if (target < 0 && sum < -target) {
            return 0;
        }
        if ((target + sum) % 2 != 0) {
            return 0;
        }
        
        int size = (target + sum) / 2;
        if (size < 0) {
            size = -size;
        }
        
        int[] dp = new int[size + 1];
        dp[0] = 1;
    
        for (int i = 0; i < nums.length; i++) {
            for (int j = size; j >= nums[i] ; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[size];
    }
    
    public static void main(String[] args) {
    
    }
}
