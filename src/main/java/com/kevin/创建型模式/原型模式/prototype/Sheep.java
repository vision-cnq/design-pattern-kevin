package com.kevin.创建型模式.原型模式.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kevin
 * @version 1.0
 * @description     浅克隆
 * @createDate 2019/2/21
 */
public class Sheep implements Cloneable,Serializable {

    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();     // 直接调用object对象的clone()方法
        return obj;
    }

    public Sheep() {
    }

    public Sheep(String sname, Date birthday) {
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
