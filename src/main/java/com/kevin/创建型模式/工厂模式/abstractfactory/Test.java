package com.kevin.创建型模式.工厂模式.abstractfactory;

/**
 * @author kevin
 * @version 1.0
 * @description     测试抽象工厂模式
 * @createDate 2019/2/17
 */
public class Test {

    public static void main(String[] args) {

        // 高端工厂
        Engine luxuryEngine = new LuxuryCarFactory().createEngine();
        luxuryEngine.run();
        luxuryEngine.start();

        // 低端工厂
        Engine lowEngine = new LowCarFactory().createEngine();
        lowEngine.run();
        lowEngine.start();
    }
}
