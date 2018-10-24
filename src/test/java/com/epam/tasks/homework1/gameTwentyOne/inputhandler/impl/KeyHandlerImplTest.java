package com.epam.tasks.homework1.gameTwentyOne.inputhandler.impl;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class KeyHandlerImplTest {

    @Test
    public void dataEntryValidatorTrue() {
        KeyHandlerImpl handler = new KeyHandlerImpl();

        boolean answer = true;
        boolean result = handler.dataEntryValidator("g");

        assertEquals(answer, result);
    }

    @Test
    public void dataEntryValidatorFalse() {
        KeyHandlerImpl handler = new KeyHandlerImpl();

        boolean answer = false;
        boolean result = handler.dataEntryValidator("kh");

        assertEquals(answer, result);
    }

    @Test
    public void getResultByPressingKeyTrue() {
        KeyHandlerImpl handler = new KeyHandlerImpl();

        boolean answer = true;
        boolean result = handler.getResultByPressingKey(103);

        assertEquals(answer, result);
    }

    @Test
    public void getResultByPressingKeyFalse() {
        KeyHandlerImpl handler = new KeyHandlerImpl();

        boolean answer = false;
        boolean result = handler.getResultByPressingKey(100);

        assertEquals(answer, result);
    }
}