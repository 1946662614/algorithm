package com.xj.sft.sorting_algorithm;

import java.util.Arrays;

/**
 * @ClassName MergeSort
 * @Description 归并排序
 * @Author 嘻精
 * @Date 2023/3/25 13:50
 * @Version 1.0
 */

public class MergeSort {
    public static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            // 折半成两个小集合，分别进行递归
            int mid = (start + end) / 2;
            mergeSort(array,start,mid);
            mergeSort(array,mid + 1, end);
            // 吧两个有序小集合，归并成一个大集合
            merge(array, start, mid, end);
        }
    }
    
    private static void merge(int[] array, int start, int mid, int end) {
        // 1.开辟额外的大集合，设置指针
        int[] tempArray = new int[end - start + 1];
        int p1 = start;
        int p2 = mid + 1;
        int p = 0;
        // 2.比较两个小集合的元素，依次放入大集合
        while ((p1 <= mid) && (p2 <= end)) {
            if (array[p1] <= array[p2]) {
                tempArray[p++] = array[p1++];
            }
            else {
                tempArray[p++] = array[p2++];
            }
        }
        // 3.1左侧小集合还有剩余元素，依次放入大集合的尾部
        while (p1 <= mid) {
            tempArray[p++] = array[p1++];
        }
        // 3.2右侧小集合还有剩余元素，依次放入大集合的尾部
        while (p2 <= end) {
            tempArray[p++] = array[p2++];
        }
        // 4.把大集合元素复制回原数组
        for (int i = 0; i < tempArray.length; i++) {
            array[i + start] = tempArray[i];
        }
    }
    
    // 练习
    private static void mergeSort1(int[] array, int start, int end) {
        if (start < end) {
            // 折半
            int mid = (start + end) / 2;
            // 递归
            mergeSort1(array, start, mid);
            mergeSort1(array,mid + 1, end);
            // 两个小集合归并成一个大集合
            merge1(array,start,mid,end);
        }
    }
    
    private static void merge1(int[] array, int start, int mid, int end) {
        // 1.开辟额外的大集合，设置指针
        int[] tempArray = new int[end - start + 1];
        int p1 = start;
        int p2 = mid + 1;
        int p = 0;
        // 2.小集合元素，依次放入大集合
        while ((p1 <= mid) && (p2 <= end)) {
            if (array[p1] <= array[p2]) {
                tempArray[p++] = array[p1++];
            } else {
                tempArray[p++] = array[p2++];
            }
        }
        // 3.1
        while (p1 <= mid) {
            tempArray[p++] = array[p1++];
        }
        while (p2 <= end) {
            tempArray[p++] = array[p2++];
        }
        // 4.大集合复制回原数组
        for (int i = 0; i < tempArray.length; i++) {
            array[i + start] = tempArray[i];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{5,8,6,3,9,2,1,7};
        mergeSort1(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
