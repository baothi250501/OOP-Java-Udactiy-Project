package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ContactsManager myContactManager = new ContactsManager();
        Contact newFriend1 = new Contact();
        newFriend1.setName("Thi");
        newFriend1.setPhoneNumber("0867953055");
        myContactManager.addContact(newFriend1);
        Contact newFriend2 = new Contact();
        newFriend2.setName("Chau");
        newFriend2.setPhoneNumber("0396633347");
        myContactManager.addContact(newFriend2);
        Contact newFriend3 = new Contact();
        newFriend3.setName("Loan");
        newFriend3.setPhoneNumber("0347811398");
        myContactManager.addContact(newFriend3);
        Contact newFriend4 = new Contact();
        newFriend4.setName("Hien");
        newFriend4.setPhoneNumber("0333008645");
        myContactManager.addContact(newFriend4);
        Contact newFriend5 = new Contact();
        newFriend5.setName("Quynh");
        newFriend5.setPhoneNumber("0337648171");
        myContactManager.addContact(newFriend5);
        Contact findContact = myContactManager.searchContact("Thi");
        System.out.print(findContact.phoneNumber);
    }
}
