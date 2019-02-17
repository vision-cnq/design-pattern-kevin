package com.kevin.创建型模式.工厂模式.simplefactory;

/**
 * @author kevin
 * @version 1.0
 * @description     测试工厂模式
 * @createDate 2019/2/17
 */
public class Test {

    public static void main(String[] args) {

        // 普通创建方式，需要选择调用哪个类
        /*Car c1 = new Audi();
        Car c2 = new Byd();
        c1.run();
        c2.run();*/

        // 简单工厂模式
        // 方式一：调用方便，不需要有调用方选择调用那个实例，只需要传入参数
        CarFactory.createCar("奥迪").run();
        CarFactory.createCar("比亚迪").run();
        //c3.run();

        // 方式二：
        CarFactory.createAudi().run();
        CarFactory.createByd().run();
    }
}
