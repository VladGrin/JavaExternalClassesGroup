package com.epam.tasks.homework1.gameTwentyOne.cardprovider.impl;

import com.epam.tasks.homework1.gameTwentyOne.cardprovider.CardProvider;
import com.epam.tasks.homework1.gameTwentyOne.model.Card;

public class CardProviderImpl implements CardProvider {
    @Override
    public Card getCard() {
        int card = (int) (Math.random() * Card.values().length);
        return Card.values()[card];
    }
}
