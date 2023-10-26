package com.kodilla.collections.adv.maps.homework;

import java.util.List;

public class School {
    List<Integer> students;
    private String name;

    public School(List<Integer> students, String name) {
        this.students = students;
        this.name = name;
    }

    public int getStudentsNumber() {
        int sum = 0;
        for (int student : students)
            sum += student;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "Students total number= " + getStudentsNumber() +
                ", name='" + name + '\'' +
                '}';
    }
}
