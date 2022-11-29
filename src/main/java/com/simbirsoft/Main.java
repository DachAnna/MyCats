package com.simbirsoft;

import java.util.Arrays;

import static com.simbirsoft.InputName.inputName;


public class Main {
    public static void main(String[] args) {

        Cats cat1 = new Cats("Барсик", 1, true,true);
        Cats cat2 = new Cats("Мурка", 1,false,true);
        Cats cat3 = new Cats("Шэрлок", 2, false, false);
        Cats cat4 = new Cats("Хэппи", 3, true, false);

        Cats[] cats= {cat1, cat2, cat3, cat4};

        System.out.println("Пришло время выбрать кошку:");
        System.out.println(Arrays.deepToString(cats));
        int cat = inputName(cats);
        if(cat >= 0) {
            System.out.println(cats[cat].getDescription());
        }
    }
}