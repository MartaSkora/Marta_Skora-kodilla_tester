package com.kodilla.inheritance.homework;

public class Windows95 extends OperatingSystem{

    public Windows95(int releaseYear) {
        super(releaseYear); // wywolanie konstruktora z nadklasy
    }

    public void turnOn() {
        System.out.println("Windows95 " + getReleaseYear() + " year");
    }

    @Override
    public void turnOff() {
        System.out.println("shut down the system");
    }
}
