package com.park.movie_ticket_reservation;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);

}
