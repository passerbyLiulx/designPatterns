package com.example.designPatterns.Test;

import com.example.designPatterns.service.Impl.TicketChildStrategyServiceImpl;
import com.example.designPatterns.service.Impl.TicketNormalStrategyServiceImpl;
import com.example.designPatterns.service.Impl.TicketStrategyContextServiceImpl;
import com.example.designPatterns.service.Impl.TicketVipStrategyServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 策略模式测试
 */
public class StrategyTest {

    private static Logger logger = LoggerFactory.getLogger(StrategyTest.class);

    public static void main(String[] args) {
        logger.info("普通游客策略：");
        TicketStrategyContextServiceImpl ticketStrategyContextServiceImpl = new TicketStrategyContextServiceImpl(new TicketNormalStrategyServiceImpl());
        ticketStrategyContextServiceImpl.sellTicket();
        logger.info("年卡VIP游客策略：");
        ticketStrategyContextServiceImpl = new TicketStrategyContextServiceImpl(new TicketVipStrategyServiceImpl());
        ticketStrategyContextServiceImpl.sellTicket();
        logger.info("1米2以下儿童策略：");
        ticketStrategyContextServiceImpl = new TicketStrategyContextServiceImpl(new TicketChildStrategyServiceImpl());
        ticketStrategyContextServiceImpl.sellTicket();

    }

}
