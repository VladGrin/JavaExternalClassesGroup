package com.epam.tasks.homework1.gameTwentyOne.cardprovider.impl;

import com.epam.tasks.homework1.gameTwentyOne.cardprovider.CardProvider;
import com.epam.tasks.homework1.gameTwentyOne.model.Card;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardProviderImplTest {

    @Test
    public void getCard() {
        CardProvider cardProvider = new CardProviderImpl();

        for (int i = 0; i < 1000; i++) {

            boolean result = cardProvider.getCard() instanceof Card;

            assertTrue(result);
        }

    }
}