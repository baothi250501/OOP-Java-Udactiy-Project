package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = (int) (Math.random()*100) +1;
        boolean check = false;
        System.out.println("I have randomly chosen a number between 1 and 100");
        System.out.println("Try to guess it");
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; --i){
            System.out.println("You have " + i + " guess(es) left. Try it!");
            int guess = scanner.nextInt();
            if (guess > result) {
                System.out.println("Result is smaller than guess");
            }
            else if (guess < result){
                System.out.println("Result is bigger than guess");
            }
            else if (guess == result){
                check = true;
                break;
            }
        }
        if (check == true){
            System.out.println("Congratulation!");
            return;
        }
        else{
            System.out.println("You lost. Try your best");
            return;
        }
    }
}
