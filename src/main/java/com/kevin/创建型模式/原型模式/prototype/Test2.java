package com.kevin.创建型模式.原型模式.prototype;

import java.util.Date;

/**
 * @author kevin
 * @version 1.0
 * @description     测试原型模式（深克隆）
 * @createDate 2019/2/21
 */
public class Test2 {

    public static void main(String[] args) throws Exception {
        Date date = new Date(15504546456L);
        Sheep2 s1 = new Sheep2("少利", date);
        Sheep2 s2 = (Sheep2) s1.clone();  // 实现深复制，b2对象的birthday是一个新对象

        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());
        date.setTime(28404549436L);
        System.out.println(s1.getBirthday());

        s2.setSname("多利");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());

    }
}
