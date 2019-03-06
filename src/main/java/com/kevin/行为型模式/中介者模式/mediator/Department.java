package com.kevin.行为型模式.中介者模式.mediator;

/**
 * @author kevin
 * @version 1.0
 * @description     同事类的接口
 * @createDate 2019/3/3
 */
public interface Department {

    void selfAction();   // 做本部门的事情
    void outAction();   // 像总经理发出申请
}
