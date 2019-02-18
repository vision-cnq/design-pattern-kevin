package com.kevin.创建型模式.建造者模式;

/**
 * @author kevin
 * @version 1.0
 * @description     构建类
 * @createDate 2019/2/17
 */
public interface AirShipBuilder {

    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
