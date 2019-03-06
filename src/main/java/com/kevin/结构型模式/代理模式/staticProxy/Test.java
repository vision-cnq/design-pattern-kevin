package com.kevin.结构型模式.代理模式.staticProxy;


import com.kevin.结构型模式.代理模式.proxy.RealStar;
import com.kevin.结构型模式.代理模式.proxy.Star;

/**
 * @author kevin
 * @version 1.0
 * @description     测试静态代理模式
 * @createDate 2019/2/25
 */
public class Test {

    public static void main(String[] args) {

        RealStar real = new RealStar();     // 真实对象

        Star proxy = new ProxyStar(real);   // 将真实角色传入代理角色

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();
    }
}
