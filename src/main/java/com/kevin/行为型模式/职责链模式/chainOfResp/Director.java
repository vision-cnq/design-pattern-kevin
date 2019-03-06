package com.kevin.行为型模式.职责链模式.chainOfResp;

/**
 * @author kevin
 * @version 1.0
 * @description     主任
 * @createDate 2019/3/3
 */
public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handRequest(LeaveRequest request) {
        if(request.getLeaveDays() < 3) {
            System.out.println("员工: " + request.getEmpName() + "请假，天数:" + request.getLeaveDays() + ",理由: " + request.getReason());
            System.out.println("主任: " + this.name + "审批通过...");
        }else {
            if(this.nextLeader != null) {
                this.nextLeader.handRequest(request);
            }
        }
    }
}
