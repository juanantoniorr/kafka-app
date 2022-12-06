package com.unosquare.patterns.facade;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Facade hide complexity
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.watchMovie("Harry  Potter");
        homeTheaterFacade.finishMovie();

    }
}
