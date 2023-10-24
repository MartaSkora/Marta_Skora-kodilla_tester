package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Mazda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Mazda> cars = new ArrayList<>();
        Mazda mazdaToBeRemoved = new Mazda(120);
        cars.add(new Mazda(90));
        cars.add(new Mazda(100));
        cars.add(new Mazda(50));
        cars.add(mazdaToBeRemoved);

        for (Mazda mazda : cars) {
            CarUtils.describeCar(mazda);
        }

        cars.remove(1);
        cars.remove(mazdaToBeRemoved);

        System.out.println("Size: " + cars.size());
        for (Mazda mazda : cars) {
            CarUtils.describeCar(mazda);
        }
    }
}
