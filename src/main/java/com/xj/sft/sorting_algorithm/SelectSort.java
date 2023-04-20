package com.xj.sft.sorting_algorithm;

import com.sun.tracing.dtrace.StabilityLevel;

import java.util.Arrays;

/**
 * @ClassName SelectSort
 * @Description 选择排序
 * @Author 嘻精
 * @Date 2023/3/22 19:16
 * @Version 1.0
 */

public class SelectSort {
    private static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // 找到每轮的最小值下标
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // 当最小值不是i时进行交换
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
    
    private static void selectSort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // 选取每轮最小值下标
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
    }
    
    // 20230407选择排序练习
    private static void selectSort3(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            if (i != minIndex) {
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,6,5,9,0,10,7,8,1};
        selectSort3(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
