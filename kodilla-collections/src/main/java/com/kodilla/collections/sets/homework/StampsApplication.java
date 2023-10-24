package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("First", "Medium", true));
        stamps.add(new Stamp("Second", "Small", false));
        stamps.add(new Stamp("Third", "Big", true));
        stamps.add(new Stamp("Third", "Big", true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
