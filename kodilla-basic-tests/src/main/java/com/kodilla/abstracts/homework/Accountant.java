package com.kodilla.abstracts.homework;

public class Accountant extends Job {

    public Accountant() {
        super(6000, "dealing with taxes and managing all accounting transactions.");
    }
    @Override
    public void showSalary() {
        System.out.println("Accountant's salary is " + getSalary());
    }
    @Override
    public void showResponsibilities() {
        System.out.println("Accountant's responsibilities are " + getResponsibilities());
    }
}
