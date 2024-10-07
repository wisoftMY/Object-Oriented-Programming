package com.park.movie_ticket_reservation;

public class Reservation {

    final private Customer customer;
    final private Screening screening;
    final private Money fee;
    final private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
