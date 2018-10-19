package com.epam.tasks.homework1.gameGuessingLetters.lettercomparator.impl;

import com.epam.tasks.homework1.gameGuessingLetters.lettercomparator.LetterComparator;

public class LetterComparatorImpl implements LetterComparator {

    @Override
    public boolean isRightLetter(char randomChar, char userChar) {
        if (randomChar > userChar) {
            System.out.println("Too low!");
        }
        if (randomChar < userChar) {
            System.out.println("Too high!");
        }
        return randomChar == userChar;
    }
}
