package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;


@Configuration
public class CarConfiguration {

    @Bean
    public Car getCar() {

        LocalDate localDate = LocalDate.now();
        Month month = localDate.getMonth();

        Car car = null;

        switch (month) {
            case JUNE:
            case JULY:
            case AUGUST:
                    car = new Cabrio();
                    break;
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                    car = new SUV();
                    break;
            default:
                    car = new Sedan();
                    break;
        }
         return car;
    }

}
