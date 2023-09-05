package com.kodilla.inheritance.homework;

public class MacOSX extends OperatingSystem {

    public MacOSX(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println(getReleaseYear() + " was the release year.");
    }
    @Override
    public void turnOff() {
        System.out.println("Shutting down.");

    }
}
