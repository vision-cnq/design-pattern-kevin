package com.kevin.行为型模式.中介者模式.mediator;

/**
 * @author kevin
 * @version 1.0
 * @description
 * @createDate 2019/3/3
 */
public class Development implements Department{

    private Mediator m; // 持有中介者(总经理)的引用

    public Development(Mediator m) {
        this.m = m;
        m.register("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心科研，开发项目!");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，缺少资金，需要资金支持!");
    }

}
