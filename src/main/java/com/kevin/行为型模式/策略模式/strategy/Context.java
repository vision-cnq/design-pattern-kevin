package com.kevin.行为型模式.策略模式.strategy;

/**
 * @author kevin
 * @version 1.0
 * @description     上下文类，管理算法
 * 负责和具体的策略类交互
 * 这样的话，具体的算法和客户端调用分离了，使得算法可以独立客户端独立的变化
 * 如果使用spring的依赖注入功能，还可以通过配置文件，动态的注入不同的策略对象，动态的切换不同的算法
 * @createDate 2019/3/4
 */
public class Context {

    private Strategy strategy;      // 当前采用的算法对象

    // 可以通过构造器注入
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 可以通过set方法注入
    public void setContext(Strategy strategy){
        this.strategy = strategy;
    }

    // 打印报价的方法，(可选)
  public void pringPice(double d){
        System.out.println("您该报价: " + strategy.getPrice(d));
    }

}
