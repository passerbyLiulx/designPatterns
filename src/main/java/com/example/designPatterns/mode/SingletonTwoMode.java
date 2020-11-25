package com.example.designPatterns.mode;

/**
 * 单例模式-懒汉式，线程安全
 */
public class SingletonTwoMode {

    /**
     * 创建私有并静态的本类对象
     */
    private static SingletonTwoMode instance;

    /**
     * 私有构造函数
     */
    private SingletonTwoMode() {

    }

    /**
     * 对外提供方法，创建并获取本类对象
     * @return
     */
    public static synchronized SingletonTwoMode getInstance() {
        if (instance == null) {
            instance = new SingletonTwoMode();
        }
        return instance;
    }
}
