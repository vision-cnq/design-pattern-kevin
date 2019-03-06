package com.kevin.创建型模式.单例模式.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author kevin
 * @version 1.0
 * @description     懒汉式单例模式（测试如何防止反射和反序列化漏洞）
 * @createDate 2019/2/17
 */
public class SingletonDemo6 implements Serializable {

    private static SingletonDemo6 instance;

    // 手动抛出异常，避免通过反射创建多个单例对象
    private SingletonDemo6() throws Exception {
        if(instance != null) {
            throw new Exception("只能创建一个对象");
        }
    }

    public static synchronized SingletonDemo6 getInstance() throws Exception {
        if(instance == null) {
            instance = new SingletonDemo6();
        }
        return instance;
    }

    // 反序列化时，如果对象所在类定义了readResolve()，(实际上是一种回调），定义返回哪个对象
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

}
