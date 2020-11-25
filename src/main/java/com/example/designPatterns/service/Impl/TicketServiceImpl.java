package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.TicketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TicketServiceImpl implements TicketService {

    private Logger logger = LoggerFactory.getLogger(TicketServiceImpl.class);

    @Override
    public void sellTicket() {
        logger.info("售票");
    }

    @Override
    public void consult() {
        logger.info("咨询");
    }

    @Override
    public void returnTicket() {
        logger.info("退票");
    }
}
