package com.epam.tasks.homework1.gameTwentyOne.keyhandler.impl;

import com.epam.tasks.homework1.gameTwentyOne.keyhandler.KeyHandler;

import java.util.regex.Pattern;

public class KeyHandlerImpl implements KeyHandler {
    @Override
    public boolean dataEntryValidator(String data) {
        boolean isValid = Pattern.compile("^[g|s]{1}$").matcher(String.valueOf(data)).find();
        if (!isValid) {
            System.out.println("You have entered incorrect data. Try again.");
            return false;
        }
        return true;
    }


    @Override
    public boolean getResultByPressingKey(int key) {
        return key == 'g';
    }
}
