package com.ling;

/**
 * 单例设计模式
 * 1、构造方法私有化
 * 2、声明一个本类对象
 * 3、给外部提供一个静态方法来获取对象的实例
 *
 * 懒汉式：在第一次调用getInstance方法时对象被创建，到程序结束后释放（占用内存时间短，效率低，在多线程时会有安全问题）
 * 饿汉式：在类被加载后对象被创建，道程序结束后释放（占用内存时间长，效率高）
 *
 * 在项目中为什么要使用单例，单例有什么好处
 * 1、在设计一些工具类的时候（通常工具类，只有功能方法，没有属性）
 * 2、工具类可能会被频繁调用
 *
 * 目的是为了节省重复创建对象所带来的内存消耗，从而提高效率
 * 能不能使用构造方法私有化+静态方法来代替单例
 */
public class Obj3 {
    public static void main(String[] args) {
        Singleton1 s = Singleton1.getInstance();
        s.print();
        Singleton1 s1 = Singleton1.getInstance();
        s1.print();
        System.out.println(s == s1);
    }
}


// 饿汉式写法
class Singleton1 {
    private Singleton1() {
    }

    private static Singleton1 s = new Singleton1();

    public static Singleton1 getInstance() {
        return s;
    }

    public void print() {
        System.out.println("测试方法");
    }
}

// 懒汉式写法
class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 s;

    public static Singleton2 getInstance() {
        if (s == null) {
            s = new Singleton2();
        }
        return s;
    }

    public void print() {
        System.out.println("测试方法");
    }
}