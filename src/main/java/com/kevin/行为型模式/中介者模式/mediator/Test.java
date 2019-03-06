package com.kevin.行为型模式.中介者模式.mediator;

/**
 * @author kevin
 * @version 1.0
 * @description     测试中介者模式
 * @createDate 2019/1/18
 */
public class Test {

    public static void main(String[] args) {

        Mediator m = new President();
        Market market = new Market(m);

        Development devp = new Development(m);
        Finacial f = new Finacial(m);

        market.selfAction();
        market.outAction();
    }
}
