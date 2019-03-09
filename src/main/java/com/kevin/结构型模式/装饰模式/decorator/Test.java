package com.kevin.结构型模式.装饰模式.decorator;

/**
 * @author kevin
 * @version 1.0
 * @description     测试装饰模式
 * @createDate 2019/1/18
 */
public class Test {

    public static void main(String[] args) {

        Car car = new Car();
        car.move();

        System.out.println("增加新的功能，飞行...");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("增加新的功能，水里游...");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("增加两个新的功能，飞行、水里游...");
        WaterCar waterCar1 = new WaterCar(new FlyCar(car));
        waterCar1.move();

    }
}
