package com.kevin.行为型模式.命令模式.command;

/**
 * @author kevin
 * @version 1.0
 * @description     调用者/发起者
 * @createDate 2019/3/3
 */
public class Invoke {

    private Command command;    // 也可以通过容器List<Command>容纳很多个命令对象，进行批处理，如同数据库底层的事务管理就是类似的结构

    public Invoke(Command command) {
        this.command = command;
    }

    // 业务方法，用于调用命令类的方法
    public void call(){
        command.execute();
    }
}
