package com.anna.dach;

public final class Burma extends Cats {

    public Burma(String name, int age, boolean lengthTail, boolean fluffy) {
        super(name, age, lengthTail, fluffy);
    }

    @Override
    public String getDescription() {
        String breed = "Бирма";
        return "Привет! Мне " + age + " " + getAgeWithDeclination() + ". Я кошка породы " + breed;
    }
}
