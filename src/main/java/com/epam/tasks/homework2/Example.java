package com.epam.tasks.homework2;

public class Example {
    public static void main(String[] args) {

        String str = "";

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str += "a";
        }
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("estimatedTime : " + estimatedTime);

        StringBuilder str1 = new StringBuilder();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str1.append("a");
        }
        long estimatedTime1 = System.currentTimeMillis() - startTime1;
        System.out.println("estimatedTime1 : " + estimatedTime1);
    }
}
