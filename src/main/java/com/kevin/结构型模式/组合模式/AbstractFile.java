package com.kevin.结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin
 * @version 1.0
 * @description     抽象构建
 * @createDate 2019/2/27
 */
public interface AbstractFile {

    void killVirus();
}

// 叶子组件
class ImageFile implements AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("图像文件: "+name+"，进行查杀");
    }
}

// 叶子组件
class TextFile implements AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("文本文件: "+name+"，进行查杀");
    }
}

// 叶子组件
class VideoFile implements AbstractFile {

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("视频文件: "+name+"，进行查杀");
    }
}

// 容器组件
class Folder implements AbstractFile {

    private String name;

    // 定义容器，用来存放本容器构建的子节点
    private List<AbstractFile> list = new ArrayList<>();

    public void add(AbstractFile file) {
        list.add(file);
    }

    public void remove(AbstractFile file) {
        list.remove(file);
    }

    public AbstractFile getChild(int index) {
        return list.get(index);
    }

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("文件夹: " + name + ",进行查杀");

        for (AbstractFile file : list) {
            file.killVirus(); // 递归
        }
    }


}