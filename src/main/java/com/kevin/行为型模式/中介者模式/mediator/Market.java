package com.kevin.行为型模式.中介者模式.mediator;

/**
 * @author kevin
 * @version 1.0
 * @description     市场部
 * @createDate 2019/3/3
 */
public class Market implements Department{

    private Mediator m; // 持有中介者(总经理)的引用

    public Market(Mediator m) {
        this.m = m;
        m.register("market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("外出接项目!");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，项目承接的进度，需要资金支持!");
        m.command("finacial");
    }
}
