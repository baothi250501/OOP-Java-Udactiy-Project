package com.company;

public class Rocket implements SpaceShip {
    protected int cost;
    protected int weight;
    protected int cargoCarried;
    protected int cargoLimit;

    public void setCargoCarried(int cargoCarried) {
        this.cargoCarried = cargoCarried;
    }

    public int getWeight() {
        return weight;
    }

    public int getCargoCarried() {
        return cargoCarried;
    }

    public int getCargoLimit() {
        return cargoLimit;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean lauch() {
        return true;
    }

    @Override
    public boolean land() {
        return  true;
    }

    @Override
    public boolean canCarry(Item newItem) {
        return cargoCarried + newItem.getWeight() <= cargoLimit;
    }

    @Override
    public void carry(Item newItem) {
        cargoCarried += newItem.getWeight();
    }
}

