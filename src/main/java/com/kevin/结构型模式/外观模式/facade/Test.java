package com.kevin.结构型模式.外观模式.facade;

/**
 * @author kevin
 * @version 1.0
 * @description     测试外观模式
 * @createDate 2019/1/18
 */
public class Test {

    public static void main(String[] args) {

        Computer computer = new Computer();
        System.out.println("买电脑，将钱给中介（门面类），由中介挑选cpu，disk等...");
        computer.start();
        System.out.println("购买中");
        computer.shutDown();
        System.out.println("买到电脑...");
    }
}
