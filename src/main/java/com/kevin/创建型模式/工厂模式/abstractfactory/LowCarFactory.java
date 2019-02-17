package com.kevin.创建型模式.工厂模式.abstractfactory;

/**
 * @author kevin
 * @version 1.0
 * @description 低端产品族工厂
 * @createDate 2019/2/17
 */
public class LowCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
