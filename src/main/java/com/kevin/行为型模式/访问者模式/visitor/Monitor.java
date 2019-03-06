package com.kevin.行为型模式.访问者模式.visitor;

/**
 * @author kevin
 * @version 1.0
 * @description
 * @createDate 2019/3/3
 */
public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}