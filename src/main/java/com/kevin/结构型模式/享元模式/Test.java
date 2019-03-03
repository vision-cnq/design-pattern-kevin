package com.kevin.结构型模式.享元模式;

import com.kevin.结构型模式.享元模式.flyweight.ChessFlyWeight;
import com.kevin.结构型模式.享元模式.flyweight.ChessFlyWeightFactory;
import com.kevin.结构型模式.享元模式.flyweight.Coordinate;

/**
 * @author kevin
 * @version 1.0
 * @description     测试享元模式
 * @createDate 2019/1/18
 */
public class Test {

    public static void main(String[] args) {

        // 颜色是内部状态，使用的是同一个对象
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("增加外部状态的处理...");
        chess1.display(new Coordinate(10,10));
        chess2.display(new Coordinate(20,20));

    }

}
