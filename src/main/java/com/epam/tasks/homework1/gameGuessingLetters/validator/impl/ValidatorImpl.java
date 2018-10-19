package com.epam.tasks.homework1.gameGuessingLetters.validator.impl;

import com.epam.tasks.homework1.gameGuessingLetters.validator.Validator;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class ValidatorImpl implements Validator {

    public boolean validate(String letter) {
        boolean isLetter = Pattern.compile("^[a-z]{1}$").matcher(letter).find();
        if (!isLetter) {
            throw new InputMismatchException();
        }
        return true;
    }
}
