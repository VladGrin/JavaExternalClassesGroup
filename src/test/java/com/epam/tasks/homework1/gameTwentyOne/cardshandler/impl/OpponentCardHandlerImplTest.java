package com.epam.tasks.homework1.gameTwentyOne.cardshandler.impl;

import com.epam.tasks.homework1.gameTwentyOne.cardprovider.CardProvider;
import com.epam.tasks.homework1.gameTwentyOne.cardshandler.OpponentCardHandler;
import com.epam.tasks.homework1.gameTwentyOne.model.Card;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OpponentCardHandlerImplTest {

    @Test
    public void getResultByOpponent() {

        CardProvider cardProvider = mock(CardProvider.class);
        OpponentCardHandler cardHandler = new OpponentCardHandlerImpl(cardProvider);

        when(cardProvider.getCard()).thenReturn(Card.SEVEN);
        assertEquals(21, cardHandler.getResultByOpponent());
    }
}