package com.epam.tasks.homework1.gameGuessingLetters.letterprovider.impl;

import com.epam.tasks.homework1.gameGuessingLetters.letterprovider.LetterProvider;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterProviderImplTest {

    @Test
    public void getLetter() {

        LetterProvider letterProvider = new LetterProviderImpl();

        boolean answer = true;
        boolean result = false;

        char letter = letterProvider.getLetter();
        if ('a' <= letter && 'z' >= letter) {
            result = true;
        }

        assertEquals(answer, result);
    }
}
