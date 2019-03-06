package com.kevin.行为型模式.状态模式.state;

/**
 * @author kevin
 * @version 1.0
 * @description     测试状态模式
 * @createDate 2019/1/18
 */
public class Test {

    public static void main(String[] args) {

        Context ctx = new Context();
        ctx.setState(new FreeState());

        ctx.setState(new BookedState());

    }
}
