package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.TicketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 代理模式
 */
public class TicketStrategyServiceImpl implements TicketService {

    private Logger logger = LoggerFactory.getLogger(TicketStrategyServiceImpl.class);

    private TicketServiceImpl ticketServiceImpl;

    public TicketStrategyServiceImpl(TicketServiceImpl ticketServiceImpl) {
        this.ticketServiceImpl = ticketServiceImpl;
    }

    @Override
    public void sellTicket() {
        logger.info("欢迎使用车票代售点进行购票，每张票将会收取5元手续费！");
        ticketServiceImpl.sellTicket();
        logger.info("欢迎下次光临！");
    }

    @Override
    public void consult() {
        logger.info("欢迎咨询，咨询不收取费用！");
        ticketServiceImpl.consult();
        logger.info("欢迎下次光临！");
    }

    @Override
    public void returnTicket() {
        logger.info("欢迎使用车票代售点进行退票，每张票将会收取5元手续费！");
        ticketServiceImpl.returnTicket();
        logger.info("欢迎下次光临！");
    }
}
