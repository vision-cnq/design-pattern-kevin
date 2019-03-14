package com.kevin.行为型模式.观察者模式.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin
 * @version 1.0
 * @description     抽象主题
 * @createDate 2019/3/4
 */
public interface Subject {

    // 新增观察者对象
    public void registerObserver(Observer observer);

    // 删除观察者对象
    public void removeObserver(Observer observer);

    // 通知所有的观察者更新状态
    public void notifyAllObserver();

}
