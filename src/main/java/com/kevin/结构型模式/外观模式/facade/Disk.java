package com.kevin.结构型模式.外观模式.facade;

/**
 * @author kevin
 * @version 1.0
 * @description     Disk子系统类
 * @createDate 2019/3/2
 */
public class Disk {

    public void start(){
        System.out.println("Disk is start...");
    }

    public void shutDowm(){
        System.out.println("Disk is end...");
    }
}
