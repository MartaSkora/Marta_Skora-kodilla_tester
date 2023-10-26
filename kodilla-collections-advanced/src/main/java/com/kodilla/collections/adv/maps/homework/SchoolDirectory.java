package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> schools = new HashMap<>(); // klucz, wartość
        Principal principalA = new Principal("Albert");
        Principal principalB = new Principal("Bartosz");
        Principal principalC = new Principal("Cezary");

        School schoolA = new School(Arrays.asList(12, 24, 22, 20), "School A");
        School schoolB = new School(Arrays.asList(8, 10, 12), "School B");
        School schoolC = new School(Arrays.asList(25, 26, 20, 27), "School C");

        schools.put(principalA, schoolA);
        schools.put(principalB, schoolB);
        schools.put(principalC, schoolC);

        for (Map.Entry<Principal, School> note : schools.entrySet())
            System.out.println(note.getKey().toString() + note.getValue());
    }


}
