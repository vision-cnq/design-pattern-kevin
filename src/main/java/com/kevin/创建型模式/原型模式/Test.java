package com.kevin.创建型模式.原型模式;

import java.util.Date;

/**
 * @author kevin
 * @version 1.0
 * @description     测试原型模式（浅克隆）
 * @createDate 2019/1/18
 */
public class Test {

    public static void main(String[] args) throws Exception {

        Date date = new Date(15504546456L);
        Sheep s1 = new Sheep("少利", date);
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());

        Sheep s2 = (Sheep) s1.clone();  // 克隆s1对象

        s2.setSname("多利");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());

    }
}
