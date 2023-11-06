package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"validUsername", "anotherValid123", "user_1"})
    public void shouldReturnTrueForValidUsernames(String username) {
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", ".", "xd"})
    public void shouldReturnFalseForInvalidUsernames(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource({
            "valid.email@example.com, true",
            "invalid.email@.com, false",
            "another@invalid.com., false",
            "null@example.com, true"})
    public void shouldReturnValidatedEmail(String email, boolean expected) {
        assertEquals(expected, userValidator.validateEmail(email));
    }

}