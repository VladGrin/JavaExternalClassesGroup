// Среди всех чисел типа int найти такие, двоичное представление которых является палиндромом (без учета ведущих нулей).

package com.epam.tasks.homework1;

import java.util.Arrays;

public class Palindrom {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        PalindromeFinder palindromeFinder = new secondPalindromeFinder();
        Arrays.stream(arr).forEach(x->System.out.println(x + " : " + palindromeFinder.isPalindrom(x)));
    }
}

interface PalindromeFinder {
    boolean isPalindrom(int number);
}

class firstPalindromeFinder implements PalindromeFinder {

    @Override
    public boolean isPalindrom(int number) {
        String bitNumber = "";
        while (number > 0) {
            bitNumber += number % 2;
            number /= 2;
        }
        return new StringBuilder(bitNumber).reverse().toString().equals(bitNumber);
    }
}
class secondPalindromeFinder implements PalindromeFinder {

    @Override
    public boolean isPalindrom(int number) {
        String bitNumber = "";
        int maska = 1;
        while (maska <= number) {
            int rez = number&maska;
            bitNumber += (rez == 0) ? "0" : "1" ;
            maska <<= 1;
        }
        int stringLength = bitNumber.length();
        for (int i = 0; i < stringLength/2; i++) {
            if (bitNumber.charAt(i) != bitNumber.charAt(stringLength - i - 1)){
                return false;
            }
        }
        return true;
    }
}