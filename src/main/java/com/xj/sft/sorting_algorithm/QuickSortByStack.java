package com.xj.sft.sorting_algorithm;

import java.rmi.MarshalException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Level;

/**
 * @ClassName QuickSortByStack
 * @Description 用非递归方法实现快排
 * @Author 嘻精
 * @Date 2023/3/15 18:07
 * @Version 1.0
 */

public class QuickSortByStack {
    public static void quickSort(int[] array, int startIndex, int endIndex) {
        // 用栈代替递归
        Stack<Map<String, Integer>> quickSortStack = new Stack<>();
        //整个数列的起止下标，以hash方式入栈
        Map rootParam = new HashMap();
        rootParam.put("startIndex",startIndex);
        rootParam.put("endIndex",endIndex);
        quickSortStack.push(rootParam);
        
        // 当栈为空时停止循环
        while (!quickSortStack.isEmpty()) {
            // 栈顶元素出栈，得到起始下标
            Map<String, Integer> param = quickSortStack.pop();
            // 得到基准元素位置
            int pivotIndex = partition(array, param.get("startIndex"), param.get("endIndex"));
            // 根据基准元素把数组分为两部分，每一部分的起止下标入栈
            if (param.get("startIndex") < pivotIndex - 1) {
                Map<String, Integer> leftParam = new HashMap<>();
                leftParam.put("startIndex", param.get("startIndex"));
                leftParam.put("endIndex", pivotIndex - 1);
                quickSortStack.push(leftParam);
            }
            if (pivotIndex + 1 < param.get("endIndex")) {
                Map<String, Integer> rightParam = new HashMap<>();
                rightParam.put("startIndex", pivotIndex + 1);
                rightParam.put("endIndex", param.get("endIndex"));
                quickSortStack.push(rightParam);
            }
        }
    }
    
    private static int partition(int[] array, int startIndex, int endIndex) {
        // 与单边循环法方式相同
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
    
    /**
     * 非递归练习
     * @param array
     * @param startIndex
     * @param endIndex
     */
    private static void quickSort2(int[] array, int startIndex, int endIndex) {
        // 1.用栈代替递归
        Stack<Map<String, Integer>> quickSortStack = new Stack<>();
        // 2.数列起始下标以hash存入栈
        Map<String, Integer> rootParam = new HashMap<>();
        rootParam.put("startIndex", startIndex);
        rootParam.put("endIndex", endIndex);
        quickSortStack.push(rootParam);
        // 3.循环
        while (!quickSortStack.isEmpty()) {
            // 3.1栈顶元素出栈，得到起始下标
            Map<String, Integer> param = quickSortStack.pop();
            // 3.2得到基准元素位置
            int pivotIndex = partition(array, param.get("startIndex"), param.get("endIndex"));
            // 3.3数组分成两半，每一部分起止下标入栈
            if (param.get("startIndex") < pivotIndex - 1) {
                Map<String, Integer> leftParam = new HashMap<>();
                leftParam.put("startIndex", param.get("startIndex"));
                leftParam.put("endIndex", pivotIndex - 1);
                quickSortStack.push(leftParam);
            }
            if (pivotIndex + 1 < param.get("endIndex")) {
                Map<String, Integer> rightParam = new HashMap<>();
                rightParam.put("startIndex", pivotIndex + 1);
                rightParam.put("endIndex", param.get("endIndex"));
                quickSortStack.push(rightParam);
            }
        }
    }
    
    // 20230402练习
    private static void quickSort3(int[] array, int startIndex, int endIndex) {
        // 1.用栈代替递归
        Stack<Map<String, Integer>> quickSortStack = new Stack<>();
        // 2.数组起始下标以hash存入栈
        Map<String ,Integer> rootParam = new HashMap<>();
        rootParam.put("startIndex", startIndex);
        rootParam.put("endIndex", endIndex);
        quickSortStack.push(rootParam);
        // 3.循环
        while (!quickSortStack.isEmpty()) {
            // 3.1栈顶元素出栈，得到起始下标
            Map<String, Integer> param = quickSortStack.pop();
            // 3.2得到基准元素位置
            int pivotIndex = partition2(array, param.get("startIndex"), param.get("endIndex"));
            // 3.3数组分成两半，每一部分的起始下标入栈
            if (param.get("startIndex") < pivotIndex - 1) {
                Map<String ,Integer> leftParam = new HashMap<>();
                leftParam.put("startIndex", param.get("startIndex"));
                leftParam.put("endIndex",pivotIndex - 1);
                quickSortStack.push(leftParam);
            }
            if (pivotIndex + 1 < param.get("endIndex")) {
                Map<String ,Integer> rightParam = new HashMap<>();
                rightParam.put("startIndex", pivotIndex + 1);
                rightParam.put("endIndex",param.get("endIndex"));
                quickSortStack.push(rightParam);
            }
            
        }
        
    }
    
    private static int partition2(int[] array, int startIndex, int endIndex) {
        // 单边循环法
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
        int[] arr = new int[]{3,5,7,2,1,9,8,8,0,4};
        quickSort3(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
