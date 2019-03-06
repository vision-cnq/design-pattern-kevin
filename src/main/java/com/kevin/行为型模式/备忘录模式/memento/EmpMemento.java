package com.kevin.行为型模式.备忘录模式.memento;

/**
 * @author kevin
 * @version 1.0
 * @description     备忘录类
 * @createDate 2019/3/4
 */
public class EmpMemento {

    private String ename;
    private int age;
    private double salary;

    public EmpMemento(Emp e) {
        this.ename = e.getEname();
        this.age = e.getAge();
        this.salary = e.getSalary();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
