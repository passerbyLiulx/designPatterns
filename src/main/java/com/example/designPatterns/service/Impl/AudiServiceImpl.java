package com.example.designPatterns.service.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AudiServiceImpl extends CarTemplateServiceImpl {

    Logger logger = LoggerFactory.getLogger(AudiServiceImpl.class);

    public AudiServiceImpl(String name) {
        super(name);
    }

    @Override
    protected void buildWheel() {
        logger.info(name + "普通轿车车轮");
    }

    @Override
    protected void buildEngine() {
        logger.info(name + "的汽油发动机");
    }

    @Override
    protected void buildCarbody() {
        logger.info(name + "的豪华舒适性车身");
    }

    @Override
    protected void buildCarlight() {
        logger.info(name + "的独特魔力车灯");
    }
}
