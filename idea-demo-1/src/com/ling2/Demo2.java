package com.ling2;

// 写法二
import com.ling1.Demo3;
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Demo2");

        // 写法一
//        com.ling1.Demo3 d = new com.ling1.Demo3();
//        d.Study();

        // 学法二
        Demo3 d = new Demo3();
        d.Study();
    }
}
