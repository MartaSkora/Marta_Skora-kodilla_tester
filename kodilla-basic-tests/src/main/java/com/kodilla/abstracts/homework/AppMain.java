package com.kodilla.abstracts.homework;

public class AppMain {

    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic();
        Person person = new Person("Tomasz", 45, mechanic);
        person.showResponsibilities();

    }
}
