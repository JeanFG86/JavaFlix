package com.flix.afmin.catalog.infrastructure;

import com.flix.afmin.catalog.application.UseCase;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        System.out.println(new UseCase().execute());

    }
}