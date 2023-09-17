package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correctSubtractResult = ResultChecker.assertEquals(-3, subtractResult);
        if (correctSubtractResult) {
            System.out.println("Metoda odejmująca działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmująca nie działa poprawnie dla licz " + a + " i " + b);
        }

        int squareResult = (int) calculator.square(a);
        boolean correctSquareResult = ResultChecker.assertEquals(25, squareResult);
        if (correctSquareResult) {
            System.out.println("Metoda podnoszącą liczbę całkowitą do kwadratu działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda podnoszącą liczbę całkowitą do kwadratu nie działa poprawnie dla liczby " + a);
        }


    }
}