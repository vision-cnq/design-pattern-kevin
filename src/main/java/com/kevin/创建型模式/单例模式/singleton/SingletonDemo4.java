package com.kevin.创建型模式.单例模式.singleton;

/**
 * @author kevin
 * @version 1.0
 * @description     静态内部类模式
 *      线程安全，调用效率高，但是，可以延时加载
 * @createDate 2019/2/17
 */
public class SingletonDemo4 {

    private SingletonDemo4() {

    }

    // 将加载对象放在静态内部类中，所以不会立即加载对象
    private static class SingletonClassInstance{
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }

    // 只有真正调用getInstance()时才会加载静态内部类，加载类时是线程安全的。
    // instance是static final类型，保证了内存中只有这样一个实例存在，而且只能被赋值一次，从而保证线程安全
    public static SingletonDemo4 getInstance() {
        return SingletonClassInstance.instance;
    }

}
