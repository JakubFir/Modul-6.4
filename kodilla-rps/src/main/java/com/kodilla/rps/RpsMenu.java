package com.kodilla.rps;

import java.util.Scanner;

public class RpsMenu {
    String dificulty;
    String endGameChoice;
    Scanner scanner = new Scanner(System.in);
    public void startGame(String name, int rounds){
        System.out.println("Hello: " + name + "\n");
        System.out.println("Welcome to rock, paper, scisors game");
        System.out.println("You win by scoring " + rounds + " points, Good Luck" + "\n");
    }
    public String difficultyLevel(){
        System.out.println("choice difficulty level");
        System.out.println("1. normal");
        System.out.println("2. hard");
        dificulty = scanner.nextLine();
        return dificulty;
    }

    public String getDifficult() {
        return dificulty;
    }

    public String getEndGameChoice() {
        return endGameChoice;
    }

    public void rpsGameMenu(String name){
        System.out.println(name + " its your time to move: ");;
        System.out.println("press 1 to play rock");
        System.out.println("press 2 to play paper");
        System.out.println("press 3 to play scisors");
    }
    public String endGameMenu(){
        System.out.println("Would you like to play another one ?");
        System.out.println("Y/N");
        System.out.println("Y. restart the game");
        System.out.println("N. quit the game");
        endGameChoice = scanner.nextLine().trim().toLowerCase();
        return endGameChoice.trim().toLowerCase();
    }
    public void scoreBoard(int player, int computer){
        System.out.println("Your points: " + player);
        System.out.println("My points: " + computer + "\n");
    }
}
