package com.kevin.行为型模式.状态模式.state;

/**
 * @author kevin
 * @version 1.0
 * @description     房间状态，当切换不同状态时会切换不同状态下的不同行为
 * 上下文
 * @createDate 2019/3/4
 */
// 环境类
public class Context {

    // 如果是银行系统，这个Context类就是账号，根据金额不同，切换不同的状态
    private State state;    // 房间状态

    public void setState(State state) {
        System.out.println("修改状态");
        this.state = state;
        state.handle();
    }

    public static void main(String[] args) {


    }
}
