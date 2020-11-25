package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.ObServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserServiceImpl implements ObServerService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private String name;

    private String message;

    public UserServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        logger.info(name + "接收到推送消息" + message);
    }
}
