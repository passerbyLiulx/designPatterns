package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.ObServableService;
import com.example.designPatterns.service.ObServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class WeChatServerServiceImpl implements ObServableService {

    Logger logger = LoggerFactory.getLogger(WeChatServerServiceImpl.class);
    private List<ObServerService> list;

    private String message;

    public WeChatServerServiceImpl() {
        list = new ArrayList<ObServerService>();
    }

    @Override
    public void registerObserver(ObServerService observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(ObServerService observer) {
        if (!list.isEmpty()) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++){
            ObServerService observer = list.get(i);
            observer.update(message);
        }
    }

    public void infomation(String s){
        this.message = s;
        logger.info("公众号推送消息是" + s);
        notifyObserver();
    }
}
