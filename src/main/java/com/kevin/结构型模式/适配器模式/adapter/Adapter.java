package com.kevin.结构型模式.适配器模式.adapter;

/**
 * @author kevin
 * @version 1.0
 * @description     适配器（类适配器方式）
 * 适配器本身，相当于USB和PS/2的转接器
 * @createDate 2019/2/25
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void handleReq() {
        super.request();
    }
}
