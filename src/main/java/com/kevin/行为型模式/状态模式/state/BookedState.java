package com.kevin.行为型模式.状态模式.state;

/**
 * @author kevin
 * @version 1.0
 * @description     预订状态
 * @createDate 2019/3/4
 */
public class BookedState implements State{
    
    @Override
    public void handle() {
        System.out.println("房间已预订，别人不能订!");
    }
}
