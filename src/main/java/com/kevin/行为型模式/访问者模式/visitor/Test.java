package com.kevin.行为型模式.访问者模式.visitor;

/**
 * @author kevin
 * @version 1.0
 * @description    测试访问者模式
 * @createDate 2019/1/18
 */
public class Test {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
