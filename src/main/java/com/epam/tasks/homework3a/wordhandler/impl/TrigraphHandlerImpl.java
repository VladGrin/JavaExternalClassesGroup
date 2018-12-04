package com.epam.tasks.homework3a.wordhandler.impl;

import com.epam.tasks.homework3a.wordhandler.TrigraphHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TrigraphHandlerImpl implements TrigraphHandler {

    @Override
    public List<String> getTrigraphFromWord(String word) {
        List<String> trigraph = new ArrayList<>();

        for (int i = 0; i < word.length()-2; i++) {
            trigraph.add(word.substring(i, i+3));
        }

        return trigraph;
    }

    @Override
    public Map<String, Integer> getTrigraphMap(List<String> trigraph) {
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
