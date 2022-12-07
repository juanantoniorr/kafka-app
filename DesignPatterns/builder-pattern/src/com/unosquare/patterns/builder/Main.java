package com.unosquare.patterns.builder;


public class Main {

    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Toping.ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Toping.PEPPER)
                .sauceInside().build();

    }
}
