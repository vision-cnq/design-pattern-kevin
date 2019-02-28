package com.kevin.结构型模式.桥接模式.bridge;

/**
 * @author kevin
 * @version 1.0
 * @description     桥接模式，电脑维度
 * @createDate 2019/2/26
 */
public class Computer2 {

    protected Brand brand;

    public Computer2(Brand brand) {
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }
}

class Desktop2 extends Computer2 {

    public Desktop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}

class Laptop2 extends Computer2 {

    public Laptop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}

class Pad2 extends Computer2 {

    public Pad2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售平板电脑");
    }
}
