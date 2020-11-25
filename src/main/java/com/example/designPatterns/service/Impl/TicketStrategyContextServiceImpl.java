package com.example.designPatterns.service.Impl;

import com.example.designPatterns.service.TicketStrategyService;

public class TicketStrategyContextServiceImpl {

    private TicketStrategyService ticketStrategyService;

    public TicketStrategyContextServiceImpl(TicketStrategyService ticketStrategyService) {
        this.ticketStrategyService = ticketStrategyService;
    }

    public void setTicketStrategy(TicketStrategyService ticketStrategyService) {
        this.ticketStrategyService = ticketStrategyService;
    }

    public void sellTicket() {
        this.ticketStrategyService.sellTicket();
    }
}
