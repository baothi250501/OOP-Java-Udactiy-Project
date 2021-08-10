package com.company;

//Class Item
public class Item {
    private String mName;
    private int mWeight;

    public Item(String name, int weight){
        mName = name;
        mWeight = weight;
    }
    public int getWeight() {
        return mWeight;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public void setWeight(int weight) {
        this.mWeight = weight;
    }
}

