package com.anna.dach;

final class Bobtail extends Cats {

    final String breed = "Бобтэйл";

    public Bobtail(String name, int age, boolean lengthTail, boolean fluffy) {
        super(name, age, lengthTail, fluffy);
    }

    @Override
    public String getDescription() {
        return "Привет! Мне " + getAge() + " " + getAgeWithDeclination() + ". Я кошка породы " + breed;
    }
}
