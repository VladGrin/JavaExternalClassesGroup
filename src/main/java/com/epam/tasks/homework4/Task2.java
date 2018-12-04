/*2. Отсортировать слова в тексте по убыванию количества вхождений
заданного символа, а в случае равенства – по алфавиту.*/
package com.epam.tasks.homework4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String text = "Lorem Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
            "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
            "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
            "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non " +
            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        System.out.println("Input symbol: ");
        String symbol;
        do {
            symbol = scanner.nextLine();
        } while (symbol.length() != 1);

        Matcher matcher = Pattern.compile("[a-zA-Z]+").matcher(text);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group().toLowerCase());
        }

        char letter = symbol.charAt(0);
        Map<String, Long> map = new TreeMap<>();
        list.forEach(x -> map.put(x, getNumberRepetitions(x, letter)));

        map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(x-> System.out.println(x.getKey()));
    }

    private static Long getNumberRepetitions(String word, char letter){
        return word.chars().filter(x->x == letter).count();
    }
}
