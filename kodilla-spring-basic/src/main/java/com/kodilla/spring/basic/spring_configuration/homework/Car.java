package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {
    public static boolean hasHeadlightsTurnedOn(LocalTime time){
        return time.isAfter(LocalTime.of(20, 0)) || time.isBefore(LocalTime.of(6, 0));
    }

    public String getCarType();
}
