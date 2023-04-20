package com.xj.sft.sorting_algorithm;

import sun.plugin2.util.BrowserType;

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
        int lastExchangeIndex = 0;
        int sortBorder = array.length - 1;
    
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
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
    
    // 20230328练习
    private static void sort4(int[] array) {
        // 最后一次交换地址
        int lastExchangeIndex = 0;
        // 无序数组边界，只需比较到这
        int sortBorder = array.length - 1;
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
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
    
    // 20230329
    private static void sort5(int[] array) {
        int lastChangeIndex = 0;
        int border = array.length - 1;
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < border; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    isSorted = false;
                    lastChangeIndex = j;
                }
            }
            border = lastChangeIndex;
            if (isSorted) {
                break;
            }
        }
    }
    
    // 20230419练习
    private static void sort6(int[] array) {
        int lastChangeIndex = 0;
        int border = array.length - 1;
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = i; j < border; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                    lastChangeIndex = j;
                }
            }
            border = lastChangeIndex;
            if (isSorted) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{2,8,4,6,7,1,3,0,9};
//        sort(array);
//        sort2(array);
        sort6(array);
        System.out.println(Arrays.toString(array));
    }
}
