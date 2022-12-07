package com.anna.dach;

final class Burma extends Cats {

    final String breed = "Бирма";

    public Burma(String name, int age, boolean lengthTail, boolean fluffy) {
        super(name, age, lengthTail, fluffy);
    }

    @Override
    public String getDescription() {
        return "Привет! Мне " + getAge() + " " + getAgeWithDeclination() + ". Я кошка породы " + breed;
    }
}
