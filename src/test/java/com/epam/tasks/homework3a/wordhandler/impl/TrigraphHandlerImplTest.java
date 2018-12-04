package com.epam.tasks.homework3a.wordhandler.impl;

import com.epam.tasks.homework3a.wordhandler.TrigraphHandler;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class TrigraphHandlerImplTest {

    @Test
    public void getTrigraphFromWord() {
        String word = "Barbara";

        TrigraphHandler trigraphHandler = new TrigraphHandlerImpl();
        List<String> trigraphFromWord = trigraphHandler.getTrigraphFromWord(word);

        List expectedList = new ArrayList();
        expectedList.add("Bar");
        expectedList.add("arb");
        expectedList.add("rba");
        expectedList.add("bar");
        expectedList.add("ara");

        assertEquals(expectedList, trigraphFromWord);
    }

    @Test
    public void getTrigraphMap() {
        List<String> list = new ArrayList<>();
        list.add("asd");
        list.add("asd");
        list.add("asd");
        list.add("zxc");

        TrigraphHandler trigraphHandler = new TrigraphHandlerImpl();
        Map<String, Integer> trigraphMap = trigraphHandler.getTrigraphMap(list);

        Map<String, Integer> expectedTrigraphMap = new TreeMap<>();
        expectedTrigraphMap.put("asd", 3);
        expectedTrigraphMap.put("zxc", 1);

        assertEquals(expectedTrigraphMap, trigraphMap);
    }
}