package com.kevin.创建型模式.单例模式.singleton;

/**
 * @author kevin
 * @version 1.0
 * @description     饿汉式单例模式
 *      线程安全，调用效率高。但是，不能延时加载。
 * @createDate 2019/2/17
 */
public class SingletonDemo1 {

    // 类初始化时，立即加载这个对象（没有延时加载的优势）。由于加载类时，天然的是线程安全的
    private static SingletonDemo1 instance = new SingletonDemo1();

    public SingletonDemo1() {
    }

    // 方法没有同步，调用效率高
    public static SingletonDemo1 getInstance(){
        return instance;
    }


}
