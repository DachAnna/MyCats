package com.anna.dach;

public class MeetCats {

    public static void main(String[] args) {
        Cats barsik = new Burma("Барсик", 1, true,true);
        Cats murka = new Bobtail("Мурка", 1,false,true);
        Cats sherlock = new Manx("Шэрлок", 2, false, false);
        Cats happy = new Abyss("Хэппи", 3, true, false);

        Cats[] cats= {barsik, murka, sherlock, happy};

        Cats.welcomeMessage(cats);

        int cat = InputName.inputName(cats);

        if(cat >= 0) {
            System.out.println(cats[cat].getDescription());
        }
    }
}