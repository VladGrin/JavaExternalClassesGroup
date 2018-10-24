package com.epam.tasks.homework1.gameTwentyOne.resulthandler.impl;

import com.epam.tasks.homework1.gameTwentyOne.resulthandler.ResultHandler;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResultHandlerImplTest {

    @Test
    public void getResultMore21() {
        ResultHandler resultHandler = new ResultHandlerImpl();

        int answer = 1;
        int result = resultHandler.getResult(22, 20);

        Assert.assertEquals(answer, result);
    }

    @Test
    public void getResultOpponentWin() {
        ResultHandler resultHandler = new ResultHandlerImpl();

        int answer = 1;
        int result = resultHandler.getResult(20, 21);

        Assert.assertEquals(answer, result);
    }

    @Test
    public void getResultUserWin() {
        ResultHandler resultHandler = new ResultHandlerImpl();

        int answer = 3;
        int result = resultHandler.getResult(21, 20);

        Assert.assertEquals(answer, result);
    }

    @Test
    public void getResultDraw() {
        ResultHandler resultHandler = new ResultHandlerImpl();

        int answer = 2;
        int result = resultHandler.getResult(21, 21);

        Assert.assertEquals(answer, result);
    }
}