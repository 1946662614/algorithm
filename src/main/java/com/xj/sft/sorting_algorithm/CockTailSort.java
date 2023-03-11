package com.xj.sft.sorting_algorithm;

import java.util.Arrays;

/**
 * @ClassName CockTailSort
 * @Description 鸡尾酒排序
 * @Author 嘻精
 * @Date 2023/3/11 13:15
 * @Version 1.0
 */

public class CockTailSort {
    private static void sort(int[] array) {
       
        int tmp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            //奇数轮
            boolean isSorted = true;
            for (int j = i; j < array.length - i -1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
            //偶数轮
            isSorted = true;
            for (int j = array.length - i - 1; j > i ; j--) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
        }
    }
    
    
    public static void main(String[] args) {
        int[] array = new int[]{2,8,4,6,7,1,3,0,9};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
