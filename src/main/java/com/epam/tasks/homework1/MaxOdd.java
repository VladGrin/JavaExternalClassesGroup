// В одномерном массиве целых чисел найти наибольшее нечетное число.
package com.epam.tasks.homework1;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MaxOdd {
    public static void main(String[] args) {
        long[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        MaxOddFinder maxOddFinder = new SecondMaxOddFinder();
        long number = 0;
        try {
            number = maxOddFinder.isNumberMaxAndOdd(array);
            System.out.println(number);
        } catch (Exception e) {
            System.out.println("Number not found.");
        }
    }
}

interface MaxOddFinder {
    long isNumberMaxAndOdd(long... arr);
}

class FirstMaxOddFinder implements MaxOddFinder {

    @Override
    public long isNumberMaxAndOdd(long... arr) {
        return Arrays.stream(arr).filter(x -> x % 2 == 1).max().getAsLong();
    }
}

class SecondMaxOddFinder implements MaxOddFinder {

    @Override
    public long isNumberMaxAndOdd(long... arr) {
        long max = Long.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1 && arr[i] > max) {
                max = arr[i];
            }
        }
        if (max == Long.MIN_VALUE) {
            throw new NoSuchElementException();
        }
        return max;
    }
}