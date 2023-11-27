package com.ling4;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        //生成随机数
        Random r = new Random();

        // int nextInt(int bound) 获取一个int类型的随机数，参数bound表示获取到的随机数在【0.bound]之间
        int i = r.nextInt(10);
        System.out.println(i);
    }
}
