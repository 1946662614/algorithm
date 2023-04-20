package com.xj.sft.sorting_algorithm;

import javafx.scene.chart.LineChart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @ClassName BucketSort
 * @Description 桶排序
 * @Author 嘻精
 * @Date 2023/3/20 18:00
 * @Version 1.0
 */

public class BucketSort {
    /**
     * 桶排序
     * @param array
     * @return
     */
    private static double[] bucketSort(double[] array) {
        // 1.得到数列的最大值和最小值，并算出差值
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        // 差值
        double d = max - min;
        
        // 2.初始化桶
        // 桶个数为元素个数
        int bucketNum = array.length;
        ArrayList<LinkedList<Double>> bucketList = new ArrayList<>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketList.add(new LinkedList<>());
        }
        
        // 3.遍历原始数组，将每个元素放入桶中
        for (int i = 0; i < array.length; i++) {
            int num = (int) ((array[i] - min) * (bucketNum - 1) / d);
            bucketList.get(num).add(array[i]);
        }
        // 4.对每个桶内部进行排序
        for (int i = 0; i < bucketList.size(); i++) {
            Collections.sort(bucketList.get(i));
        }
        
        // 5.输出全部元素
        double[] sortedArray = new double[array.length];
        int index = 0;
        for (LinkedList<Double> list : bucketList) {
            for (double element : list) {
                sortedArray[index] = element;
                index++;
            }
        }
        return sortedArray;
    }
    
    private static double[] bucketSort2(double[] array) {
        // 1.最大值最小值，差值
        double max = array[0];
        double min = array[0];
    
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        double d = max - min;
        // 2.初始化桶
        int bucketNum = array.length;;
        ArrayList<LinkedList<Double>> bucketList = new ArrayList<>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketList.add(new LinkedList<Double>());
        }
        // 3.遍历原始数组，将每个元素放入桶中
        for (int i = 0; i < array.length; i++) {
            int num = (int) ((array[i] - min) * (bucketNum - 1) / d);
            bucketList.get(num).add(array[i]);
        }
        // 4.对每个桶内部进行排序
        for (int i = 0; i < bucketList.size(); i++) {
            Collections.sort(bucketList.get(i));
        }
        // 5.输出全部元素
        double[] sortedArray = new double[array.length];
        int index = 0;
        for (LinkedList<Double> list : bucketList) {
            for (double ele : list) {
                sortedArray[index++] = ele;
            }
        }
        return sortedArray;
    }
    
    // 20230405桶排序练习
    private static double[] sort3(double[] array) {
        // 1.计算最大值最小值，差值
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        double d = max - min;
        // 2.初始化桶
        int bucketNum = array.length;
        ArrayList<LinkedList<Double>> bucketList = new ArrayList<>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketList.add(new LinkedList<Double>());
        }
        // 3.遍历原始数组，将每个元素放入桶中
        for (int i = 0; i < array.length; i++) {
            int num = (int) ((array[i] - min) * (bucketNum - 1) / d);
            bucketList.get(num).add(array[i]);
        }
        // 4.对每个桶内部进行排序
        for (int i = 0; i < bucketList.size(); i++) {
            Collections.sort(bucketList.get(i));
        }
        // 5.输出全部元素
        double[] sortedArray = new double[array.length];
        int index = 0;
        for (LinkedList<Double> list : bucketList) {
            for (Double ele : list) {
                sortedArray[index++] = ele;
            }
        }
        return sortedArray;
    }
    
    public static void main(String[] args) {
        double[] arr = new double[]{4.12,6.421,0.0023,2.123,8.133,4.155,10.08};
        double[] res = sort3(arr);
        System.out.println(Arrays.toString(res));
    }
}
