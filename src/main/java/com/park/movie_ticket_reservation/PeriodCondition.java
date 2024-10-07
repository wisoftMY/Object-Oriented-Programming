package com.park.movie_ticket_reservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {
    final private DayOfWeek dayOfWeek;
    final private LocalTime startTime;
    final private LocalTime endTime;


    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                !startTime.isAfter(screening.getStartTime().toLocalTime()) &&
                !endTime.isBefore(screening.getStartTime().toLocalTime());
    }
}
