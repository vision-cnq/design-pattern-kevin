package com.kevin.行为型模式.备忘录模式.memento;

/**
 * @author kevin
 * @version 1.0
 * @description     测试备忘录模式
 * @createDate 2019/1/18
 */
public class Test {

    public static void main(String[] args) {

        CareTaker taker = new CareTaker();
        Emp emp = new Emp("KEVIN", 20, 10000);
        System.out.println("第一次打印对象: "+ emp.getEname() + "," + emp.getAge()+"," +emp.getSalary());
        // 备份数据
        taker.setMemento(emp.memento());

        emp.setAge(18);
        emp.setEname("COCO");
        emp.setSalary(9000);

        System.out.println("第二次打印对象: "+ emp.getEname() + "," + emp.getAge()+"," +emp.getSalary());

        emp.recovery(taker.getMemento());   // 恢复到备忘录对象保存的状态

        System.out.println("第三次打印对象: "+ emp.getEname() + "," + emp.getAge()+"," +emp.getSalary());

    }
}
