package com.xj.test.sushu;

import java.util.ArrayList;

public class filter {
    public static ArrayList<Integer> get(int []arr ){
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0&&i!=2||i%3==0&&i!=3||i%5==0&&i!=5||i%7==0&&i!=7){
            }else {
                list.add(i);
            }
        }
        return list;
    }
}
