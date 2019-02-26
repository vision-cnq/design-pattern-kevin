package com.kevin.结构型模式.代理模式.proxy;

/**
 * @author kevin
 * @version 1.0
 * @description     抽象角色
 * @createDate 2019/2/25
 */
public interface Star {

    /**
     * 面谈
     */
    void confer();

    /**
     * 签合同
     */
    void signContract();

    /**
     * 订票
     */
    void bookTicket();

    /**
     * 唱歌
     */
    void sing();

    /**
     * 收钱
     */
    void collectMoney();

}
