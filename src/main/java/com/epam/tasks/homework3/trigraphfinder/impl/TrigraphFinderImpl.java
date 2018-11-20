package com.epam.tasks.homework3.trigraphfinder.impl;

import com.epam.tasks.homework3.trigraphfinder.TrigraphFinder;
import com.epam.tasks.homework3.wordprovider.WordProvider;
import com.epam.tasks.homework3.wordprovider.impl.WordProviderImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TrigraphFinderImpl implements TrigraphFinder {

    private WordProvider wordProvider = new WordProviderImpl();

    @Override
    public Map<String, Integer> getTrigraph() {

        List<String> trigraph = new ArrayList<>();

        for(String word : wordProvider.getWordList() ){
            for (int i = 0; i < word.length()-2; i++) {
                trigraph.add(word.substring(i, i+3));
            }
        }

        Map<String, Integer> trigraphMap = new TreeMap<>();
        for (String str : trigraph){
            Integer quantity = trigraphMap.get(str);
            if(quantity == null){
                trigraphMap.put(str, 1);
            } else {
                trigraphMap.put(str, ++quantity);
            }
        }
        return trigraphMap;
    }
}
