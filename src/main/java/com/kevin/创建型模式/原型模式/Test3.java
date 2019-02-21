package com.kevin.创建型模式.原型模式;

import java.io.*;
import java.util.Date;

/**
 * @author kevin
 * @version 1.0
 * @description     原型模式（深复制，使用序列化和反序列化的方式实现深复制）
 * @createDate 2019/2/21
 */
public class Test3 {

    public static void main(String[] args) throws Exception {

        Date date = new Date(15504546456L);
        Sheep s1 = new Sheep("少利", date);
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep) ois.readObject();        //克隆好的对象

        System.out.println("修改原型对象的属性值");
        date.setTime(28404549436L);
        System.out.println(s1.getBirthday());

        s2.setSname("多利");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());

    }
}
