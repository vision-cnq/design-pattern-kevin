package com.kevin.行为型模式.职责链模式.chainOfResp;

/**
 * @author kevin
 * @version 1.0
 * @description     经理
 * @createDate 2019/3/3
 */
public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    // 责任链操作
    @Override
    public void handRequest(LeaveRequest request) {
        if(request.getLeaveDays() >= 3 && request.getLeaveDays() < 10) {
            System.out.println("员工: " + request.getEmpName() + "请假，天数:" + request.getLeaveDays() + ",理由: " + request.getReason());
            System.out.println("经理: " + this.name + "审批通过...");
        }else {
            // 如果当前责任链无法处理会转向下家责任链
            if(this.nextLeader != null) {
                this.nextLeader.handRequest(request);
            }
        }
    }
}
