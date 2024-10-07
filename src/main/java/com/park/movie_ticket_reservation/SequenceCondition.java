package com.park.movie_ticket_reservation;

public class SequenceCondition implements DiscountCondition {
    final private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
