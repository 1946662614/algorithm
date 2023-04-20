package com.xj.sft.sorting_algorithm;

import java.util.Arrays;
import java.util.Calendar;

/**
 * @ClassName HeapSort
 * @Description 堆排序
 * @Author 嘻精
 * @Date 2023/3/17 13:54
 * @Version 1.0
 */

public class HeapSort {
    /**
     * 下沉
     * @param array
     * @param parentIndex 下沉的父节点
     * @param length 堆的大小
     */
    private static void downAdjust(int[] array, int parentIndex, int length) {
        // 1.定义temp保存父节点，用于最后赋值
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            // 2.如果有右孩子，右孩子大于左孩子的值，定位到右孩子
            if (childIndex + 1 < length && array[childIndex + 1] > array[childIndex]) {
                childIndex++;
            }
            // 3.如果父节点大于任何一个孩子的值，直接跳出
            if (temp >= array[childIndex]) {
                break;
            }
            // 单向赋值
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = childIndex * 2 + 1;
        }
        array[parentIndex] = temp;
    }
    
    /**
     * 堆排序 （升序）
     * @param array
     */
    private static void heapSort(int[] array) {
        // 1.把无序数组构建成最大堆
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            downAdjust(array, i, array.length);
        }
        System.out.println(Arrays.toString(array));
        // 2.循环删除堆顶元素，移动到集合尾部，调整堆产生新的堆顶
        for (int i = array.length - 1; i > 0; i--) {
            // 2.1第一个元素和最后一个元素交换
            int tmp = array[i];
            array[i] = array[0];
            array[0] = tmp;
            // 2.2“下沉”调整最大堆
            downAdjust(array, 0, i);
        }
    }
    
    /**
     * 堆排序练习
     */
    private static void heapSort1(int[] array) {
        // 1.把无序数组构成最大堆
        for (int i = (array.length - 2) / 2; i >= 0 ; i--) {
            downAdjust1(array, i, array.length);
        }
        System.out.println(Arrays.toString(array));
        // 2.循环删除堆顶元素，移动到集合尾部，调整产生新的堆顶
        for (int i = array.length - 1; i > 0 ; i--) {
            // 2.1第一个元素和最后一个元素交换位置
            int tmp = array[i];
            array[i] = array[0];
            array[0] = tmp;
            // 2.2“下沉”调整最大堆
            downAdjust1(array, 0, i);
        }
    }
    
    private static void downAdjust1(int[] array, int parentIndex, int length) {
        // 1.定义tmp保存父节点，用于最后赋值
        int tmp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            // 2.1如果有右孩子，右孩子大于左孩子，则定位到右孩子（下标+1）
            if (childIndex + 1 < length && array[childIndex + 1] > array[childIndex]) {
                childIndex++;
            }
            // 2.2父节点大于任何一个孩子，直接跳出
            if (tmp > array[childIndex]) {
                break;
            }
            // 赋值
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = childIndex * 2 + 1;
        }
        array[parentIndex] = tmp;
    }
    
    // 20230403堆排序练习
    private static void downAdjust2(int[] array, int parentIndex, int length) {
        // 1.定义tmp保存父节点，用于最后赋值
        int tmp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            // 2.如果有右孩子，右孩子大于左孩子，则定位到右孩子
            if (childIndex + 1 < length && array[childIndex + 1] > array[childIndex]) {
                childIndex++;
            }
            // 3.父节点大于任何一个子节点，直接跳出
            if (tmp >=array[childIndex]) {
                break;
            }
            // 赋值
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = childIndex * 2 + 1;
        }
        array[parentIndex] = tmp;
    }
    
    private static void heapSort2(int[] array) {
        // 1.把无序数组构建成最大堆
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            downAdjust2(array, i, array.length);
        }
        // 2.循环删除堆顶元素，移动到集合尾部，调整产生新的堆顶
        for (int i = array.length - 1; i > 0 ; i--) {
            int tmp = array[i];
            array[i] = array[0];
            array[0] = tmp;
            downAdjust2(array,0,i);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,6,5,7,8,9,0,10,1};
        heapSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}

