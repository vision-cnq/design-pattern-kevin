package com.kevin.创建型模式.建造者模式.builder;

/**
 * @author kevin
 * @version 1.0
 * @description     太空飞船装配类
 * @createDate 2019/2/17
 */
public class SpaceAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public SpaceAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directorAirShip() {
        Engine e = builder.builderEngine();
        OrbitalModule o = builder.builderOrbitalModule();
        EscapeTower et = builder.builderEscapeTower();

        // 装配成飞船
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setOrbitalModule(o);
        ship.setEscapeTower(et);

        return ship;
    }
}
