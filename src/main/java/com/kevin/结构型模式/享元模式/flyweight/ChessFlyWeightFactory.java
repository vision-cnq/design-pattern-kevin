package com.kevin.结构型模式.享元模式.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kevin
 * @version 1.0
 * @description     FlyWeightFactory享元工厂类，创建并管理享元对象
 * @createDate 2019/3/3
 */
public class ChessFlyWeightFactory {

    // 享元池
    private static Map<String,ChessFlyWeight> map = new HashMap<String,ChessFlyWeight>();

    public static ChessFlyWeight getChess(String color){

        if(map.get(color) != null){
            return map.get(color);
        }else {
            ChessFlyWeight cfw = new ConcreteChess(color);
            map.put(color,cfw);
            return cfw;
        }


    }

}
