package com.xj.test.sushu;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入筛选数素的开始数字");
        int star = sc.nextInt();
        System.out.println("请输入筛选数素的结束数字");
        int end =sc.nextInt();
        ArrayList<Integer> list = filter.get(data.getData(star, end));
        System.out.println(list);
    }
}
