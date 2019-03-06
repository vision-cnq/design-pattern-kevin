package com.kevin.行为型模式.命令模式.command;

/**
 * @author kevin
 * @version 1.0
 * @description     测试命令模式
 * @createDate 2019/1/18
 */
public class Test {

    public static void main(String[] args) {

        Command c = new ConcreteCommand(new Receiver());
        Invoke i = new Invoke(c);
        i.call();

        new Receiver().action();

    }

}
