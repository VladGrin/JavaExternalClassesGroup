package com.epam.tasks.homework1.gameTwentyOne.inputhandler.impl;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KeyHandlerImplTest {

    @Test
    public void dataEntryValidatorTrue() {
        KeyHandlerImpl handler = new KeyHandlerImpl();

        boolean result = handler.dataEntryValidator("g");
        assertTrue(result);
        result = handler.dataEntryValidator("s");
        assertTrue(result);
    }

    @Test
    public void dataEntryValidatorFalse() {
        KeyHandlerImpl handler = new KeyHandlerImpl();
        for (int i = 0; i < 100000; i++) {

            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < (int)(Math.random() * 20); j++) {
                stringBuilder.append((char) (Math.random() * 256));
            }
            String string = stringBuilder.toString().trim();

            if(string.equals("g") || string.equals("s")){
                continue;
            }

            boolean result = handler.dataEntryValidator(string);
            assertFalse(result);
        }
    }

    @Test
    public void getResultByPressingKeyTrue() {
        KeyHandlerImpl handler = new KeyHandlerImpl();

        boolean result = handler.getResultByPressingKey(103);

        assertTrue(result);
    }

    @Test
    public void getResultByPressingKeyFalse() {
        KeyHandlerImpl handler = new KeyHandlerImpl();

        for (int i = 0; i < 1000; i++) {
            int number = (int) (Math.random() * 256);
            if (number == 103) {
                continue;
            }
            boolean result = handler.getResultByPressingKey(number);

            assertFalse(result);
        }
    }
}