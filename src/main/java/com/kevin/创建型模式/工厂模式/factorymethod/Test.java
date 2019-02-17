package com.kevin.创建型模式.工厂模式.factorymethod;

/**
 * @author kevin
 * @version 1.0
 * @description     测试工厂方法模式
 * @createDate 2019/2/17
 */
public class Test {

    public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        Car c2 = new BydFactory().createCar();
        c1.run();
        c2.run();
    }
}
