package com.kevin.结构型模式.代理模式.proxy;

import java.lang.reflect.Proxy;

/**
 * @author kevin
 * @version 1.0
 * @description     测试动态代理模式
 * @createDate 2019/2/26
 */
public class Test {

    public static void main(String[] args) {

        Star realStar = new RealStar();

        StarHandler handler = new StarHandler(realStar);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);

        proxy.bookTicket();
        proxy.sing();

    }
}
