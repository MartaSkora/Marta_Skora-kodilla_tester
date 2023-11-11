package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> providePersonsForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.75, 70), "Normal (healthy weight)"),
                Arguments.of(new Person(1.8, 58), "Underweight"),
                Arguments.of(new Person(1.7, 100), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.65, 80), "Overweight"),
                Arguments.of(new Person(1.6, 40), "Severely underweight"),
                Arguments.of(new Person(1.7, 300), "Obese Class VI (Hyper Obese)"),
                Arguments.of(new Person(1.9, 30), "Very severely underweight")
        );
    }
}
