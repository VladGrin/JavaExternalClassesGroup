/*В заданном тексте найти подстроку максимальной длины,
являющуюся палиндромом, т.е. читающуюся слева направо и справа
налево одинаково.*/
package com.epam.tasks.homework4;

import java.util.HashSet;
import java.util.Set;

public class Task3 {

    private static final String text = "adfdaa5 adfggfdaa82 aiooia6 ala3";

    public static void main(String[] args) {

        Set<String> polindroms = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {
            for (int j = text.length(); j > i + 1; j--) {
                String substring = text.substring(i, j);
                StringBuilder stringBuilder = new StringBuilder(substring);
                if (substring.equals(stringBuilder.reverse().toString())) {
                    polindroms.add(substring);
                }
            }
        }

        long maxLength = polindroms.stream().mapToLong(String::length).max().orElse(0);
        polindroms.stream()
                .filter(x -> x.length() == maxLength)
                .forEach(System.out::println);

    }
}
