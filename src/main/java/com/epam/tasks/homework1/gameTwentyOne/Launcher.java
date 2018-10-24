package com.epam.tasks.homework1.gameTwentyOne;

import com.epam.tasks.homework1.gameTwentyOne.cardprovider.CardProvider;
import com.epam.tasks.homework1.gameTwentyOne.cardprovider.impl.CardProviderImpl;
import com.epam.tasks.homework1.gameTwentyOne.cardshandler.impl.UserCardHandlerImpl;
import com.epam.tasks.homework1.gameTwentyOne.cardshandler.impl.OpponentCardHandlerImpl;
import com.epam.tasks.homework1.gameTwentyOne.inputhandler.InputHandler;
import com.epam.tasks.homework1.gameTwentyOne.inputhandler.impl.InputHandlerImpl;
import com.epam.tasks.homework1.gameTwentyOne.resulthandler.impl.ResultHandlerImpl;

public class Launcher {

    private static CardProvider cardProvider = new CardProviderImpl();
    private static InputHandler inputHandler = new InputHandlerImpl();

    public static void main(String[] args) {

        System.out.println("Control keys : ");
        System.out.println("If you want to take another card press 'g', otherwise 's'");

        int resultByUser = new UserCardHandlerImpl(inputHandler, cardProvider).getResultByUser();
        int resultByOpponent = new OpponentCardHandlerImpl(cardProvider).getResultByOpponent();

        int result = new ResultHandlerImpl().getResult(resultByUser, resultByOpponent);
        switch (result){
            case 1 : System.out.println("You LOOOSE!!!"); break;
            case 2 : System.out.println("DRAW"); break;
            case 3 :  System.out.println("You WIN !!!"); break;
        }
    }
}

