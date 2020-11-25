package com.example.designPatterns.service.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LandRoverServiceImpl extends CarTemplateServiceImpl {

    Logger logger = LoggerFactory.getLogger(LandRoverServiceImpl.class);

    public LandRoverServiceImpl(String name) {
        super(name);
    }

    @Override
    protected void buildWheel() {
        logger.info(name + "的越野车轮");
    }

    @Override
    protected void buildEngine() {
        logger.info(name + "的柴油发动机");
    }

    @Override
    protected void buildCarbody() {
        logger.info(name + "的SUV越野车型");
    }

    @Override
    protected void buildCarlight() {
        logger.info(name + "的普通车灯");
    }
}
