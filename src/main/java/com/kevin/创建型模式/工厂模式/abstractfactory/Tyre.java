package com.kevin.创建型模式.工厂模式.abstractfactory;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author kevin
 * @version 1.0
 * @description     轮胎
 * @createDate 2019/2/17
 */
public interface Tyre {

    void revolve();
}

class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转不磨损。");
    }
}

class LowTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转磨损快。");
    }
}
