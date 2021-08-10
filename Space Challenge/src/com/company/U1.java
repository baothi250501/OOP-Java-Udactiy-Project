package com.company;

public class U1 extends Rocket {

    public U1(){
        cost = 100;
        weight = 10;
        cargoCarried = 0;
        cargoLimit = 18;
    }
    @Override
    public boolean land() {
        double chance = 0.01 * (cargoCarried / cargoLimit);
        return chance < 1;
    }

    @Override
    public boolean lauch() {
        double chance = 0.05 * (cargoCarried / cargoLimit);
        return chance < 1;
    }
}

