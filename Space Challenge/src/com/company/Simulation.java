package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    public ArrayList<Item> loadItems(String nameFile) throws FileNotFoundException {
        ArrayList<Item> items = new ArrayList<Item>();
        File file = new File(nameFile);
        Scanner fileScanner = new Scanner(file);
        String tmp;
        while (fileScanner.hasNextLine()){
            tmp = fileScanner.nextLine();
            String words[] = tmp.split("=");
            items.add(new Item(words[0],Integer.parseInt(words[1])));
        }
        return items;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> items){
        ArrayList<Rocket> U1s = new ArrayList<>();
        U1 newU1 = new U1();
        for (Item i : items){
            if (newU1.canCarry(i)){
                newU1.carry(i);
            } else {
                U1s.add(newU1);
                newU1.setCargoCarried(0);
            }
        }
        U1s.add(newU1);
        return U1s;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items){
        ArrayList<Rocket> U2s = new ArrayList<>();
        U2 newU2 = new U2();
        for (Item i : items){
            if (newU2.canCarry(i)){
                newU2.carry(i);
            } else {
                U2s.add(newU2);
                newU2.setCargoCarried(0);
            }
        }
        U2s.add(newU2);
        return U2s;
    }

    public int runSimulation(ArrayList<Rocket> rockets){
        int costSum = 0;
        for (Rocket i: rockets){
            costSum += i.cost;
            if (!i.land() || !i.lauch()){
                System.out.println("Ten lua bi roi");
            }
        }
        return costSum;
    }

}
