package com.kevin.行为型模式.解释器模式.interpreter;

/**
 * @author kevin
 * @version 1.0
 * @description     表达式接口
 * @createDate 2019/3/3
 */
public interface Expression {

    public boolean interpret(String context);
}
