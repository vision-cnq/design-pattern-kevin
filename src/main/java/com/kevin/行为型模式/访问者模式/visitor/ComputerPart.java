package com.kevin.行为型模式.访问者模式.visitor;

/**
 * @author kevin
 * @version 1.0
 * @description     元素接口（Element）
 * @createDate 2019/3/3
 */
public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
