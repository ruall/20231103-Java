package com.ling;

/**
 * final关键字
 *  1、使用final声明一个属性，就是常量，常量的命名规则建议使用全大写，常量必须在定义时或在构造器中初始化
 *  2、使用final修饰的方法为最终方法，且只能被子类继承，不能被子类重写
 *  3、使用final修饰的类为最终类，没有子类，无法被继承
 * */
public class Obj5 {

    public static void main(String[] args) {
        System.out.println(Constant.PERSON_NUM);
    }
}

