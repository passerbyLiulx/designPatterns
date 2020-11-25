package com.example.designPatterns.service;

public interface ObServableService {

    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(ObServerService observer);

    /**
     * 取消观察者
     * @param observer
     */
    void removeObserver(ObServerService observer);

    /**
     * 通知所有观察者更新消息
     */
    void notifyObserver();
}
