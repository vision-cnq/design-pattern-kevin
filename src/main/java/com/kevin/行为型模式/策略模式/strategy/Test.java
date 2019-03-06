package com.kevin.行为型模式.策略模式.strategy;

/**
 * @author kevin
 * @version 1.0
 * @description     测试策略模式
 * @createDate 2019/3/4
 */
public class Test {

    public static void main(String[] args) {

        Strategy s1 = new OldCustomerManyStrategy();
        Context ctx = new Context(s1);

        ctx.pringPice(998);

    }
}
