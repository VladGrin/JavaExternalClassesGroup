package com.epam.tasks.homework1.gameGuessingLetters.letterprovider.impl;

import com.epam.tasks.homework1.gameGuessingLetters.letterprovider.LetterProvider;

public class LetterProviderImpl implements LetterProvider {

    @Override
    public char getLetter() {
        return (char) (Math.random() * 26 + 97);
    }
}
