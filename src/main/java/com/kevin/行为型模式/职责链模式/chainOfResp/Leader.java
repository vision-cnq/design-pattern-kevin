package com.kevin.行为型模式.职责链模式.chainOfResp;

/**
 * @author kevin
 * @version 1.0
 * @description     抽象类
 * @createDate 2019/3/3
 */
public abstract class Leader {

    protected String name;
    protected Leader nextLeader;    // 责任链上的后继对象

    public Leader(String name) {
        this.name = name;
    }

    // 设定责任链上的后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    // 处理请求的核心的业务方法
    public abstract void handRequest(LeaveRequest request);

}
