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
     * 优化版2
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
    
    /**
     * 优化版3
     * @param array
     */
    private static void sort3(int[] array) {
        //记录最后一次交换的位置
        int lastExchangeIndex = 0;
        //无序数组的边界，每次只需2遍历到这个位置
        int sortBorder = array.length - 1;
    
        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    isSorted = false;
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;
            if (isSorted) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{2,8,4,6,7,1,3,0,9};
//        sort(array);
//        sort2(array);
        sort3(array);
        System.out.println(Arrays.toString(array));
    }
}
