package com.kevin.行为型模式.观察者模式.observer2;

/**
 * @author kevin
 * @version 1.0
 * @description
 * @createDate 2019/3/4
 */
public class Test {

    public static void main(String[] args) {

        // 创建目标对象Observer
        ConcreteSubject subject = new ConcreteSubject();

        // 创建观察者
        ObserverA ob1 = new ObserverA();
        ObserverA ob2 = new ObserverA();
        ObserverA ob3 = new ObserverA();

        // 将上面三个观察者对象添加到目标对象subject的观察者容器中
        subject.addObserver(ob1);
        subject.addObserver(ob2);
        subject.addObserver(ob3);

        // 改变subject对象的状态
        subject.set(3000);
        System.out.println("-------------");
        // 观察者的状态发生的变化
        System.out.println(ob1.getMyState());
        System.out.println(ob2.getMyState());
        System.out.println(ob3.getMyState());

        // 改变subject对象的状态
        subject.set(600);
        System.out.println("-------------");
        // 观察者的状态发生的变化
        System.out.println(ob1.getMyState());
        System.out.println(ob2.getMyState());
        System.out.println(ob3.getMyState());

    }
}
