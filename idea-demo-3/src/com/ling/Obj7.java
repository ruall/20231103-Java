package com.ling;

/**
 * 接口
 */
public class Obj7 {
    public static void main(String[] args) {
        Girl g = new Girl("小丽");
        g.eat();
        g.print();
    }
}

interface IEat {
    //public abstract void eat();// 接口中只能定义抽象方法
    void eat(); // 接口中定义的方法没有声明修饰符的话默认为public abstract

    int NUM = 10; // 常量

    // 在JDK1.8后新特性，可以被所有实现类继承
    public default void print(){
        System.out.println("默认方法");
    }
}

interface IRun {
    void run();
}

// 接口之间可以多继承（注意：类是只能单继承的）
interface ISleep extends IEat, IRun {
    void sleep();
}


// 具体类实现接口必须实现接口的所有方法
class Girl implements ISleep, IEat {
    private String name;

    public Girl(String name) {
        this.name = name;
    }

    public Girl() {
    }

    @Override
    public void eat() {
        System.out.println(name + "吃饭");
    }

    @Override
    public void run() {
        System.out.println(name + "逛街");
    }

    @Override
    public void sleep() {
        System.out.println(name + "睡觉");
    }
}