package com.kevin.行为型模式.中介者模式.mediator;

/**
 * @author kevin
 * @version 1.0
 * @description
 * @createDate 2019/3/3
 */
public interface Mediator {

    void register(String name, Department d);
    void command(String dName);

}
