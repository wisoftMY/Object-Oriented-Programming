package com.park.movie_ticket_reservation;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
