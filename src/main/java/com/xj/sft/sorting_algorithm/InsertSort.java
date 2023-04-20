package com.xj.sft.sorting_algorithm;

import java.util.Arrays;

/**
 * @ClassName InsertSort
 * @Description 插入排序
 * @Author 嘻精
 * @Date 2023/3/23 16:38
 * @Version 1.0
 */

public class InsertSort {
    
    private static void insertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // 当前需要被插入的元素
            int insertValue = array[i];
            // 从右向左比较元素，并且进行元素复制
            int j = i - 1;
            for (; (j >= 0) && (insertValue < array[j]); j--) {
                array[j + 1] = array[j];
            }
            // insertValue的值插入适当位置
            array[j + 1] = insertValue;
        }
    }
    
    // 20230408插入排序练习
    private static void insertSort2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // 当前需要被插入的元素
            int insertValue = array[i];
            // 从左向右比较元素，并且进行元素复制
            int j = i - 1;
            for (;(j >= 0) && (insertValue < array[j]); j--) {
                array[j + 1] = array[j];
            }
            // 插入
            array[j + 1] = insertValue;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{12,3,33,59,1,0,-1,20};
        insertSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
