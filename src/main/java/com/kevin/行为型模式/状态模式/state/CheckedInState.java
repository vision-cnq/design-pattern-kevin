package com.kevin.行为型模式.状态模式.state;

/**
 * @author kevin
 * @version 1.0
 * @description     具体状态，已入住状态
 * @createDate 2019/3/4
 */
public class CheckedInState implements State{
    
    @Override
    public void handle() {
        System.out.println("房间已入住，请勿打扰!");
    }
}
