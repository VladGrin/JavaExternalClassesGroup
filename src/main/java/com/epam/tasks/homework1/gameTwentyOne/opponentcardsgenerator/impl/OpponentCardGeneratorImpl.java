package com.epam.tasks.homework1.gameTwentyOne.opponentcardsgenerator.impl;

import com.epam.tasks.homework1.gameTwentyOne.cardprovider.CardProvider;
import com.epam.tasks.homework1.gameTwentyOne.cardprovider.impl.CardProviderImpl;
import com.epam.tasks.homework1.gameTwentyOne.opponentcardsgenerator.OpponentCardGenerator;

public class OpponentCardGeneratorImpl implements OpponentCardGenerator {
    private CardProvider cardProvider = new CardProviderImpl();

    @Override
    public int getResultByOpponent() {
        int count = 0;

        while (true) {
            int value = cardProvider.getCard().getValue();
            count += value;
            if (count > 21){
                count -= value;
                break;
            }
        }
        return count;
    }
}
