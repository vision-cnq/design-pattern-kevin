package com.kevin.行为型模式.模板方法模式.templateMethod;

/**
 * @author kevin
 * @version 1.0
 * @description     模板类及模板方法
 * @createDate 2019/3/4
 */
public abstract class BankTemplateMethod {

    // 具体方法
    public void tekaNumber(){
        System.out.println("取号排队");
    }

    public abstract void transact(); // 办理具体的业务，钩子方法

    // 具体方法
    public void evaluate(){
        System.out.println("反馈评分");
    }

    // 模板方法
    public final void process(){
        this.tekaNumber();
        this.transact();
        this.evaluate();
    }

}
