/*Угадывание букв.
Написать программу игры в угадывание букв.
Пользователь должен угадать загаданную программой латинскую букву вводя свой вариант буквы с клавиатуры. 
Если пользователь угадал букву, программа выводит сообщение о выигрыше и количестве попыток пользователя. 
Если буква не угадана, программа предлагает ввести другую букву. При этом программа выводит подсказки. 
Если пользователь ввел букву меньше загаданной – вывести сообщение об этом (например, «Too low!»). 
Аналогично при вводе буквы больше загаданной (например, «Too high!»). 
Если введена не латинская буква – предложить пользователю внимательно ознакомиться с правилами игры.
Программа должна быть не чувствительна к регистру введенной пользователем буквы. 
Например, при загаданной букве ‘G’ ответы пользователя ‘G’ или ‘g’ в равной степени считаются правильными. 
Игра продолжается до выигрыша пользователя. */

package com.epam.tasks.homework1.gameGuessingLetters;

import com.epam.tasks.homework1.gameGuessingLetters.lettercomparator.LetterComparator;
import com.epam.tasks.homework1.gameGuessingLetters.lettercomparator.impl.LetterComparatorImpl;
import com.epam.tasks.homework1.gameGuessingLetters.letterprovider.LetterProvider;
import com.epam.tasks.homework1.gameGuessingLetters.letterprovider.impl.LetterProviderImpl;
import com.epam.tasks.homework1.gameGuessingLetters.validator.Validator;
import com.epam.tasks.homework1.gameGuessingLetters.validator.impl.ValidatorImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager{
    private static Scanner scanner = new Scanner(System.in);
    private static LetterComparator letterComparator = new LetterComparatorImpl();
    private static LetterProvider letterProvider = new LetterProviderImpl();
    private static Validator validator = new ValidatorImpl();

    public static void main(String[] args) {
        char randomLetter = letterProvider.getLetter();
        boolean isGuess = false;
        int attemptCounter = 0;

        while (!isGuess) {
            try {
                System.out.println("Input letter :");
                String userLetter = scanner.nextLine().toLowerCase();
                validator.validate(userLetter);
                isGuess = letterComparator.isRightLetter(randomLetter, userLetter.charAt(0));
                attemptCounter++;
            } catch (InputMismatchException e) {
                System.out.println("You can enter only one latin letters. Try again.");
            }
        }
        System.out.printf("Congratulation !!! You WIN !!! You have made %d attempts.", attemptCounter);
    }
}

