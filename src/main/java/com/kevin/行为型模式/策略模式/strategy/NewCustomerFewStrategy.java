package com.kevin.行为型模式.策略模式.strategy;

/**
 * @author kevin
 * @version 1.0
 * @description     普通客户，小批量
 * @createDate 2019/3/4
 */
public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standarPrice) {
        System.out.println("不打折，原价");
        return standarPrice;
    }
}
