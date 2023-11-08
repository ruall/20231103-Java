package com.ling;

public class Variable {
    public static void main(String[] args) {
/*        int price = 999;
        System.out.println(price);
        price = 888;
        System.out.println(price);*/
        double price = 3599.00;
        String color = "黑色";
        int size = 8;
        System.out.println("秒杀价：" + price + "你选择的颜色是：" + color + "你选择的版本是：" + size);

        // long类型
        long money = 10000000L;
        //float类型
        float pic = 12.34F;
        System.out.println(money);
        System.out.println(pic);

        // 定义一个三位数
        int number = 123;
        // 获取个、十、百位数据
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        System.out.println("个位：" + ge + "十位：" + shi + "百位：" + bai);

        // 类型强制转换
        short s = 10;
        int i = 20;
        int j = s + i;
        System.out.println(j);

        short ss = (short) (s + i);
        System.out.println(ss);
    }
}
