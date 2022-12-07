package com.anna.dach;

public final class Abyss extends Cats {

    public Abyss(String name, int age, boolean lengthTail, boolean fluffy) {
        super(name, age, lengthTail, fluffy);
    }

    @Override
    public String getDescription() {
        String breed = "Абисс";
        return "Привет! Мне " + age + " " + getAgeWithDeclination() + ". Я кошка породы " + breed;
    }
}
