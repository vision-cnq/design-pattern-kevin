package com.kevin.结构型模式.桥接模式.bridge;

/**
 * @author kevin
 * @version 1.0
 * @description     品牌维度
 * @createDate 2019/2/26
 */
public interface Brand {

    void sale();
}

class Lenovo implements Brand{

    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}

class Dell implements Brand{

    @Override
    public void sale() {
        System.out.println("销售戴尔电脑");
    }
}

class Hasee implements Brand{

    @Override
    public void sale() {
        System.out.println("销售神舟电脑");
    }
}
