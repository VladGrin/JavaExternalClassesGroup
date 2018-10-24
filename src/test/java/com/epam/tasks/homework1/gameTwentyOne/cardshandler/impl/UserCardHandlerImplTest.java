package com.epam.tasks.homework1.gameTwentyOne.cardshandler.impl;

import com.epam.tasks.homework1.gameTwentyOne.cardprovider.CardProvider;
import com.epam.tasks.homework1.gameTwentyOne.cardshandler.UserCardHandler;
import com.epam.tasks.homework1.gameTwentyOne.inputhandler.InputHandler;
import com.epam.tasks.homework1.gameTwentyOne.model.Card;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserCardHandlerImplTest {

    @Test
    public void getResultByUser() {

        CardProvider cardProvider = mock(CardProvider.class);
        InputHandler inputHandler = mock(InputHandler.class);

        UserCardHandler cardHandler = new UserCardHandlerImpl(inputHandler, cardProvider);

        when(cardProvider.getCard()).thenReturn(Card.ACE);
        when(inputHandler.isGoOn()).thenReturn(false);

        assertEquals(11, cardHandler.getResultByUser());
    }

    @Test
    public void calculator() {

        CardProvider cardProvider = mock(CardProvider.class);
        InputHandler inputHandler = mock(InputHandler.class);

        UserCardHandler cardHandler = new UserCardHandlerImpl(inputHandler, cardProvider);

        int result = ((UserCardHandlerImpl) cardHandler).calculator(11, Card.EIGHT);
        Assert.assertEquals(19, result);
    }
}