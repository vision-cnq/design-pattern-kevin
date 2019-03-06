package com.kevin.结构型模式.外观模式.facade;

/**
 * @author kevin
 * @version 1.0
 * @description     门面类
 * @createDate 2019/3/2
 */
public class Computer {

    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer(){
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void start(){
        System.out.println("Computer start begin...");

        cpu.start();
        disk.start();
        memory.start();
        System.out.println("Computer start end...");
    }

    public void shutDown(){
        System.out.println("Computer shutDown begin...");
        cpu.shutDown();
        disk.shutDowm();
        memory.shutDown();
        System.out.println("Computer shutDown end...");
    }

}
