package com.kevin.创建型模式.建造者模式.builder;

/**
 * @author kevin
 * @version 1.0
 * @description     测试建造者模式
 * @createDate 2019/2/17
 */
public class Test {

    public static void main(String[] args) {

        // 创建太空飞船构建类并交于太空飞船装配类
        AirShipDirector director = new SpaceAirShipDirector(new SpaceAirShipBuilder());

        // 该方法将逃逸塔，轨道舱，发动机装配成飞船
        AirShip ship = director.directorAirShip();
        // 启动发射指令
        ship.launch();

        System.out.println(ship.getEngine().getName());

    }
}
