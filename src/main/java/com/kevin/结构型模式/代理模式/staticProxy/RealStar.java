package com.kevin.结构型模式.代理模式.staticProxy;

/**
 * @author kevin
 * @version 1.0
 * @description     真实角色
 * @createDate 2019/2/25
 */
public class RealStar implements Star{

    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket() ");
    }

    @Override
    public void sing() {
        System.out.println("周杰伦唱歌...");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}
