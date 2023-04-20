package com.xj.sft.sorting_algorithm;

import java.util.Arrays;

/**
 * @ClassName ShellSort
 * @Description 希尔排序
 * @Author 嘻精
 * @Date 2023/3/24 14:56
 * @Version 1.0
 */

public class ShellSort {
    
    private static void shellSort(int[] array) {
        // 希尔排序的增量
        int d = array.length;
        
        while (d > 1) {
            // 希尔增量方式，即每次折半
            d = d / 2;
            for (int i = 0; i < d; i++) {
                for (int j = i + d; j < array.length; j = j + d) {
                    int temp = array[j];
                    int k;
                    for (k = j - d; (k >= 0) && (array[k] > temp); k = k - d) {
                        array[k + d] = array[k];
                    }
                    array[k + d] = temp;
                }
            }
        }
    }
    
    private static void shellSort2(int[] array) {
        // 排序增量
        int d = array.length;
        while (d > 1) {
            d = d / 2;
            for (int i = 0; i < d; i++) {
                for (int j = i + d; j < array.length; j = j + d) {
                    int tmp = array[j];
                    int k;
                    for (k = j - d; (k >= 0) && (array[k] > tmp); k = k - d) {
                        array[k + d] = array[k];
                    }
                    array[k + d] = tmp;
                }
            }
        }
        
    }
    
    // 20230409希尔排序练习
    private static void shellSort3(int[] array) {
        // 排序增量
        int d = array.length;;
        while (d > 1) {
            d = d / 2;
            for (int i = 0; i < d; i++) {
                for (int j = i + 1; j < array.length; j += d) {
                    int tmp = array[j];
                    int k;
                    for (k = j - d; (k >= 0) && (array[k] > tmp); k = k - d) {
                        array[k + d] = array[k];
                    }
                    array[k + d] = tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{5,3,6,1,10,7,9,11,8};
        shellSort3(arr);
        System.out.println(Arrays.toString(arr));
    }
}
