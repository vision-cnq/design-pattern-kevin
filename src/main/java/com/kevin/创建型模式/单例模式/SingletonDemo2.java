package com.kevin.创建型模式.单例模式;

/**
 * @author kevin
 * @version 1.0
 * @description     懒汉式单例模式
 *      线程安全，调用效率不高，但是可以延时加载
 * @createDate 2019/2/17
 */
public class SingletonDemo2 {

    // 类初始化时，不初始化这个对象（有延时加载的优势，到真正使用的时候再创建）。由于加载类时，天然的是线程安全的
    private static SingletonDemo2 instance;

    private SingletonDemo2(){

    }

    // 方法需要同步，效率低
    public static synchronized SingletonDemo2 getInstance() {
        if(instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
