package com.epam.tasks.homework1.gameGuessingLetters.validator.impl;

import com.epam.tasks.homework1.gameGuessingLetters.validator.Validator;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class ValidatorImplTest {

    @Test
    public void validateTrue() {
        Validator validator = new ValidatorImpl();

        boolean answer = true;
        boolean result = validator.validate("h");

        assertEquals(answer, result);
    }

    @Test(expected = InputMismatchException.class)
    public void validateFalse() {
        Validator validator = new ValidatorImpl();

        validator.validate("9");
    }

    @Test(expected = InputMismatchException.class)
    public void validateLength() {
        Validator validator = new ValidatorImpl();

        validator.validate("9");
    }

    @Test(expected = InputMismatchException.class)
    public void validateNull() {
        Validator validator = new ValidatorImpl();

        validator.validate("9");
    }

    @Test(expected = InputMismatchException.class)
    public void validateEmpty() {
        Validator validator = new ValidatorImpl();

        validator.validate("9");
    }
}