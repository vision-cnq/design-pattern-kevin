package com.kevin.创建型模式.工厂模式.factorymethod;

/**
 * @author kevin
 * @version 1.0
 * @description
 * @createDate 2019/2/17
 */
public class AudiFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Audi();
    }
}
