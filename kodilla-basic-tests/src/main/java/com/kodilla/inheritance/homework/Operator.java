package com.kodilla.inheritance.homework;

public class Operator {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1990);
        operatingSystem.turnOn();

        Windows95 windows95 = new Windows95(1995);
        windows95.turnOn();
        windows95.turnOff();

        MacOSX macOSX = new MacOSX(2001);
        macOSX.turnOn();
        macOSX.turnOff();
    }

}
