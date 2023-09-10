package com.kodilla.abstracts.homework;
public class Person {
    public static void main(String[] args) {
        String firstName;
        int age;
        String job;

        Accountant accountant = new Accountant();
        accountant.showResponsibilities();

        Mechanic mechanic = new Mechanic();
        mechanic.showResponsibilities();

        Teacher teacher = new Teacher();
        teacher.showResponsibilities();

    }
}
