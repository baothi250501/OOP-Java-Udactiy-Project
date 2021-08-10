package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	    // write your code here
        Simulation space = new Simulation();
        ArrayList<Item> phrase1 = space.loadItems("Phase-1.txt");
        ArrayList<Item> phrase2 = space.loadItems("Phase-2.txt");
        ArrayList<Rocket> U1sPhrase1 = space.loadU1(phrase1);
        ArrayList<Rocket> U1sPhrase2 = space.loadU1(phrase2);
        System.out.println("U1 Simulation: ");
        System.out.println("Phrase 1:");
        System.out.println(space.runSimulation(U1sPhrase1));
        System.out.println("Phrase 2:");
        System.out.println(space.runSimulation(U1sPhrase2));
        ArrayList<Rocket> U2sPhrase1 = space.loadU2(phrase1);
        ArrayList<Rocket> U2sPhrase2 = space.loadU2(phrase2);
        System.out.println("U2 Simulation: ");
        System.out.println("Phrase 1:");
        System.out.println(space.runSimulation(U2sPhrase1));
        System.out.println("Phrase 2:");
        System.out.println(space.runSimulation(U2sPhrase2));
    }
}
