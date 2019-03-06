package com.kevin.创建型模式.单例模式.singleton;

import com.kevin.创建型模式.单例模式.singleton.SingletonDemo2;
import com.kevin.创建型模式.单例模式.singleton.SingletonDemo3;
import com.kevin.创建型模式.单例模式.singleton.SingletonDemo4;
import com.kevin.创建型模式.单例模式.singleton.SingletonDemo5;

import java.util.concurrent.CountDownLatch;

/**
 * @author kevin
 * @version 1.0
 * @description     测试5种单例模式的效率
 * @createDate 2019/2/17
 */
public class Test3 {

    public static void main(String[] args) throws Exception {
        test1();
        test2();
        test3();
        test4();
        test5();

    }

    public static void test1() throws Exception {
        long start = System.currentTimeMillis();
        int threadNum = 10; // 线程数
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        Object o = SingletonDemo1.getInstance();
                    }
                    countDownLatch.countDown(); // 每次线程执行完将计数器减一
                }
            }).start();
        }

        countDownLatch.await(); // main线程阻塞，直到计数器变为0，才会继续往下执行

        long end = System.currentTimeMillis();
        System.out.println("饿汉式总耗时: " + (end-start));
    }

    public static void test2() throws Exception {
        long start = System.currentTimeMillis();
        int threadNum = 10; // 线程数
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        Object o = SingletonDemo2.getInstance();
                    }
                    countDownLatch.countDown(); // 每次线程执行完将计数器减一
                }
            }).start();
        }

        countDownLatch.await(); // main线程阻塞，直到计数器变为0，才会继续往下执行

        long end = System.currentTimeMillis();
        System.out.println("懒汉式总耗时: " + (end-start));
    }

    public static void test3() throws Exception {
        long start = System.currentTimeMillis();
        int threadNum = 10; // 线程数
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        Object o = SingletonDemo3.getInstance();
                    }
                    countDownLatch.countDown(); // 每次线程执行完将计数器减一
                }
            }).start();
        }

        countDownLatch.await(); // main线程阻塞，直到计数器变为0，才会继续往下执行

        long end = System.currentTimeMillis();
        System.out.println("双重检测锁式总耗时: " + (end-start));
    }

    public static void test4() throws Exception {
        long start = System.currentTimeMillis();
        int threadNum = 10; // 线程数
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        Object o = SingletonDemo4.getInstance();
                    }
                    countDownLatch.countDown(); // 每次线程执行完将计数器减一
                }
            }).start();
        }

        countDownLatch.await(); // main线程阻塞，直到计数器变为0，才会继续往下执行

        long end = System.currentTimeMillis();
        System.out.println("静态内部类式总耗时: " + (end-start));
    }

    public static void test5() throws Exception {
        long start = System.currentTimeMillis();
        int threadNum = 10; // 线程数
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        Object o = SingletonDemo5.INSTANCE;
                    }
                    countDownLatch.countDown(); // 每次线程执行完将计数器减一
                }
            }).start();
        }

        countDownLatch.await(); // main线程阻塞，直到计数器变为0，才会继续往下执行

        long end = System.currentTimeMillis();
        System.out.println("枚举式总耗时: " + (end-start));
    }

}
