package com.kevin.结构型模式.组合模式;

/**
 * @author kevin
 * @version 1.0
 * @description     抽象组件
 * @createDate 2019/2/27
 */
public interface Component {

    void operation();
}

// 叶子组件
interface Leaf extends Component {

}

// 容器组件
interface  Composite extends Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);
}

