package com.epam.tasks.homework3a.wordhandler.impl;

import com.epam.tasks.homework3a.wordhandler.WordsProvider;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class WordsProviderImplTest {

    @Test
    public void getWordList() {
        String text = "asdf8 sdfg. dfgh, h";
        WordsProvider wordsProvider = new WordsProviderImpl(text);

        List<String> wordList = wordsProvider.getWordList();

        List<String> expectedList = new ArrayList<>();
        expectedList.add("ASDF");
        expectedList.add("SDFG");
        expectedList.add("DFGH");

        assertEquals(expectedList, wordList);

    }
}