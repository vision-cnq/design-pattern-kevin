package com.kevin.创建型模式.原型模式.prototype;

import java.util.Date;

/**
 * @author kevin
 * @version 1.0
 * @description     深克隆
 * @createDate 2019/2/21
 */
public class Sheep2 implements Cloneable{

    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();     // 直接调用object对象的clone()方法

        // 添加如下代码实现深复制（deep Clone）
        Sheep2 s = (Sheep2) obj;
        s.birthday = (Date) this.birthday.clone();      // 将属性也进行克隆
        return obj;
    }

    public Sheep2() {
    }

    public Sheep2(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
