package com.kevin.行为型模式.职责链模式.chainOfResp;

/**
 * @author kevin
 * @version 1.0
 * @description     总经理
 * @createDate 2019/3/3
 */
public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handRequest(LeaveRequest request) {
        if(request.getLeaveDays() < 30) {
            System.out.println("员工: " + request.getEmpName() + "请假，天数:" + request.getLeaveDays() + ",理由: " + request.getReason());
            System.out.println("总经理: " + this.name + "审批通过...");
        }else {
            System.out.println(request.getEmpName() + "请假: " + request.getLeaveDays() + "天，审批不通过...");
        }
    }
}
