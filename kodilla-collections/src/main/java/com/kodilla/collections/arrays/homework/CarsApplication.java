package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[RANDOM.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
        }

    public static Car drawCar() {

            int drawnCar = RANDOM.nextInt(3);
            int speed = RANDOM.nextInt(51);

            if (drawnCar == 0)
                return new Mazda(speed);
            else if (drawnCar == 1)
                return new Ford(speed);
            else {
                return new Opel(speed);
            }
    }
}
