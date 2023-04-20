package com.xj.sft.sorting_algorithm;

import com.sun.javafx.robot.FXRobotImage;

import java.util.Arrays;
import java.util.Scanner;

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
        int pivotIndex = partition1(array, startIndex, endIndex);
        
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
    
    /**
     * 单边循环法
     * @param array
     * @param startIndex
     * @param endIndex
     * @return
     */
    private static int partition1(int[] array, int startIndex, int endIndex) {
        int pivot = array[startIndex];
        int mark = startIndex;
    
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (array[i] < pivot) {
                mark++;
                int tmp = array[i];
                array[i] = array[mark];
                array[mark] = tmp;
            }
        }
        
        array[startIndex] = array[mark];
        array[mark] = pivot;
        return mark;
    }
    
    private static void sort2(int[] array, int startIndex, int endIndex) {
        
        // 递归结束条件
        if (startIndex >= endIndex) {
            return;
        }
        int partition = partition3(array, startIndex, endIndex);
        sort2(array, startIndex, partition - 1);
        sort2(array, partition + 1, endIndex);
    }
    
    /**
     * 练习双指针法
     * @param array
     * @param startIndex
     * @param endIndex
     * @return
     */
    private static int partition2(int[] array, int startIndex, int endIndex) {
        int pivot = array[startIndex];
        int left = startIndex;
        int right = endIndex;
        
        while (left != right) {
            if (left < right && array[right] > pivot) {
                right--;
            }
    
            if (left < right && array[left] <= pivot) {
                left++;
            }
    
            if (left < right) {
                int tmp = array[right];
                array[right] = array[left];
                array[left] = tmp;
            }
        }
        
        array[startIndex] = array[left];
        array[left] = pivot;
        
        return left;
        
    }
    
    /**
     * 单指针循环法练习
     * @param array
     * @param startIndex
     * @param endIndex
     * @return
     */
    private static int partition3(int[] array, int startIndex, int endIndex) {
        int pivot = array[startIndex];
        int mark = startIndex;
        for (int i = startIndex; i <= endIndex; i++) {
            if (array[i] < pivot) {
                mark++;
                int tmp = array[i];
                array[i] = array[mark];
                array[mark] = tmp;
            }
        }
        array[startIndex] = array[mark];
        array[mark] = pivot;
        return mark;
    }
    
    
    // 20230331双指针循环法练习
    private static void quickSort2(int[] array, int startIndex, int endIndex) {
        // 递归结束条件
        if (startIndex >= endIndex) {
            return;
        }
        // 得到基准元素
        int pivotIndex = partition5(array, startIndex, endIndex);
        
        // 根据基准元素，将数组分为两部分排序
        quickSort2(array, startIndex, pivotIndex - 1);
        quickSort2(array, pivotIndex + 1, endIndex);
        
    }
    
    private static int partition4(int[] array, int startIndex, int endIndex) {
        int pivot = array[startIndex];
        int left = startIndex;
        int right = endIndex;
        
        
        while (left != right) {
            while (left < right && array[right] > pivot) {
                right--;
            }
            while (left < right && array[left] <= pivot) {
                left++;
            }
            
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
    
    // 20230401单边循环法练习
    private static int partition5(int[] array, int startIndex, int endIndex) {
        int pivot = array[startIndex];
        int mark = startIndex;
        for (int i = startIndex; i <= endIndex; i++) {
            if (array[i] < pivot) {
                mark++;
                int tmp = array[i];
                array[i] = array[mark];
                array[mark] = tmp;
            }
        }
        array[startIndex] = array[mark];
        array[mark] = pivot;
        return mark;
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{4,4,6,5,3,2,8,1};
        quickSort2(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}

