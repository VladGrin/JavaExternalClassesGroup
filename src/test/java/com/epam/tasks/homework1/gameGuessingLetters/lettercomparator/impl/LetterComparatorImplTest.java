package com.epam.tasks.homework1.gameGuessingLetters.lettercomparator.impl;

import com.epam.tasks.homework1.gameGuessingLetters.lettercomparator.LetterComparator;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterComparatorImplTest {

    @Test
    public void isRightLetterTrue() {

        LetterComparator letterComparator = new LetterComparatorImpl();

        boolean answer = true;
        char randomChar = 'g';
        char userChar = 'g';

        boolean value = letterComparator.isRightLetter(randomChar, userChar);

        assertEquals(answer, value);
    }

    @Test
    public void isRightLetterFalse() {
        LetterComparator letterComparator = new LetterComparatorImpl();

        boolean answer = false;
        char randomChar = 'g';
        char userChar = 'n';

        boolean value = letterComparator.isRightLetter(randomChar, userChar);

        assertEquals(answer, value);
    }
}