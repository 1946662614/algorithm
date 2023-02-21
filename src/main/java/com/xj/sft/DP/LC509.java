package com.xj.sft.DP;



/**
 * @ClassName LC509
 * @Description 509. 斐波那契数
 * @Author 嘻精
 * @Date 2023/2/20 11:47
 * @Version 1.0
 */

public class LC509 {
 
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
        
    }
    
    public static void main(String[] args) {
        LC509 lc509 = new LC509();
        int n = 4;
        System.out.println(lc509.fib(n));
    }
    
}
