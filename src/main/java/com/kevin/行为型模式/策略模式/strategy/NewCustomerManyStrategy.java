package com.kevin.行为型模式.策略模式.strategy;

/**
 * @author kevin
 * @version 1.0
 * @description     具体策略角色，普通客户，大批量
 * @createDate 2019/3/4
 */
public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standarPrice) {
        System.out.println("打九折");
        return standarPrice*0.9;
    }
}
