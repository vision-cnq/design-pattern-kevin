package com.kevin.行为型模式.迭代器模式;

import com.kevin.行为型模式.迭代器模式.iterator.ConcreteMyAggregate;
import com.kevin.行为型模式.迭代器模式.iterator.MyIterator;

/**
 * @author kevin
 * @version 1.0
 * @description     测试迭代器模式
 * @createDate 2019/1/18
 */
public class Test {

    public static void main(String[] args) {

        ConcreteMyAggregate cma = new ConcreteMyAggregate();
        cma.addObject("aa");
        cma.addObject("bb");
        cma.addObject("cc");

        MyIterator iter = cma.createIterator();
        while (iter.hasNext()){
            System.out.println(iter.getCurrentObj());
            iter.next();
        }

    }
}
