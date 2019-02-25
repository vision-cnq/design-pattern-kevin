package com.kevin.结构型模式.代理模式.staticProxy;

/**
 * @author kevin
 * @version 1.0
 * @description     代理角色
 * @createDate 2019/2/25
 */
public class ProxyStar implements Star{

    private Star star;  // 代理的对象

    public ProxyStar() {
    }

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }
}
