package com.epam.tasks.homework1;

import java.util.Arrays;

public class DoubleExample {
    public static void main(String[] args) {
        double[] arr = {1, 5.5, 0/0., 0/0., 0/0., 6 / 2., 0/0., 4, 8, 25849489641681.87548548};
        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            double temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
