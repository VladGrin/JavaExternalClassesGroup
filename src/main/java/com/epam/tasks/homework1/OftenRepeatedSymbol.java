/*Строка содержит символы английского алфавита (A…Z и a..z), символ “пробел” и знаки препинания.
Найти символ, который встречается чаще всего (без учета регистра). Если таких символов несколько, вывести любой из них.
*/
package com.epam.tasks.homework1;

import java.util.*;
import java.util.stream.Collectors;

public class OftenRepeatedSymbol {

    private static SymbolFinder symbolFinder = new SecondSymbolFinder();

    public static void main(String[] args) {

        String string = "dthxfthtxdhdxthtdzhdtjhtdxhjdtzhzdrhzdrhxdrh  aaaaaaaaaaaaaaaaa";
        try {
            char oftenRepeatedSymbol = symbolFinder.getOftenRepeatedSymbol(string);
            System.out.println("symbol : '" + oftenRepeatedSymbol + "'");
        } catch (Exception e) {
            System.out.println("String is empty.");
        }
    }
}

interface SymbolFinder {
    char getOftenRepeatedSymbol(String string);
}

class FirstSymbolFinder implements SymbolFinder {

    @Override
    public char getOftenRepeatedSymbol(String string) {

        Integer count;
        char[] chars = string.toLowerCase().toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            count = map.get(c);
            if (count == null) {
                map.put(c, 1);
            } else {
                map.put(c, ++count);
            }
        }

        List<Integer> list = new ArrayList<>(map.values());
        count = list.stream()
                .max(Integer::compare)
                .orElseThrow(NullPointerException::new);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(count)) {
                return entry.getKey();
            }
        }
        return 1;
    }
}

class SecondSymbolFinder implements SymbolFinder {

    @Override
    public char getOftenRepeatedSymbol(String string) {

        char[] chars = string.toLowerCase().toCharArray();
        List<Character> list = new ArrayList<Character>();
        for (char c : chars) {
            list.add(c);
        }
        List<Character> sortedCharacters = list.stream()
                .sorted()
                .collect(Collectors.toList());

        StringBuilder stringFromChar = new StringBuilder();
        for (int i = 0; i < sortedCharacters.size() - 1; i++) {
            Character temp = sortedCharacters.get(i);
            if (temp.equals(sortedCharacters.get(i+1))){
                stringFromChar.append(temp);
            } else {
                stringFromChar.append(temp + "5");
            }
        }
        stringFromChar.append(sortedCharacters.get(sortedCharacters.size() - 1));

        String[] stringsRepeatedSymbols = stringFromChar.toString().split("5");
        Integer longerString = Arrays.stream(stringsRepeatedSymbols)
                .map(x -> x.length())
                .max(Integer::compare)
                .get();
        return Arrays.stream(stringsRepeatedSymbols)
                .filter(x -> x.length() == longerString)
                .findAny()
                .get()
                .charAt(0);
    }
}
