package com.epam.tasks.homework1.gameTwentyOne.cardshandler.impl;

import com.epam.tasks.homework1.gameTwentyOne.cardprovider.CardProvider;
import com.epam.tasks.homework1.gameTwentyOne.cardprovider.impl.CardProviderImpl;
import com.epam.tasks.homework1.gameTwentyOne.cardshandler.UserCardHandler;
import com.epam.tasks.homework1.gameTwentyOne.keyhandler.KeyHandler;
import com.epam.tasks.homework1.gameTwentyOne.keyhandler.impl.KeyHandlerImpl;
import com.epam.tasks.homework1.gameTwentyOne.model.Card;

import java.util.Scanner;

public class UserCardHandlerImpl implements UserCardHandler {

    private Scanner scanner = new Scanner(System.in);
    private CardProvider cardProvider = new CardProviderImpl();
    private KeyHandler keyHandler = new KeyHandlerImpl();

    @Override
    public int getResultByUser() {

        int userCount = 0;
        boolean isGoOn = true;

        while (isGoOn) {
            Card card = cardProvider.getCard();
            System.out.println("Your card : '" + card.getName() + "'");
            userCount += card.getValue();
            if (userCount > 21) {
                break;
            }

            String data;
            do {
                data = scanner.nextLine();
            } while (!keyHandler.dataEntryValidator(data));
            isGoOn = keyHandler.getResultByPressingKey(data.charAt(0));
        }

        return userCount;
    }
}
