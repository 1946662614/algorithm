package com.xj.sft.sorting_algorithm;

import java.util.Arrays;

/**
 * @ClassName CountSort
 * @Description 计数排序
 * @Author 嘻精
 * @Date 2023/3/18 14:42
 * @Version 1.0
 */

public class CountSort {
    /**
     * 计数排序
     * @param array
     * @return
     */
    private static int[] countSort(int[] array) {
        // 1.遍历数列得到数列最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        // 2.根据数列最大值确定统计数组的长度
        int[] countArray = new int[max + 1];
        // 3.遍历数列，填充统计数组
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }
        // 4.遍历统计数组，输出结果
        int index = 0;
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sortedArray[index++] = i;
            }
        }
        return sortedArray;
    }
    
    /**
     * 计数排序练习
     * @param array
     * @return
     */
    private static int[] countSort2(int[] array) {
        // 1.遍历数组得到最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        // 2.根据最大值创建统计数组
        int[] countArray = new int[max + 1];
        // 3.填充统计数组
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }
        // 4.遍历统计数组，输出结果
        int index = 0;
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sortedArray[index++] = i;
            }
        }
        return sortedArray;
    }
    
    /**
     * 计数排序优化
     * @param array
     * @return
     */
    private static int[] countSort3(int[] array) {
        // 1.得到数列的最大值和最小值，并算出差值d
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int d = max - min;
        // 2.创建统计数组并统计对应元素的个数
        int[] countArray = new int[d + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }
        // 3.统计数组做变形，后面的元素等于前面的元素之和
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }
        // 4.倒序遍历原始数组，从统计数组找到正确的位置，输出到结果数组
        int[] sortedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0 ; i--) {
            sortedArray[countArray[array[i] - min] - 1] = array[i];
            countArray[array[i] - min]--;
        }
        return sortedArray;
    }
    
    /**
     * 排序优化练习
     * @param array
     * @return
     */
    private static int[] countSort4(int[] array) {
        // 1.得到数列的最大值和最小值并计算差值
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int d = max - min;
        // 2.创建统计数组并统计对应的元素个数
        int[] countArray = new int[d + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }
        // 3.统计数组做变形，后面的元素等于前面的元素之和
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }
        // 4.倒序遍历原始数组，从统计数组找到正确位置，输出到结果数组
        int[] sortedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0 ; i--) {
            sortedArray[countArray[array[i] - min] - 1] = array[i];
            countArray[array[i] - min]--;
        }
        return sortedArray;
    }
    
    // 20230404计数排序练习
    private static int[] countSort5(int[] array) {
        // 1.找到最大值
        int max = array[0];
        // 最小值
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int d = max - min;
        // 2.根据最大值创建统计数组长度
        int[] countArray = new int[d + 1];
        // 3.遍历原数组，填充统计数组
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }
        // 统计数组变形，后面元素等于前面元素之和
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] = countArray[i] + countArray[i - 1];
        }
        // 4.遍历统计数组，输出结果
        int index = 0;
        int[] sortedArray = new int[array.length];
        /*for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sortedArray[index++] = i;
            }
        }*/
        // 倒序遍历
        for (int i = array.length - 1; i >= 0 ; i--) {
            sortedArray[countArray[array[i] - min] - 1] = array[i];
            countArray[array[i] - min]--;
        }
        return sortedArray;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,2,6,8,4,5,7,0,10,3,9,9};
        int[] arr1 = new int[]{95,94,91,98,99,90,93,91,92,93,1};
        int[] sortedArray = countSort5(arr1);
        System.out.println(Arrays.toString(sortedArray));
    }
    
}
