package com.epam.tasks.homework1.gameTwentyOne.inputhandler.impl;

import com.epam.tasks.homework1.gameTwentyOne.inputhandler.InputHandler;
import com.epam.tasks.homework1.gameTwentyOne.inputhandler.KeyHandler;

import java.util.Scanner;

public class InputHandlerImpl implements InputHandler {

    private Scanner scanner = new Scanner(System.in);
    private KeyHandler keyHandler = new KeyHandlerImpl();

    @Override
    public boolean isGoOn() {
        boolean isGoOn;
        String data;
        do {
            data = scanner.nextLine();
        } while (!keyHandler.dataEntryValidator(data));

        isGoOn = keyHandler.getResultByPressingKey(data.charAt(0));
        return isGoOn;
    }
}
