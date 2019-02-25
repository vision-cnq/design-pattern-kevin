package com.kevin.结构型模式.适配器模式.adapter;

/**
 * @author kevin
 * @version 1.0
 * @description     被适配的类（相当于例子中的，PS+2键盘）
 * @createDate 2019/2/25
 */
public class Adaptee {

    public void request() {
        System.out.println("可以完成客户请求的需要的功能...");
    }

}
