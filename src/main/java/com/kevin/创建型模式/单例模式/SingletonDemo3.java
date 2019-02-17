package com.kevin.创建型模式.单例模式;

/**
 * @author kevin
 * @version 1.0
 * @description     双重检测锁模式
 *      由于JVM底层内部模型原因，偶尔会出现问题，不建议使用
 * @createDate 2019/2/17
 */
public class SingletonDemo3 {

    // 类初始化时，不初始化这个对象，赋值为null，到使用的时候创建对象
    private static SingletonDemo3 instance = null;

    private SingletonDemo3() {

    }

    // 调用时，会先判断使用已经同步了对象
    public static SingletonDemo3 getInstance() {
        if(instance == null) {
            SingletonDemo3 sc;
            synchronized (SingletonDemo3.class){
                sc = instance;
                if(sc == null) {
                    synchronized (SingletonDemo3.class) {
                        if (sc == null){
                            sc = new SingletonDemo3();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }

}
