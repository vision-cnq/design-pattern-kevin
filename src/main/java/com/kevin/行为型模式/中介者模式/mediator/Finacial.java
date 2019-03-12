package com.kevin.行为型模式.中介者模式.mediator;

/**
 * @author kevin
 * @version 1.0
 * @description     财务部
 * @createDate 2019/3/3
 */
public class Finacial implements Department{

    private Mediator m; // 持有中介者(总经理)的引用

    public Finacial(Mediator m) {
        this.m = m;
        m.register("finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("清点资金!");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，资金过多，如何高效的消费!");
    }
}
