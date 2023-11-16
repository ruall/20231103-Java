package com.ling;

/*
 * 小芳的妈妈每天给她2.5元钱，她都存起来了，但是，每当这一天是存钱的第五天或者5的倍数的时候，她都会花去6元钱，请问，经过多少天，小芳可以存到100元钱
 * */

import java.util.Random; // 生成随机数

public class Demo {
    public static void main(String[] args) {

        // 小芳的妈妈每天给她2.5元钱
        double dayMoney = 2.5;

        // 她都会存起来
        double sumMoney = 0;

        // 存到100元
        int result = 100;

        // 统计存钱天数
        int dayCount = 1;

        // 因为不知道要多少天才能存到100元，所以这里用死循环来实现，当存到100元的时候，通过break跳转语句来让循环终止
        while (true) {
            // 存钱
            sumMoney += dayMoney;

            if (sumMoney >= result) {
                break;
            }

            if (dayCount % 5 == 0) {
                sumMoney -= 6;
                System.out.println("第" + dayCount + "花了6元");
            }
            dayCount++;

            System.out.println("共存了" + sumMoney);
        }

        //输出统计天数的变量
        System.out.println("共花了" + dayCount + "天存了100元");

        /*
         *   打印正三角形
         *         A
         *        BBB
         *       CCCCC
         *      DDDDDDD
         *     EEEEEEEEE
         *    FFFFFFFFFFF
         *   GGGGGGGGGGGGG
         * */
        char[] cs = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int len = cs.length;
        for (int i = 1; i <= len; i++) {
            for (int j = i; j < len; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(cs[i - 1]);
            }
            System.out.println();
        }
        isEvenNumber(11 );
    }

    public static void isEvenNumber(int num) {
//        int num = 10;

        //判断该数据是否是偶数
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "不是偶数");
        }
    }
}
