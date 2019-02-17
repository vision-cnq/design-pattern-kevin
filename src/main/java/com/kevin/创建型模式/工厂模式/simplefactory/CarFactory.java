package com.kevin.创建型模式.工厂模式.simplefactory;

/**
 * @author kevin
 * @version 1.0
 * @description     简单工厂模式
 * 1.简单工厂模式也叫做静态工厂模式，就是工厂类一般使用静态方法，通过接收的参数的不同来返回不同的对象实例。
 * 2.对于增加新产品无能为力，不修改代码的话是无法扩展的。
 * @createDate 2019/2/17
 */
public class CarFactory {

    // 方式一：
    public static Car createCar(String type) {
        if("奥迪".equals(type)){
            return new Audi();
        } else if("比亚迪".equals(type)){
            return new Byd();
        } else {
            return null;
        }
    }

    // 方式二：
    public static Car createAudi(){
        return new Audi();
    }
    public static Car createByd(){
        return new Byd();
    }

}
