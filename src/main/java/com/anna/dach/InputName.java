package com.anna.dach;

import java.util.Scanner;

public class InputName {

    public static int inputName(Cats[] cats) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя кошки, чтобы познакомиться с ней поближе:");
        String choose = scanner.nextLine();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].getName().equals(choose)) {
                return i;
            }
        }
        System.out.println("Таких кошек у нас нет!");
        return -1;
    }

}

