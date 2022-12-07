package com.anna.dach;

public final class Bobtail extends Cats {

    public Bobtail(String name, int age, boolean lengthTail, boolean fluffy) {
        super(name, age, lengthTail, fluffy);
    }

    @Override
    public String getDescription() {
        String breed = "Бобтэйл";
        return "Привет! Мне " + age + " " + getAgeWithDeclination() + ". Я кошка породы " + breed;
    }
}
