package com.kevin.结构型模式.桥接模式.bridge;

/**
 * @author kevin
 * @version 1.0
 * @description     测试桥接模式
 * @createDate 2019/1/18
 */
public class Test {

    public static void main(String[] args) {

        // 销售联想的笔记本电脑
        Computer2 c = new Laptop2(new Lenovo());
        c.sale();

        // 新增不同的品牌时，只需要到Brand接口中新增即可
        Computer2 c2 = new Desktop2(new Hasee());
        c2.sale();

    }
}
