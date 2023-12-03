package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class CarConfiguration {

    @Bean
    public Car getCar(Season season) {

        Car car = null;

        switch (season) {
                case SUMMER:
                    car = new Cabrio();
                    break;
                case WINTER:
                    car = new SUV();
                    break;
                case SPRING:
                case AUTUMN:
                    car = new Sedan();
                    break;
        }
         return car;
    }

}
