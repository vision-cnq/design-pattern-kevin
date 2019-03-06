package com.kevin.行为型模式.命令模式.command;

/**
 * @author kevin
 * @version 1.0
 * @description
 * @createDate 2019/3/3
 */
public interface Command {

    // 这个方法是一个返回结果为空的方法
    // 实际项目中，可以根据需求设计多个不同的方法
    void execute();
}

class ConcreteCommand implements Command {

    private Receiver receiver;  // 命令真正的执行者

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 命令真正执行前或后，执行相关的处理
        receiver.action();
    }
}
