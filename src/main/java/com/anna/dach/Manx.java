package com.anna.dach;

public final class Manx extends Cats {

    public Manx(String name, int age, boolean lengthTail, boolean fluffy) {
        super(name, age, lengthTail, fluffy);
    }

    @Override
    public String getDescription() {
        String breed = "Мэнкс";
        return "Привет! Мне " + age + " " + getAgeWithDeclination() + ". Я кошка породы " + breed;
    }
}
