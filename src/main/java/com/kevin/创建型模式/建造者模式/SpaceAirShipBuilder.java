package com.kevin.创建型模式.建造者模式;

/**
 * @author kevin
 * @version 1.0
 * @description     太空飞船构建类
 * @createDate 2019/2/17
 */
public class SpaceAirShipBuilder implements AirShipBuilder{

    @Override
    public Engine builderEngine() {
        System.out.println("构建发动机");
        return new Engine("发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建逃逸塔");
        return new OrbitalModule("逃逸塔");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建轨道舱");
        return new EscapeTower("轨道舱");
    }
}
