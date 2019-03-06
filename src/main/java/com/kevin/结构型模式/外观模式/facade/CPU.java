package com.kevin.结构型模式.外观模式.facade;

/**
 * @author kevin
 * @version 1.0
 * @description     cpu子系统类
 * @createDate 2019/3/2
 */
public class CPU {

    public void start(){
        System.out.println("CPU is start...");
    }

    public void shutDown(){
        System.out.println("CPU is end...");
    }
}
