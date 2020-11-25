package com.example.designPatterns.mode;

/**
 * 单例模式-懒汉式，线程不安全
 */
public class SingletonOneMode {

    /**
     * 创建私有并静态的本类对象
     */
    private static SingletonOneMode instance;

    /**
     * 私有构造函数
     */
    private SingletonOneMode() {

    }

    /**
     * 对外提供方法，创建并获取本类对象
     * @return
     */
    public static SingletonOneMode getInstance() {
        if (instance == null) {
            instance = new SingletonOneMode();
        }
        return instance;
    }
}
