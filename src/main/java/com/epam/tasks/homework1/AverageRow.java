/* Из двумерного массива целых чисел сформировать новый массив, исключив из исходного отрицательные числа.
В полученном массиве найти номер строки, среднее арифметическое значений в которой максимально.
Если таких строк несколько, вывести номер первой такой строки.
 */
package com.epam.tasks.homework1;

import java.util.Arrays;

public class AverageRow {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {-4, 5, -9},
                {-8, 6, 0},
                {1, 2, 12}};
        AverageRowFinder averageRowFinder = new FirstAverageRowFinder();
        int rowNumber = averageRowFinder.getRowNumber(array);
        if (rowNumber == -1) {
            System.out.println("No rows found.");
        } else {
            System.out.println(rowNumber + 1);
        }
    }
}

interface AverageRowFinder {
    int getRowNumber(int[][] array);
}

class FirstAverageRowFinder implements AverageRowFinder {

    @Override
    public int getRowNumber(int[][] array) {
        int[][] newArray = getArrayPositivElements(array);
        double maxAverage = 0;
        int rowIndex = -1;
        for (int i = 0; i < newArray.length; i++) {
            double rowAverage = Arrays.stream(newArray[i]).average().orElse(-1);
            if (rowAverage > maxAverage) {
                maxAverage = rowAverage;
                rowIndex = i;
            }
        }
        return rowIndex;
    }

    private int[][] getArrayPositivElements(int[][] array) {
        int[][] newArray = new int[array.length][];
        for (int i = 0; i < array.length; i++) {
            int rowCapacity = (int) Arrays.stream(array[i])
                    .filter(x -> x >= 0)
                    .count();
            int index = 0;
            newArray[i] = new int[rowCapacity];
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= 0) {
                    newArray[i][index++] = array[i][j];
                }
            }
        }
        return newArray;
    }
}