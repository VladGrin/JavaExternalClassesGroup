//В двух одномерных массивах чисел найти такие числа, которые есть в обоих исходных массивах.
package com.epam.tasks.homework1;

import java.util.*;
import java.util.stream.Collectors;

public class SearchIdenticalElements {
    public static void main(String[] args) {
        ElementsFinder elementsFinder = new SecondElementsFinder();
        double[] firstArray = {1, 2, 3, 4, 5, 6};
        double[] secondArray = {4, 5, 6, 7, 8, 9};
        Set<Double> identicalElements = elementsFinder.findIdenticalElements(firstArray, secondArray);
        if(identicalElements.size() == 0){
            System.out.println("No matches found.");
        } else {
            System.out.println(identicalElements);
        }
    }
}

interface ElementsFinder {
    Set<Double> findIdenticalElements(double[] firstArray, double[] secondArray);
}

class FirstElementsFinder implements ElementsFinder {

    @Override
    public Set<Double> findIdenticalElements(double[] firstArray, double[] secondArray) {
        Set<Double> result = new HashSet<>();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if(firstArray[i] == secondArray[j]){
                    result.add(firstArray[i]);
                    break;
                }
            }
        }
        return result;
    }
}
class SecondElementsFinder implements ElementsFinder {

    @Override
    public Set<Double> findIdenticalElements(double[] firstArray, double[] secondArray) {
        List<Double> firstList = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        List<Double> secondList = Arrays.stream(secondArray).boxed().collect(Collectors.toList());
        firstList.retainAll(secondList);
        return firstList.stream().collect(Collectors.toSet());
    }
}