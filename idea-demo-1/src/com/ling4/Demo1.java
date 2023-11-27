package com.ling4;

import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Random r = new Random();
        // 获取1-100之间的随机整数
        int number = r.nextInt(100) + 1;
        System.out.println("系统已经生成了一个1-100之间的整数");

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入你猜的数据：");

            int num = sc.nextInt();

            if (num < number) {
                System.out.println("你猜的数据" + num + "小了");
            } else if (num > number) {
                System.out.println("你猜的数据" + num + "大了");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}
