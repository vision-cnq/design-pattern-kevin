package com.kevin.结构型模式.组合模式.composite;

/**
 * @author kevin
 * @version 1.0
 * @description     测试组合模式，相对适合树形结构时使用
 * @createDate 2019/1/18
 */
public class Test {

    public static void main(String[] args) {

        AbstractFile f2,f3;

        Folder f1 = new Folder("我的收藏");
        f2 = new ImageFile("照片.jpg");
        f3 = new TextFile("Hello.txt");

        f1.add(f2);
        f1.add(f3);

        //f2.killVirus();

        f1.killVirus();
    }
}
