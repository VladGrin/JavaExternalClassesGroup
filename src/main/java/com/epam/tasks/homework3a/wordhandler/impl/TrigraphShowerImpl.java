package com.epam.tasks.homework3a.wordhandler.impl;

import com.epam.tasks.homework3a.wordhandler.TrigraphShower;

import java.util.Map;

public class TrigraphShowerImpl implements TrigraphShower {

    @Override
    public void showTrigraph(Map<String, Integer> trigraphMap) {

        for (Map.Entry<String, Integer> entry : trigraphMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
