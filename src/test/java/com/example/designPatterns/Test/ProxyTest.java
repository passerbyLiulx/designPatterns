package com.example.designPatterns.Test;

import com.example.designPatterns.service.Impl.TicketStrategyServiceImpl;
import com.example.designPatterns.service.Impl.TicketServiceImpl;

/**
 * 代理模式测试
 */
public class ProxyTest {
    public static void main(String[] args) {
        TicketStrategyServiceImpl ticketProxy = new TicketStrategyServiceImpl(new TicketServiceImpl());
        ticketProxy.sellTicket();
        ticketProxy.consult();
        ticketProxy.returnTicket();
    }
}
