package com.kevin.结构型模式.代理模式.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author kevin
 * @version 1.0
 * @description     动态代理
 * @createDate 2019/2/26
 */
public class StarHandler implements InvocationHandler {

    Star realStar;

    public StarHandler(Star realStar){
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        System.out.println("真正的方法执行前");
        System.out.println("商谈，签合同，预付款，订机票");
        if(method.getName().equals("sing")){
            method.invoke(realStar,args);
        }
        System.out.println("真正的方法执行后");
        System.out.println("收尾款");
        return null;
    }

}
