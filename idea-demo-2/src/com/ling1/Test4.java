package com.ling1;

/**
 * 数组的定义：
 * 1、使用默认的初始值来初始化数组重的每一个元素
 * 语法：数组元素类型[] 数组名 = new 数组元素类型[数组中元素的个数（数组长度）]
 * 如：int[] scores = new int[3]
 * <p>
 * 2、先声明，然后再赋予默认的初始值
 * 语法：数组元素类型[] 数组名；
 * 数组名 = new 数组元素类型[数组中元素的个数（数组长度）]
 * 如：int[] scores;  scores = new int[3]
 * <p>
 * <p>
 * 3、先声明，然后再使用指定的值进行初始化
 * 语法：数组元素的类型[] 数组名 = new 数组元素类型[]{元素1,元素2,...}
 * 如：int[] scores = new int[3]{1,2,3}
 * <p>
 * 4、第三种写法可以简化为（使用数组常量值给数组进行赋值）
 * 语法：数组元素类型[] 数组名 = {元素1,元素2,元素3,...}
 * 如：int[] scores = {1,2,3}
 */

public class Test4 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        // for循环打印数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------------");
        // ForEach循环打印数组元素
        for (int j : arr) {
            System.out.println(j);
        }
        System.out.println("--------------");
        print(arr);
        System.out.println("--------------");
        print1(5, 6, 7, 8, 9);
        System.out.println("--------------");
//        print2(null);
        System.out.println("--------------");
        print3(arr);
    }

    public static void print(int[] x) {
        for (int i : x) {
            System.out.println(i);
        }
    }

    // JDK1.5可变参数
    // 可变参数只能十参数列表重的最后一个
    // 可变参数作为数组使用
    public static void print1(int... x) {
        int len = x.length;
        for (int i = 0; i < len; i++) {
            System.out.println(x[i]);
        }
    }

    // 测试数组的异常
    public static void print2(int[] x){
        //java.lang.NullPointerException
        // 当一个变量为null（没有赋值）时，我们去调用了该变量的属性和方法
        System.out.println(x.length);
    }
    public static void print3(int... x) {
        int len = x.length;
        for (int i = 0; i <= len; i++) {
            //java.lang.ArrayIndexOutOfBoundsException
            // 下标越界异常
            System.out.println(x[i]);
        }
    }
}
