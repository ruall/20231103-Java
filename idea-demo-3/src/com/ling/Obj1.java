package com.ling;

/**
 * 封装性
 * 如果属性没有封装，那么在本类之外创建对象后，可以直接访问属性
 * private关键字：访问权限修饰符，表示私有的，只能在本类中访问，想要访问私有方法，必须创建公共方法给外部类调用访问内部私有属性
 * public关键字：表示共有的，可以被类外部的其他类直接访问
 */
public class Obj1 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.setName("小美");
        System.out.println(p1.getName());
    }
}

// 没有封装之前
class Person1 {
    // 属性的封装
    private String name;
    private int age;

    // 对外提供一个为name属性设值的方法
    public void setName(String name) {
        this.name = name;
    }

    // 对外提供一个获取name属性的方法
    public String getName() {
        return name;
    }
}