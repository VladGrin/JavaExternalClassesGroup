/*В заданном тексте слова заданной длины заменить указанной
подстрокой, длина которой может не совпадать с длиной слова.
* */
package com.epam.tasks.homework4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task4 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
            "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
            "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
            "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non " +
            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        int len;
        String subString;

        System.out.println("Set the length of the words to be replaced:");
        len = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input a substring");
        subString = scanner.nextLine();

        Matcher matcher = Pattern.compile("[a-zA-Z]+").matcher(text);
        Set<String> set = new HashSet<>();
        while (matcher.find()) {
            set.add(matcher.group());
        }
        set = set.stream().filter(x->x.length()==len).collect(Collectors.toSet());

        String newText = text;
        for(String word: set){
            newText = newText.replaceAll(word, subString);
        }

        System.out.println(newText);
    }
}
