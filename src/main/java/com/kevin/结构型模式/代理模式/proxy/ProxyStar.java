package com.kevin.结构型模式.代理模式.proxy;

/**
 * @author kevin
 * @version 1.0
 * @description     模拟动态生成的代理结构
 * @createDate 2019/2/26
 */
public class ProxyStar implements Star{

    StarHandler handler;

    public ProxyStar(StarHandler handler) {
        this.handler = handler;
    }

    @Override
    public void confer() {
        // handler.invoke(this,当前方法，args);
        // 每个方法都这么写，相当于调用每个方法的时候都会到invoke调用
    }

    @Override
    public void signContract() {
        // handler.invoke(this,当前方法，args);
        // 每个方法都这么写，相当于调用每个方法的时候都会到invoke调用
    }

    @Override
    public void bookTicket() {
        // handler.invoke(this,当前方法，args);
        // 每个方法都这么写，相当于调用每个方法的时候都会到invoke调用
    }

    @Override
    public void sing() {
        // handler.invoke(this,当前方法，args);
        // 每个方法都这么写，相当于调用每个方法的时候都会到invoke调用
    }

    @Override
    public void collectMoney() {
        // handler.invoke(this,当前方法，args);
        // 每个方法都这么写，相当于调用每个方法的时候都会到invoke调用
    }
}
