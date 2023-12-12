package com.ling;
/**
 * 构造方法：构造方法是在类中定义，构造方法的定义格式：方法名称与类名相同，无返回值类型的声明
 *        1、构造方法是类构造对象时调用的方法，用于对象的初始化工作
 *        2、构造方法是实例化一个类的对象时，也就是new的时候，最先调用的方法
 * */
public class Obj2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog("旺旺",3);
    }
}

class Dog{
    String name;
    int age;

    // 默认的构造方法
    public Dog(){
        System.out.println("构造方法执行了");
    }

    // 构造方法的重载
    public Dog(String name){
        this.name = name;
        System.out.println("带参数的构造方法执行了1");
    }
    public Dog(String name,int age){
        this(name); // 调用其他构造方法时，次语句需要在第一句，在构造方法互相调用时，必须要有出口
//        this.name = name;
        this.age = age;
        System.out.println("带参数的构造方法执行了2");
    }
}

