package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }
    @Override
    public double getSurfaceArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
