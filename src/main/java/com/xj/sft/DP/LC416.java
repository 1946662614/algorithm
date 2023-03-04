package com.xj.sft.DP;

/**
 * @ClassName LC416
 * @Description 416. 分割等和子集
 * @Author 嘻精
 * @Date 2023/3/4 16:35
 * @Version 1.0
 */

public class LC416 {
    
    private boolean canPartition(int[] nums) {
        int len = nums.length;
        if (len == 0 || nums == null) {
            return false;
        }
        
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        
        int target = sum / 2;
        int[] dp = new int[target + 1];
        
        for (int i = 0; i < len; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j -nums[i]] + nums[i]);
            }
        }
        return dp[target] == target;
    }
}
