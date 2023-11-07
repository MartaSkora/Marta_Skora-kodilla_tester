package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();
    public Set<Integer> split(String input) {
        String[] elements = input.split(",");
        Set<Integer> numbers = new HashSet<>();
        for (String element:elements) {
            int value = Integer.parseInt(element);
            numbers.add(value);
        }
        return numbers;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbers.csv")
    public void shouldReturnTrueIfInputIsValid(String trialNumbers) throws InvalidNumbersException {
        Set<Integer> userNumbers = split(trialNumbers);
        int result = gamblingMachine.howManyWins(userNumbers);
        assertTrue(result >= 0 && result <=6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv")
    public void shouldReturnFalseIfInputIsInvalid(String invalidNumbers) throws InvalidNumbersException {
        Set<Integer> userNumbers = split(invalidNumbers);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv")
    public void shouldReturnTrueForNumbersOutOfDeclaredScope(String invalidNumbers) {
        Set<Integer> userNumbers = split(invalidNumbers);
        boolean result = gamblingMachine.isAnyNumberOutOfDeclaredScope(userNumbers);
        assertEquals(true, result);
    }

}