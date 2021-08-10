package com.company;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
	    // write your code here
        File file = new File("movies.txt");
        Scanner fileScanner = new Scanner(file);
        List<String> listMovies = new ArrayList<String>();
        while (fileScanner.hasNextLine()){
            listMovies.add(fileScanner.nextLine());
        }
        int randomNumber = (int) (Math.random()*(listMovies.size() - 1)) + 1;
        String res = listMovies.get(randomNumber);
        Game newGame = new Game(res);
        newGame.playGame();
    }
}
