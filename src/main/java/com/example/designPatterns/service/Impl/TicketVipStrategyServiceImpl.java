package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.TicketStrategyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TicketVipStrategyServiceImpl implements TicketStrategyService {

    private Logger logger = LoggerFactory.getLogger(TicketVipStrategyServiceImpl.class);

    @Override
    public void sellTicket() {
        logger.info("办年卡游客享受8折优惠");
    }
}
