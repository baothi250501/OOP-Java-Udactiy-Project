package com.company;

public class Contact {
    //Fields
    String name;
    String email;
    String phoneNumber;

    //Constructor
    Contact(){
        name = null;
        email = null;
        phoneNumber = null;
    }

    //Method

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
