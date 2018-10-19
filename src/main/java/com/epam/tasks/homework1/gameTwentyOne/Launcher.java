package com.epam.tasks.homework1.gameTwentyOne;

import com.epam.tasks.homework1.gameTwentyOne.cardprovider.CardProvider;
import com.epam.tasks.homework1.gameTwentyOne.cardprovider.impl.CardProviderImpl;
import com.epam.tasks.homework1.gameTwentyOne.keyhandler.KeyHandler;
import com.epam.tasks.homework1.gameTwentyOne.keyhandler.impl.KeyHandlerImpl;
import com.epam.tasks.homework1.gameTwentyOne.model.Card;
import com.epam.tasks.homework1.gameTwentyOne.opponentcardsgenerator.OpponentCardGenerator;
import com.epam.tasks.homework1.gameTwentyOne.opponentcardsgenerator.impl.OpponentCardGeneratorImpl;

import java.util.Scanner;

public class Launcher {

    private static Scanner scanner = new Scanner(System.in);
    private static CardProvider cardProvider = new CardProviderImpl();
    private static KeyHandler keyHandler = new KeyHandlerImpl();
    private static OpponentCardGenerator cardGeneration = new OpponentCardGeneratorImpl();

    public static void main(String[] args) {
        int userCount = 0;
        boolean isGoOn = true;

        while (isGoOn) {
            Card card = cardProvider.getCard();
            System.out.println("Your card : '" + card.getName() + "'");
            userCount += card.getValue();
            if (userCount > 21) {
                break;
            }
            System.out.println("If you want to take another card press 'g', otherwise 's'");
            String data;
            do {
                data = scanner.nextLine();
            } while (!keyHandler.dataEntryValidator(data));
            isGoOn = keyHandler.getResultByPressingKey(data.charAt(0));
        }

        int resultByOpponent = cardGeneration.getResultByOpponent();

        if (userCount > 21 || userCount < resultByOpponent){
            System.out.println("You LOOOSE!!!");
        } else if (userCount == resultByOpponent){
            System.out.println("DRAW");
        } else {
            System.out.println("You WIN !!!");
        }
    }
}

