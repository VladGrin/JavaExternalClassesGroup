package com.epam.tasks.homework3a.wordhandler.impl;

import com.epam.tasks.homework3.textprovider.TextProvider;
import com.epam.tasks.homework3.textprovider.impl.TextProviderImpl;
import com.epam.tasks.homework3a.wordhandler.WordsProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordsProviderImpl implements WordsProvider {

    private String text;

    public WordsProviderImpl(String text) {
        this.text = text;
    }

    @Override
    public List<String> getWordList() {

        Matcher matcher = Pattern.compile("[a-zA-Z]+").matcher(text);
        List<String> list = new ArrayList<>();

        while (matcher.find()){
            list.add(matcher.group().toUpperCase());
        }
        return list.stream().filter(x -> x.length() >= 3).collect(Collectors.toList());
    }
}
