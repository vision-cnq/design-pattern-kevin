package com.kevin.行为型模式.观察者模式.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin
 * @version 1.0
 * @description     具体主题
 * @createDate 2019/3/4
 */
public class ConcreteSubject implements Subject{

    // 所有的观察者对象存放点
    public List<Observer> list = new ArrayList<Observer>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        // 主题对象（目标对象）发生了变化则通知所有的观察者
        this.notifyAllObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for(Observer obs : list) {
            obs.update(this);
        }
    }

}
