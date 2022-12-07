package com.anna.dach;

import java.util.Arrays;

public abstract class Cats {

    private final String name;
    protected final int age;
    protected final boolean lengthTail;
    protected final boolean fluffy;

    public Cats(String name, int age, boolean lengthTail, boolean fluffy) {
        this.name = name;
        this.age = age;
        this.lengthTail = lengthTail;
        this.fluffy = fluffy;
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return this.name;
    }

    //Склонение окончания по возрасту (год/года/лет)
    public String getAgeWithDeclination() {
        String years;
        double count = this.age % 100;
        if (count >= 5 && count <= 20) {
            years = "лет";
        } else {
            count = count % 10;
            if (count == 1) {
                years = "год";
            } else if (count >= 2 && count <= 4) {
                years = "года";
            } else {
                years = "лет";
            }
        }
        return years;
    }

    public abstract String getDescription();

    public static void welcomeMessage(Cats[] cats) {
        System.out.println("Пришло время выбрать кошку:");
        System.out.println(Arrays.toString(cats));
    }
}
