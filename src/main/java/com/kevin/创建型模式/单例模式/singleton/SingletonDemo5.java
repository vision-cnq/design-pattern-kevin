package com.kevin.创建型模式.单例模式.singleton;

/**
 * @author kevin
 * @version 1.0
 * @description     枚举单例模式
 *      线程安全，调用效率高，不能延时加载
 * @createDate 2019/2/17
 */
public enum SingletonDemo5 {

    // 枚举元素，本身就是单例对象，但是没有延时加载。定义一个枚举的元素，它就代表了Singleton的一个实例
    INSTANCE;

    // 单例可以有自己的操作
    public void singletonOperation(){

    }
}
