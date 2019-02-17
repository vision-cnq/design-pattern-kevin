package com.kevin.创建型模式.工厂模式.factorymethod;

/**
 * @author kevin
 * @version 1.0
 * @description
 * 为了避免简单工厂模式的缺点，不完全满足OCP。
 * 工厂方法模式和简单工厂模式最大的不同在于，简单工厂模式只有一个（对于一个项目或者一个独立模块而言）工厂类，
 * 而工厂方法模式有一组实现了相同接口的工厂类。
 * @createDate 2019/2/17
 */
public class AudiFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Audi();
    }
}
