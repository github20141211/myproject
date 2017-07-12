package com.java.main;

/**
 * 功能描述
 * 创建人 luocheng
 * 创建时间2017/7/10.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("hello main... git");
        for (int i = 0; i < 10; i++) {
            System.out.println(sayHello(i));
        }
    }

    public static String sayHello(int i) {
        return "hello--->" + i;
    }
}
