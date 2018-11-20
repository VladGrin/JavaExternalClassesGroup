package com.epam.tasks.homework3.showtrigraph;

import com.epam.tasks.homework3.trigraphfinder.TrigraphFinder;
import com.epam.tasks.homework3.trigraphfinder.impl.TrigraphFinderImpl;

import java.util.Map;

public class ShowTrigraph {

    private TrigraphFinder trigraphFinder = new TrigraphFinderImpl();

    public void showTrigraph() {

        for (Map.Entry<String, Integer> entry : trigraphFinder.getTrigraph().entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
