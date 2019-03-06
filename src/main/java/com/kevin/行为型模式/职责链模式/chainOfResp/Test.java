package com.kevin.行为型模式.职责链模式.chainOfResp;


/**
 * @author kevin
 * @version 1.0
 * @description     测试职责链模式
 * 案例：
 *  我们可以在请假处理流程中，增加新的“副总经理”角色，审批大于等于
 * 10天，小于20天的请假。审批流程变为：
 * ① 如果请假天数小于3天，主任审批
 * ② 如果请假天数大于等于3天，小于10天，经理审批
 * ③ 大于等于10天，小于20天的请假，副总经理审批
 * ④ 如果大于等于20天，小于30天，总经理审批
 * ⑤ 如果大于等于30天，提示拒绝
 *
 * @createDate 2019/1/18
 */
public class Test {

    public static void main(String[] args) {
        Leader a = new Director("张三");  // 主任
        Leader b = new Manager("李四");   // 经理
        Leader c = new ViceGeneralManager("王五");    // 副总经理
        Leader d = new GeneralManager("马六");    // 总经理

        // 组织责任链对象的关系
        a.setNextLeader(b); // 主任的上级领导是经理
        b.setNextLeader(c); // 经理的上级领导是副总经理
        c.setNextLeader(d); // 副总经理的上级领导是总经理

        // 开始请假操作
        LeaveRequest tom = new LeaveRequest("Tom",19,"回英国探亲!");
        a.handRequest(tom);
    }
}
