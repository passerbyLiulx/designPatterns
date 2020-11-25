package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.TicketStrategyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TicketChildStrategyServiceImpl implements TicketStrategyService {

    private Logger logger = LoggerFactory.getLogger(TicketChildStrategyServiceImpl.class);

    @Override
    public void sellTicket() {
        logger.info("1米2以下儿童享受5折优惠");
    }
}
