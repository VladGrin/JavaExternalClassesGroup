package com.epam.tasks.homework1.gameTwentyOne.cardshandler.impl;

import com.epam.tasks.homework1.gameTwentyOne.cardprovider.CardProvider;
import com.epam.tasks.homework1.gameTwentyOne.cardshandler.UserCardHandler;
import com.epam.tasks.homework1.gameTwentyOne.inputhandler.InputHandler;
import com.epam.tasks.homework1.gameTwentyOne.model.Card;

public class UserCardHandlerImpl implements UserCardHandler {

    private InputHandler inputHandler;
    private CardProvider cardProvider;

    public UserCardHandlerImpl(InputHandler inputHandler, CardProvider cardProvider) {
        this.inputHandler = inputHandler;
        this.cardProvider = cardProvider;
    }

    public int calculator(int userCount, Card newCard){
         return userCount + newCard.getValue();
    }

    @Override
    public int getResultByUser() {

        int userCount = 0;
        boolean isGoOn = true;

        while (isGoOn) {
            Card card = cardProvider.getCard();
            System.out.println("Your card : '" + card.getName() + "'");
            userCount = calculator(userCount, card);
            if (userCount > 21) {
                break;
            }
            isGoOn = inputHandler.isGoOn();
        }
        return userCount;
    }
}
