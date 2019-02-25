package com.kevin.结构型模式.适配器模式.adapter;

/**
 * @author kevin
 * @version 1.0
 * @description     适配器（对象适配器方式，使用组合的方式跟被适配对象整合）
 * 适配器本身，相当于USB和PS/2的转接器
 * @createDate 2019/2/25
 */
public class Adapter2 implements Target{

    private Adaptee adaptee;

    @Override
    public void handleReq() {
        adaptee.request();
    }

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
