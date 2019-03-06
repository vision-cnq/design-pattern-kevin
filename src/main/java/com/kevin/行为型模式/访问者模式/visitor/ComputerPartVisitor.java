package com.kevin.行为型模式.访问者模式.visitor;

/**
 * @author kevin
 * @version 1.0
 * @description     访问者的接口
 * @createDate 2019/3/3
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}