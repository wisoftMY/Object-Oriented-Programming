package com.park.tiket_sales.chapter2;


// tickerSeller에 대해 캡슐화 진행
public class Theater {
    final private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
