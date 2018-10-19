package com.epam.tasks.homework1.gameTwentyOne.model;

public enum Card {
    JACK(2, "Jack"),
    QUEEN(3, "Queen"),
    KING(4, "King"),
    SIX(6, "Six"),
    SEVEN(7, "Seven"),
    EIGHT(8, "Eight"),
    NINE(9, "Nine"),
    TEN(10, "Ten"),
    ACE(11, "Ace");

    private int value;
    private String name;

    Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
