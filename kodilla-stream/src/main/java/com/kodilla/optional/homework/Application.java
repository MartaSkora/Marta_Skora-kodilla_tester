package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class Application {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Adrianna", new Teacher("Mrs Smith")));
        studentList.add(new Student("Ben", new Teacher("Mrs Smith")));
        studentList.add(new Student("Chad", null));
        studentList.add(new Student("Diana", new Teacher("Mr Black")));
        studentList.add(new Student("Elena", new Teacher("Mr Black")));
        studentList.add(new Student("Fiona", null));

        for(Student student : studentList) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            System.out.println("Student's name: " + student.getName() + " Teacher's name: "
                     + optionalTeacher.orElse(new Teacher("<undefined>")).getName());
        }


    }
}
