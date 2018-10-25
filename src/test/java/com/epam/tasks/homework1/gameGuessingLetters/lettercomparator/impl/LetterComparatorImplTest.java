package com.epam.tasks.homework1.gameGuessingLetters.lettercomparator.impl;

import com.epam.tasks.homework1.gameGuessingLetters.lettercomparator.LetterComparator;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterComparatorImplTest {

    @Test
    public void isRightLetterTrue() {

        LetterComparator letterComparator = new LetterComparatorImpl();

        for (int i = 0; i < 1000; i++) {

            char symbol = (char) (Math.random() * 97 + 26);
            char randomChar = symbol;
            char userChar = symbol;

            boolean value = letterComparator.isRightLetter(randomChar, userChar);

            assertTrue(value);
        }
    }

    @Test
    public void isRightLetterFalse() {
        LetterComparator letterComparator = new LetterComparatorImpl();

        for (int i = 0; i < 10000; i++) {
            boolean answer = false;
            char randomChar = 'a';
            char userChar = (char) (Math.random() * 256);
            if (userChar == 'a') {
                continue;
            }
            boolean value = letterComparator.isRightLetter(randomChar, userChar);
            assertEquals(answer, value);
        }
    }
}