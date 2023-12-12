package com.ling;

/**
 * 继承：继承是从已有类创建新类的过程
 *
 * overloading 和 overriding 的区别
 * overloading：方法的重载，发生在同一个类中，方法名相同，参数列表不同，与返回值无关
 * overriding：方法的重写，发生在子类中，方法名相同，参数类标相同，返回值相同，子类的访问修饰符要大于或等于父类，子类的异常声明必须小于或等于父类的异常声明，如果方法被private、static、final修饰，那么不能被重写
 */
public class Obj4 {
    public static void main(String[] args) {
        HomeDog h = new HomeDog("天天");
        h.print();
        h.eat();
        HuskDog h1 = new HuskDog();
        h1.eat();
    }
}

class Dogs {
    protected String name;
    protected String sex;

    public Dogs(String name, String sex) {
        this.name = name;
        this.sex = sex;
        System.out.println("我是Dogs的构造方法");
    }

    public void eat() {
        System.out.println("吃饭");
    }
}

class HomeDog extends Dogs {
    public HomeDog(String name) {
        super(name, "母");
        System.out.println("我是HomeDog的构造方法");
    }

    public void print() {
        System.out.println("我是一个🐶" + name);
    }

    public void eat() {
        System.out.println("我喜欢吃骨头");
    }
}

class HuskDog extends Dogs {
    public HuskDog() {
        super("哈士奇", "公");

        System.out.println("我是HuskDog的构造方法");
    }

    public void show() {
        // super.属性 表示调用父类的属性，如果是继承过来的的属性，可以省略
        System.out.println("我是一条哈士奇" + super.name);
    }

    // 重写父类的方法
    public void eat() {
        super.eat(); // 表示调用父类的eat方法
        System.out.println("我喜欢吃饭");
    }
}