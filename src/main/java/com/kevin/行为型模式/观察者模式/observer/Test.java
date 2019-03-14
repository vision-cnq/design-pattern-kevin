package com.kevin.行为型模式.观察者模式.observer;

/**
 * @author kevin
 * @version 1.0
 * @description     测试观察者模式
 * @createDate 2019/1/18
 */
public class Test {
    public static void main(String[] args) {

        // 目标对象
        ConcreteSubject subject = new ConcreteSubject();

        // 创建多个观察者
        ObserverA ob1 = new ObserverA();
        ObserverA ob2 = new ObserverA();
        ObserverA ob3 = new ObserverA();

        // 将这三个观察者添加到subject对象的观察者队伍中
        subject.registerObserver(ob1);
        subject.registerObserver(ob2);
        subject.registerObserver(ob3);

        // 改变subject的状态
        subject.setState(3000);
        System.out.println("-----------");

        // 我们看看，观察者的状态是不是也发生了变化
        System.out.println(ob1.getMyState());
        System.out.println(ob2.getMyState());
        System.out.println(ob3.getMyState());

        // 改变subject的状态
        subject.setState(200);
        System.out.println("-----------");

        // 我们看看，观察者的状态是不是也发生了变化
        System.out.println(ob1.getMyState());
        System.out.println(ob2.getMyState());
        System.out.println(ob3.getMyState());


    }
}
