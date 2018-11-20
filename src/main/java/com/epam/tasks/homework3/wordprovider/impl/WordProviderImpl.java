package com.epam.tasks.homework3.wordprovider.impl;

import com.epam.tasks.homework3.textprovider.TextProvider;
import com.epam.tasks.homework3.textprovider.impl.TextProviderImpl;
import com.epam.tasks.homework3.wordprovider.WordProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordProviderImpl implements WordProvider {

    private TextProvider textProvider = new TextProviderImpl();

    @Override
    public List<String> getWordList() {
        Matcher matcher = Pattern.compile("[a-zA-Z]+").matcher(textProvider.getText());
        List<String> list = new ArrayList<>();

        while (matcher.find()){
            list.add(matcher.group().toUpperCase());
        }
        return list.stream().filter(x -> x.length() >= 3).collect(Collectors.toList());
    }
}
