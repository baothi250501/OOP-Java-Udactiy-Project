package com.company;
import java.util.Scanner;
import java.io.*;

public class Game {

    //Fields
    private String result;
    private String guess;
    private int cntWrong;

    char alp[];
    //Instructor
    Game(){
        result = null;
    }
    Game(String res){
        result = res;
        guess = res;
        cntWrong = 0;
    }
    //Methods
    public void convertLetter(){
        int  idx = 0;
        for (int i = 0; i < guess.length(); ++i){
            if (guess.charAt(i) != '_' && guess.charAt(i) != ' '){
                guess = guess.replace(guess.charAt(i),'_');
            }
        }
    }
    public boolean checkInput(char listInput[], char ch){
        if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            for (int i = 0; i < listInput.length; ++i) {
                if (ch == listInput[i])
                    System.out.println(" Da nhap ki tu nay truoc. Moi ban nhap lai");
                    return false;
            }
            return true;
        }
        System.out.println(" Nhap cac gia tri la so hoac chu cai thuong. Moi ban nhap lai");
        return false;
    }
    public void playGame(){
        convertLetter();
        System.out.println(" GUESS MOVIES GAME");
        System.out.println("Nhap cac gia tri la so hoac chu cai");
        System.out.println("Start Game!");
        System.out.println("You are guessing: " + guess);
        System.out.println("You are guessing (" + cntWrong + ") wrong answer");
        Scanner scanner = new Scanner(System.in);
        char listInput[] = new char[10 + result.length()];
        char ch;
        int cnt = 0;
        do{
            do {
                System.out.println(" Moi ban nhap ki tu duoc doan: ");
                ch = (char) (scanner.nextLine().charAt(0));
            } while (!checkInput(listInput, ch));
            listInput[cnt++] = ch;
            boolean check = showResult(ch);
            if (check){
                return;
            }
        } while (cntWrong < 10);
        System.out.println("You lost!");
    }
    public int checkGuess(char ch){
        if (result.indexOf(ch) == -1){
            System.out.println(-1);
            return -1;
        }
        else {
            StringBuilder sb = new StringBuilder(guess);
            for (int i = 0; i < result.length(); ++i){
                if (result.charAt(i) == ch){
                    sb.setCharAt(i, ch);
                }
            }
            guess = sb.toString();
            return 1;
        }

    }
    public boolean showResult(char ch){
        if (checkGuess(ch) == -1){
            cntWrong += 1;
        };
        if (guess.compareTo(result) != 0){
            System.out.println("You are guessing: " + guess);
            System.out.println("You are guessing (" + cntWrong + ") wrong answer");
            return false;
        }
        else {
            System.out.println("You win");
            System.out.println("You are guessed " + guess + " correctly");
            return true;
        }
    }
}
