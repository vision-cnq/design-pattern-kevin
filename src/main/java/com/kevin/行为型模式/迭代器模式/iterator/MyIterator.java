package com.kevin.行为型模式.迭代器模式.iterator;

/**
 * @author kevin
 * @version 1.0
 * @description     自定义的迭代器接口
 * @createDate 2019/3/3
 */
public interface MyIterator {

    void first();   // 将游标指向第一个元素
    void next();    // 将游标指标下一个元素
    boolean hasNext();  // 判断是否存在下一个元素

    boolean isFirst();  // 判断是否为第一个元素
    boolean isLast();   // 判断是否为最后一个元素

    Object getCurrentObj(); // 获取当前游标指向的对象
}
