package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 4);
        double rectanglePerimeter = rectangle.getPerimeter();
        double rectangleSurfaceArea = rectangle.getSurfaceArea();
        System.out.println("Rectangle's perimeter is " + rectanglePerimeter + " and rectangle's surface area is " + rectangleSurfaceArea);

        Square square = new Square(5);
        double squarePerimeter = square.getPerimeter();
        double squareSurfaceArea = square.getSurfaceArea();
        System.out.println("Square's perimeter is " + squarePerimeter + " and square's surface area is " + squareSurfaceArea);

        Triangle triangle = new Triangle(5,5,5, 3);
        double trianglePerimeter = triangle.getPerimeter();
        double triangleSurfaceArea = triangle.getSurfaceArea();
        System.out.println("Triangle's perimeter is " + trianglePerimeter + " and triangle's surface area is " + triangleSurfaceArea);

    }
}
