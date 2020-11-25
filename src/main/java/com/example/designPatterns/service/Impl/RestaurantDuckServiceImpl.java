package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestaurantDuckServiceImpl implements RestaurantService {

    private Logger logger = LoggerFactory.getLogger(RestaurantDuckServiceImpl.class);

    @Override
    public void cook() {
        logger.info("来一份烤鸭");
    }
}
