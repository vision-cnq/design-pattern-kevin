package com.kevin.行为型模式.迭代器模式.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin
 * @version 1.0
 * @description     自定的聚合类
 * @createDate 2019/3/3
 */
public class ConcreteMyAggregate {

    private List<Object> list = new ArrayList<Object>();

    public ConcreteMyAggregate() {}

    public ConcreteMyAggregate(List<Object> list) {
        this.list = list;
    }

    // 添加
    public void addObject(Object obj){
        this.list.add(obj);
    }
    // 删除
    public void removeObject(Object obj) {
        this.list.remove(obj);
    }
    // 获取
    public List<Object> getList() {
        return list;
    }
    // 修改
    public void setList(List<Object> list) {
        this.list = list;
    }

    // 获取迭代器
    public MyIterator createIterator() {
        return new ConreteIterator();
    }


    // 使用内部类定义迭代器，可以直接使用外部类的属性
    private class ConreteIterator implements MyIterator {

        private int cursor;     // 定义游标用于记录遍历时的位置

        @Override
        public void first() {
            // 第一个，设置游标为0
            cursor = 0;
        }

        @Override
        public void next() {
            // 下一个，判断是否为最后一个数据，如果不是则游标+1
            if(cursor<list.size()){
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            // 是否存在下一个，判断游标是否小于list的长度，是则存在下一个
            if(cursor < list.size()){
                return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            // 是否为第一个，判断游标是否为0，是返回true，否则返回false
            return cursor == 0 ? true : false;
        }

        @Override
        public boolean isLast() {
            // 是否有最后一个，游标等于list的长度，是返回true，否则返回false
            return cursor == (list.size()-1) ? true : false;
        }

        @Override
        public Object getCurrentObj() {
            // 获取当前游标指向的对象
            return list.get(cursor);
        }
    }

}
