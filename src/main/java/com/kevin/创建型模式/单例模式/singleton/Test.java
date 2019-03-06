package com.kevin.创建型模式.单例模式.singleton;

import com.kevin.创建型模式.单例模式.singleton.SingletonDemo2;
import com.kevin.创建型模式.单例模式.singleton.SingletonDemo3;
import com.kevin.创建型模式.单例模式.singleton.SingletonDemo4;
import com.kevin.创建型模式.单例模式.singleton.SingletonDemo5;

/**
 * @author kevin
 * @version 1.0
 * @description     测试单例模式
 * @createDate 2019/1/18
 */
public class Test {

    public static void main(String[] args) {
        // 不管创建多少次对象，都是指向同一个对象
        SingletonDemo1 s1 = SingletonDemo1.getInstance();
        SingletonDemo1 s11 = SingletonDemo1.getInstance();
        System.out.println("饿汉式是否是同一个对象: " + (s1 == s11));

        SingletonDemo2 s2 = SingletonDemo2.getInstance();
        SingletonDemo2 s22 = SingletonDemo2.getInstance();
        System.out.println("懒汉式是否是同一个对象: " + (s2 == s22));

        SingletonDemo3 s3 = SingletonDemo3.getInstance();
        SingletonDemo3 s33 = SingletonDemo3.getInstance();
        System.out.println("双重检测锁式是否是同一个对象: " + (s3 == s33));

        SingletonDemo4 s4 = SingletonDemo4.getInstance();
        SingletonDemo4 s44 = SingletonDemo4.getInstance();
        System.out.println("静态内部类式是否是同一个对象: " + (s4 == s44));

        SingletonDemo5 s5 = SingletonDemo5.INSTANCE;
        SingletonDemo5 s55 = SingletonDemo5.INSTANCE;
        System.out.println("枚举式是否是同一个对象: " + (s5 == s55));

    }

}
