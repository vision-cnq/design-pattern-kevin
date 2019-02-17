package com.kevin.创建型模式.工厂模式.abstractfactory;

/**
 * @author kevin
 * @version 1.0
 * @description     座椅
 * @createDate 2019/2/17
 */
public interface Seat {

    void massage();
}

class LuxurySeat implements Seat{

    @Override
    public void massage() {
        System.out.println("可以自动按摩");
    }
}

class LowSeat implements Seat{

    @Override
    public void massage() {
        System.out.println("不能按摩");
    }
}
