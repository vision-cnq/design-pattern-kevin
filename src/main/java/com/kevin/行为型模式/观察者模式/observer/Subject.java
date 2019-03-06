package com.kevin.行为型模式.观察者模式.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin
 * @version 1.0
 * @description     主题对象
 * @createDate 2019/3/4
 */
public class Subject {

    // 所有的观察者对象存放点
    protected List<Observer> list = new ArrayList<Observer>();

    // 新增观察者对象
    public void registerObserver(Observer observer){
        list.add(observer);
    }

    // 删除观察者对象
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    // 通知所有的观察者更新状态
    public void notifyAllObserver(){

        for(Observer obs : list) {
            obs.update(this);
        }
    }

}
