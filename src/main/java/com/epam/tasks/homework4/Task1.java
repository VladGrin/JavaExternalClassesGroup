/*1. Существует текст и список слов. Для каждого слова из заданного
списка найти, сколько раз оно встречается в тексте, и рассортировать
слова по убыванию общего количества вхождений.*/

package com.epam.tasks.homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    static final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
            "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
            "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
            "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non " +
            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        Matcher matcher = Pattern.compile("[a-zA-Z]+").matcher(text);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group().toLowerCase());
        }

        Map<String, Integer> map = new TreeMap<>();
        for (String str : list) {
            Integer quantity = map.get(str);
            if (quantity == null) {
                map.put(str, 1);
            } else {
                map.put(str, ++quantity);
            }
        }

        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(x -> System.out.println(x.getKey() + " - " + x.getValue()));
    }
}
