package com.kevin.行为型模式.观察者模式.observer2;

import java.util.Observable;

/**
 * @author kevin
 * @version 1.0
 * @description     具体主题
 * @createDate 2019/3/4
 */
public class ConcreteSubject extends Observable {

    private int state;

    public void set(int s) {
        state = s;      // 目标对象的状态发生了改变

        setChanged();   // 表示目标对象已经做了更改
        notifyObservers(state);  // 通知所有的观察者
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
