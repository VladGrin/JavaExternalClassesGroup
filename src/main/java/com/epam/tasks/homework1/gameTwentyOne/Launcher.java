package com.epam.tasks.homework1.gameTwentyOne;

import com.epam.tasks.homework1.gameTwentyOne.cardprovider.CardProvider;
import com.epam.tasks.homework1.gameTwentyOne.cardprovider.impl.CardProviderImpl;
import com.epam.tasks.homework1.gameTwentyOne.cardshandler.UserCardHandler;
import com.epam.tasks.homework1.gameTwentyOne.cardshandler.impl.UserCardHandlerImpl;
import com.epam.tasks.homework1.gameTwentyOne.keyhandler.KeyHandler;
import com.epam.tasks.homework1.gameTwentyOne.keyhandler.impl.KeyHandlerImpl;
import com.epam.tasks.homework1.gameTwentyOne.model.Card;
import com.epam.tasks.homework1.gameTwentyOne.cardshandler.OpponentCardHandler;
import com.epam.tasks.homework1.gameTwentyOne.cardshandler.impl.OpponentCardHandlerImpl;
import com.epam.tasks.homework1.gameTwentyOne.resulthandler.ResultHandler;
import com.epam.tasks.homework1.gameTwentyOne.resulthandler.impl.ResultHandlerImpl;

import java.util.Scanner;

public class Launcher {

    private static OpponentCardHandler opponentCardHandler = new OpponentCardHandlerImpl();
    private static UserCardHandler userCardHandler = new UserCardHandlerImpl();
    private static ResultHandler resultHandler = new ResultHandlerImpl();

    public static void main(String[] args) {
        System.out.println("Control keys : ");
        System.out.println("If you want to take another card press 'g', otherwise 's'");

        int resultByUser = userCardHandler.getResultByUser();
        int resultByOpponent = opponentCardHandler.getResultByOpponent();

        int result = resultHandler.getResult(resultByUser, resultByOpponent);
        switch (result){
            case 1 : System.out.println("You LOOOSE!!!"); break;
            case 2 : System.out.println("DRAW"); break;
            case 3 :  System.out.println("You WIN !!!"); break;
        }
    }
}

