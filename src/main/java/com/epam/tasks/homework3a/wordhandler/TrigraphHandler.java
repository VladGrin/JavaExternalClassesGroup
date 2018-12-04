package com.epam.tasks.homework3a.wordhandler;

import java.util.List;
import java.util.Map;

public interface TrigraphHandler {

    List<String> getTrigraphFromWord(String word);

    Map<String, Integer> getTrigraphMap(List<String> trigraph);

}
