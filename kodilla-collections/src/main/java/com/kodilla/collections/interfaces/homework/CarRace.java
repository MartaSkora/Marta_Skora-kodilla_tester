package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Ford ford = new Ford(75);
        doRace(ford);

        Mazda mazda = new Mazda(90);
        doRace(mazda);

        Opel opel = new Opel(50);
        doRace(opel);

    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());

    }
}
