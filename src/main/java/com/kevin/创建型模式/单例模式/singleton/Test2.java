package com.kevin.创建型模式.单例模式.singleton;

import java.io.*;

/**
 * @author kevin
 * @version 1.0
 * @description     测试反射和反序列化破解单例模式
 * @createDate 2019/2/17
 */
public class Test2 {

    public static void main(String[] args) throws Exception {
        // 不管创建多少次对象，都是指向同一个对象
        SingletonDemo6 s1 = SingletonDemo6.getInstance();
        SingletonDemo6 s2 = SingletonDemo6.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("---------------");

        // 通过反射破解单例模式
        /*Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName("com.kevin.创建型模式.单例模式.SingletonDemo6");
        Constructor<SingletonDemo6> c = clazz.getDeclaredConstructor(null); //获取构造器
        c.setAccessible(true);  // 设置为true可以访问private对象
        SingletonDemo6 s3 = c.newInstance();
        SingletonDemo6 s4 = c.newInstance();
        System.out.println(s3);
        System.out.println(s4);*/

        // 通过反序列化破解单例模式
        FileOutputStream fos = new FileOutputStream("D:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/a.txt"));
        SingletonDemo6 s5 = (SingletonDemo6) ois.readObject();
        System.out.println(s5);

    }
    
}
