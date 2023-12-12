package com.ling;

/**
 * abstract 抽象类
 * 很多具有相同特征和行为的对象可以抽象为一个类
 * 很多具有相同特征和行为的类可以抽象为一个抽象类
 */
public class Obj6 {
    public static void main(String[] args) {
        Man m = new Man();
        m.move();
        m.eat();
        Women w = new Women();
        w.move();
        w.eat();
    }
}

// 抽象类
abstract class Animal {
    public abstract void move(); //抽象方法，只有声明，没有实现
}

abstract class Person extends Animal {
    public abstract void eat();
}

// 继承抽象类的具体类必须实现所有抽象方法
class Man extends Person {

    @Override
    public void move() {
        System.out.println("走路");
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}

class Women extends Person {

    @Override
    public void move() {
        System.out.println("逛街");
    }

    @Override
    public void eat() {
        System.out.println("吃水果");
    }
}