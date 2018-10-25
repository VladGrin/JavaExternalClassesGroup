package com.epam.tasks.homework1.gameGuessingLetters.validator.impl;

import com.epam.tasks.homework1.gameGuessingLetters.validator.Validator;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class ValidatorImplTest {

    @Test
    public void validateTrue() {
        Validator validator = new ValidatorImpl();

        for (int i = 0; i < 1000; i++) {

            boolean answer = true;

            char ch = (char) (Math.random() * 26 + 97);
            boolean result = validator.validate(String.valueOf(ch));

            assertEquals(answer, result);
        }
    }

    @Test(expected = InputMismatchException.class)
    public void validateFalse() {
        Validator validator = new ValidatorImpl();

        for (int i = 0; i < 1000; i++) {

            char ch = (char) (Math.random() * 256);
            if (ch >= 'a' && ch <= 'z'){
                continue;
            }
            validator.validate(String.valueOf(ch));
        }
    }

}