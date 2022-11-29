package com.simbirsoft;

public class Cats {

    String name;
    int age;
    boolean lengthTail;
    boolean fluffy;
    String[] breed = {"Бирма", "Бобтейл", "Мэнкс", "Абисс"};

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

    public String getBreed() {
        if (this.lengthTail && this.fluffy) {
            return breed[0];
        } else if (this.lengthTail && !this.fluffy) {
            return breed[3];
        } else if (!this.lengthTail && this.fluffy) {
            return breed[1];
        } else {
            return breed[2];
        }
    }

    public String getDescription() {
        return "Привет! Мне " + this.age + " " + getAgeWithDeclination() + ". Я кошка породы " + getBreed();
    }
}
