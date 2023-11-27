package com.ling3;

import java.util.Scanner;

/**
 * Scanner的基本使用
 */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数：");
        // 获取一个int类型的数据
        int i = sc.nextInt();

        System.out.println("请输入第二个整数：");
        // 获取一个int类型的数据
        int j = sc.nextInt();

        // 求和
        int k = i + j;

        //输出获取到的数据
        System.out.println("两个数的和是：" + k);
    }
}
