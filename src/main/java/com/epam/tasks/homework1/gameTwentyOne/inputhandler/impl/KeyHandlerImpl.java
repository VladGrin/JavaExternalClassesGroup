package com.epam.tasks.homework1.gameTwentyOne.inputhandler.impl;

import com.epam.tasks.homework1.gameTwentyOne.inputhandler.KeyHandler;

import java.util.regex.Pattern;

public class KeyHandlerImpl implements KeyHandler {
    @Override
    public boolean dataEntryValidator(String data) {
        boolean isValid = Pattern.compile("^(g|s)$").matcher(String.valueOf(data)).find();
        if (isValid) {
            return true;
        }
        System.out.println("You have entered incorrect data. Try again.");
        return false;
    }


    @Override
    public boolean getResultByPressingKey(int key) {
        return key == 'g';
    }
}
