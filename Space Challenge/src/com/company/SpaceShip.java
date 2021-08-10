package com.company;

public interface SpaceShip {
    public  boolean lauch();
    public boolean land();
    public boolean canCarry(Item newItem);
    public void carry(Item newItem);
}

