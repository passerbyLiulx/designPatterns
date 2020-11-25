package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.TicketStrategyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TicketNormalStrategyServiceImpl implements TicketStrategyService {

    private Logger logger = LoggerFactory.getLogger(TicketNormalStrategyServiceImpl.class);

    @Override
    public void sellTicket() {
        logger.info("普通游客没有优惠");
    }
}
