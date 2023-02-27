package com.xj.test.sushu;

public class data {
    public static int [] getData(int star,int end){
        int []arr=new int[end-star];
        for (int i = 0; i < arr.length; i++) {
            for (int j = star; j < end; j++) {
                arr[i]=j;
            }
        }
        return arr;
    }
}
