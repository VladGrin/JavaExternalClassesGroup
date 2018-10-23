package com.epam.tasks.homework1.gameTwentyOne.resulthandler.impl;

import com.epam.tasks.homework1.gameTwentyOne.resulthandler.ResultHandler;

public class ResultHandlerImpl implements ResultHandler {

    @Override
    public int getResult(int resultByUser, int resultByOpponent) {
        if (resultByUser > 21 || resultByUser < resultByOpponent){
            return 1;
        } else if (resultByUser == resultByOpponent){
            return 2;
        } else {
            return 3;
        }
    }
}
