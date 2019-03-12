package com.kevin.行为型模式.模板方法模式.templateMethod;

/**
 * @author kevin
 * @version 1.0
 * @description     测试模板方法
 * @createDate 2019/3/4
 */
public class Test {

    public static void main(String[] args) {

        // 方法一：定义普通类继承BankTemplateMethod并实现业务逻辑
        BankTemplateMethod btm = new DrawMoney();
        btm.process();

        // 方法二：采用匿名内部类
        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存钱");
            }
        };
        btm2.process();

        BankTemplateMethod btm3 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要理财，我这里有2000万韩币");
            }
        };
        btm3.process();

    }
}

// 定义普通类继承BankTemplateMethod并实现业务逻辑
class DrawMoney extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("我要取款!!!");
    }
}
