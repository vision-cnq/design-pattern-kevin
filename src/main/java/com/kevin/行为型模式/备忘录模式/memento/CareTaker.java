package com.kevin.行为型模式.备忘录模式.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin
 * @version 1.0
 * @description     负责人类
 * 负责管理备忘录对象
 * @createDate 2019/3/4
 */
public class CareTaker {

    private EmpMemento memento;

    // 可以保存多个备忘录点
    //private List<EmpMemento> list = new ArrayList<EmpMemento>();

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }

}
