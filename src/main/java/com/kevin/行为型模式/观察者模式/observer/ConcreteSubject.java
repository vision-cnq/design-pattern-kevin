package com.kevin.行为型模式.观察者模式.observer;

/**
 * @author kevin
 * @version 1.0
 * @description
 * @createDate 2019/3/4
 */
public class ConcreteSubject extends Subject{

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        // 主题对象（目标对象）发生了变化则通知所有的观察者
        this.notifyAllObserver();
    }
}
