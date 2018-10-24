package com.epam.tasks.homework1.gameGuessingLetters.letterprovider.impl;

import com.epam.tasks.homework1.gameGuessingLetters.letterprovider.LetterProvider;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterProviderImplTest {

    @Test
    public void getLetterTrue() {

        LetterProvider letterProvider = new LetterProviderImpl();

        boolean answer = true;
        boolean result = false;

        char letter = letterProvider.getLetter();
        if (letter >= 'a' && letter <= 'z') {
            result = true;
        }

        assertEquals(answer, result);
    }
}
