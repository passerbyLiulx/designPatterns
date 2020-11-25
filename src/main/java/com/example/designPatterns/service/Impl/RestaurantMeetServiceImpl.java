package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestaurantMeetServiceImpl implements RestaurantService {

    private Logger logger = LoggerFactory.getLogger(RestaurantMeetServiceImpl.class);

    @Override
    public void cook() {
        logger.info("来一份回锅肉");
    }
}
