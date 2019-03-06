package com.kevin.行为型模式.观察者模式.observer;

/**
 * @author kevin
 * @version 1.0
 * @description     实际观察者
 * @createDate 2019/3/4
 */
public class ObserverA implements Observer{

    private int myState;    // myState需要跟目标对象的state值保持一致
    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

    public int getMyState(){
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

}
