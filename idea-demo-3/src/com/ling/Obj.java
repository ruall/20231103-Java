package com.ling;

public class Obj {
    public static void main(String[] args) {
        Horse h = null;//声明一个类的变量
        h = new Horse(); //创建一个Horse类型的对象，实例化对象
        // 有了对象，我们就可以调用对象的属性和方法
        h.name = "赤兔马";
        h.age = 100;

        // 调用方法，那么方法就会被执行
        h.run();
        h.eat();

        new Horse().eat(); // 匿名对象：只能使用一次，用完后该对象就会被释放
    }
}

// 自定义一个类
class Horse {
    // 在类中定义属性（特征）
    String name;
    int age;

    public void run() {
        System.out.println("我是" + name + "，今年" + age + "岁，日行千里");
    }
    public void eat(){
        System.out.println("我吃空气");
    }
}