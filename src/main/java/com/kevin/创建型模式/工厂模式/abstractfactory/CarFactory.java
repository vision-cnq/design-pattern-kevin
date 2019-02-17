package com.kevin.创建型模式.工厂模式.abstractfactory;

/**
 * @author kevin
 * @version 1.0
 * @description     工厂，分别保存所有的产品
 * @createDate 2019/2/17
 */
public interface CarFactory {

    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}

