package com.xj.sft.sorting_algorithm;

import java.util.Arrays;

/**
 * @ClassName QuickSort
 * @Description TODO
 * @Author 嘻精
 * @Date 2023/3/12 13:43
 * @Version 1.0
 */

public class QuickSort {
    
    /**
     * 快排
     * @param array
     * @param startIndex
     * @param endIndex
     */
    private static void quickSort1(int[] array, int startIndex, int endIndex ) {
        
        // 递归结束条件
        if (startIndex >= endIndex) {
            return;
        }
        
        // 得到基准元素位置
        int pivotIndex = partition(array, startIndex, endIndex);
        
        // 根据基准位置，分成两部分排序
        quickSort1(array,startIndex, pivotIndex - 1);
        quickSort1(array, pivotIndex + 1, endIndex);
    }
    
    /**
     * 双边循环法
     * @param array
     * @param startIndex
     * @param endIndex
     * @return
     */
    private static int partition(int[] array, int startIndex, int endIndex) {
        int pivot = array[startIndex];
        int left = startIndex;
        int right = endIndex;
        
        while (left != right) {
            //右指针左移
            while (left < right && array[right] > pivot) {
                right--;
            }
            // 左指针右移
            while (left < right && array[left] <= pivot) {
                left++;
            }
            // 交换左右指针
            if (left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
        array[startIndex] = array[left];
        array[left] = pivot;
        
        return left;
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{4,4,6,5,3,2,8,1};
        quickSort1(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}

