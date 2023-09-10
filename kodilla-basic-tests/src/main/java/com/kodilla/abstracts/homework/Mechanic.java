package com.kodilla.abstracts.homework;

public class Mechanic extends Job {
    public Mechanic() {
        super(7000, "building and assembling machines, inspecting them and conducting repairs.");
    }
    @Override
    public void showSalary() {
        System.out.println("Mechanic's salary is " + getSalary());
    }
    @Override
    public void showResponsibilities() {
        System.out.println("Mechanic's responsibilities are " + getResponsibilities());
    }
}
