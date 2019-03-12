package com.kevin.行为型模式.中介者模式.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kevin
 * @version 1.0
 * @description     总经理类
 * @createDate 2019/3/3
 */
public class President implements Mediator {

    private Map<String,Department> map = new HashMap<String, Department>();

    @Override
    public void register(String name, Department d) {
        map.put(name,d);

    }

    @Override
    public void command(String dName) {
        map.get(dName).selfAction();
    }
}
