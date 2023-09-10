package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    private double base;
    private double leftArm;
    private double rightArm;
    private double height;

    public Triangle(double base, double leftArm, double rightArm, double height) {
        this.base = base;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
        this.height = height;
    }


    @Override
    public double getSurfaceArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return leftArm + rightArm + base;
    }
}
