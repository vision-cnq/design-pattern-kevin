package com.kevin.结构型模式.享元模式.flyweight;

/**
 * @author kevin
 * @version 1.0
 * @description     享元类
 * @createDate 2019/3/2
 */
// FlyWeight抽象享元类，声明公共方法
public interface ChessFlyWeight {

    void setColor(String c);
    String getColor();
    void display(Coordinate c);
}

// ConcreteFlyWeight具体享元类，内部状态
class ConcreteChess implements ChessFlyWeight {

    private String color;
    private String size;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色: "+color);
        System.out.println("棋子位置: "+c.getX()+"---"+c.getY());
    }

}
