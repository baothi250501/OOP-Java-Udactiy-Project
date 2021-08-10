package com.company;

public class U2 extends Rocket {
    public U2(){
        cost = 120;
        weight = 18;
        cargoCarried = 0;
        cargoLimit = 29;
    }
    @Override
    public boolean land() {
        double chance = 0.08 * (cargoCarried / cargoLimit);
        return chance >= 1;
    }

    @Override
    public boolean lauch() {
        double chance = 0.04 * (cargoCarried / cargoLimit);
        return chance >= 1;
    }
}
