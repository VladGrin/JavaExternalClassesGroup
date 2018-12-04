package com.epam.tasks.homework3a;

import com.epam.tasks.homework3a.repository.TextRepository;
import com.epam.tasks.homework3a.repository.impl.TextRepositoryImpl;
import com.epam.tasks.homework3a.wordhandler.TrigraphHandler;
import com.epam.tasks.homework3a.wordhandler.TrigraphShower;
import com.epam.tasks.homework3a.wordhandler.WordsProvider;
import com.epam.tasks.homework3a.wordhandler.impl.TrigraphHandlerImpl;
import com.epam.tasks.homework3a.wordhandler.impl.TrigraphShowerImpl;
import com.epam.tasks.homework3a.wordhandler.impl.WordsProviderImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Administer {
    public static void main(String[] args) {

        TextRepository textRepository = new TextRepositoryImpl();
        WordsProvider wordsProvider = new WordsProviderImpl(textRepository.getText());

        List<String> wordList = wordsProvider.getWordList();
        TrigraphHandler trigraphHandler = new TrigraphHandlerImpl();

        List<String> trigraph = new ArrayList<>();
        for(String word : wordList){
            List<String> trigraphFromWord = trigraphHandler.getTrigraphFromWord(word);
            trigraph.addAll(trigraphFromWord);
        }

        TrigraphShower trigraphShower = new TrigraphShowerImpl();
        Map<String, Integer> trigraphMap = trigraphHandler.getTrigraphMap(trigraph);
        trigraphShower.showTrigraph(trigraphMap);

    }
}
