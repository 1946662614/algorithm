package com.xj.sft.sorting_algorithm;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序
 * @Author 嘻精
 * @Date 2023/3/9 16:37
 * @Version 1.0
 */

public class BubbleSort {

    private static void sort(int[] array) {
    
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    /**
     * 优化版
     * @param array
     */
    private static void sort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                int tmp;
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
                isSorted = false;
            }
            if (isSorted) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{2,4,5,8,1,6,9,0,3,7};
//        sort(array);
        sort2(array);
        System.out.println(Arrays.toString(array));
    }
}
