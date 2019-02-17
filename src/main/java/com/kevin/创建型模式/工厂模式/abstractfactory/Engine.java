package com.kevin.创建型模式.工厂模式.abstractfactory;

/**
 * @author kevin
 * @version 1.0
 * @description     发动机
 * @createDate 2019/2/17
 */
public interface Engine {

    void run();
    void start();
}

class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转的快");
    }

    @Override
    public void start() {
        System.out.println("启动快。可以自动启停");
    }
}

class LowEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转的慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢");
    }
}
