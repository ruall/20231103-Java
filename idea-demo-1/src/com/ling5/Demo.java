package com.ling5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        // 格式化（从Date到String）
        Date d = new Date();

        // SimpleDateFormat()：构造一个SimpleDateFormat。使用默认格式和日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);

        // 解析（从String到Date）
        String ss = "2023-11-27 10:00:00";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf1.parse(ss);
        System.out.println(dd);
    }
}
