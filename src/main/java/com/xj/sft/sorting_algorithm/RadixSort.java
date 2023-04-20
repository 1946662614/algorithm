package com.xj.sft.sorting_algorithm;

import java.util.Arrays;

/**
 * @ClassName RadixSort
 * @Description 基数排序
 * @Author 嘻精
 * @Date 2023/3/26 13:31
 * @Version 1.0
 */

public class RadixSort {
    // ASCII码取值范围
    public static final int ASCII_RANGE = 128;
    
    private static String[] radixSort(String[] array, int maxLength) {
        // 排序后的数组，用于存储每一次按位排序的临时结果
        String[] sortedArray = new String[array.length];
        // 从个位开始比较，一直比较到最高位
        for (int k = maxLength - 1; k >= 0; k--) {
           // 计数排序
           // 1.创建统计数组
           int[] count = new int[ASCII_RANGE];
            for (int i = 0; i < array.length; i++) {
                // 获取字符串对应的ASCII码
                int index = getCharIndex(array[i] ,k);
                count[index]++;
            }
            // 2.统计数组做变形，后面的元素等于前面的元素之和
            for (int i = 1; i < count.length; i++) {
                count[i] = count[i] + count[i - 1];
            }
            // 3.倒序遍历数组
            for (int i = array.length - 1; i >= 0; i--) {
                // 获取字符串对应的ASCII码
                int index = getCharIndex(array[i] ,k);
                int sortedIndex = count[index] - 1;
                sortedArray[sortedIndex] = array[i];
                count[index]--;
            }
            // 下一轮需要上一轮为基础，把结果赋值给array
            array = sortedArray.clone();
            
        }
        return array;
    }
    
    // 获取字符串第k位字符对应的ASCII码序号
    private static int getCharIndex(String str ,int k) {
        // 字符串长度小于k，直接返回0
        if (str.length() < (k + 1)) {
            return 0;
        }
        return str.charAt(k);
    }
    
    // 练习
    private static String[] radixSort1(String[] array, int maxLength) {
        // 创建临时数组，用于储存每次排序的临时结果
        String[] sortedArray = new String[array.length];
        // 从个位开始比较
        for (int k = array.length - 1; k >= 0; k--) {
    
            // 计数排序
            // 1.创建统计数组
            int[] count = new int[ASCII_RANGE];
            for (int i = 0; i < array.length; i++) {
                int index = getCharIndex1(array[i], k);
                count[index]++;
            }
            // 2.统计数组变形
            for (int i = 1; i < count.length; i++) {
                count[i] = count[i] + count[i - 1];
            }
            // 3.倒序遍历
            for (int i = array.length - 1; i >= 0 ; i--) {
                int index = getCharIndex1(array[i], k);
                int sortedIndex = count[index] - 1;
                sortedArray[sortedIndex] = array[i];
                count[index]--;
            }
            array = sortedArray.clone();
        }
        return array;
    }
    
    private static int getCharIndex1(String str, int k) {
        if (str.length() < (k + 1)) {
            return 0;
        }
        return str.charAt(k);
    }
    
    // 20230413基数排序练习
    private static String[]  radixSort3(String[] array, int maxLength) {
        // 存储每一次按位排序的临时结果
        String[] sortedArray = new String[array.length];
        // 从个位开始比较，一直比较到最高位
        for (int k = maxLength - 1; k >= 0 ; k--) {
            // 计数排序
            //1.创建统计数组
            int[] count = new int[ASCII_RANGE];
            for (int i = 0; i < array.length; i++) {
                int index = getCharIndex2(array[i], k);
                count[index]++;
            }
            //2.统计数组变形，
            for (int i = 1; i < count.length; i++) {
                count[i] = count[i] + count[i - 1];
            }
            //3.倒序遍历数组
            for (int i = array.length - 1; i >= 0 ; i--) {
                int index = getCharIndex2(array[i], k);
                int sortedIndex = count[index] - 1;
                sortedArray[sortedIndex] = array[i];
                count[index]--;
            }
            array = sortedArray.clone();
            
        }
        return array;
        
    }
    
    private static int getCharIndex2(String str, int k) {
        if (str.length() < (k + 1)) {
            return 0;
        }
        return str.charAt(k);
    }
    
    
    public static void main(String[] args) {
        String[] array = {"qd,","abc","qwe", "hhh", "a", "cws","ope"};
        System.out.println(Arrays.toString(radixSort3(array,3)));
    }
}
