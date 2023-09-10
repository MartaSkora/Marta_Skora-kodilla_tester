package com.kodilla.abstracts.homework;

public class Teacher extends Job {

    public Teacher() {
        super(4000, "encouraging and teaching students, and providing resources.");
    }

    @Override
    public void showSalary() {
        System.out.println("Teacher's salary is " + getSalary());
    }
    @Override
    public void showResponsibilities() {
        System.out.println("Teacher's responsibilities are " + getResponsibilities());
    }
}
