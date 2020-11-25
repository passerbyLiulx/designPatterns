package com.example.designPatterns.mode;

/**
 * 单例模式-饿汉式
 */
public class SingletonThreeMode {

    /**
     * 创建私有并静态的本类对象
     */
    private static SingletonThreeMode instance = new SingletonThreeMode();

    /**
     * 私有构造函数
     */
    private SingletonThreeMode() {

    }

    /**
     * 对外提供方法，创建并获取本类对象
     * @return
     */
    public static SingletonThreeMode getInstance() {
        return instance;
    }
}
