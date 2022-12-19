package com.kodilla.rps;

import java.util.Scanner;

public class RpsMenu {
    Scanner scanner = new Scanner(System.in);
    public void startGame(String name, int rounds){
        System.out.println("Hello: " + name + "\n");
        System.out.println("Welcome to rock, paper, scisors game");
        System.out.println("You win by scoring " + rounds + " points, Good Luck" + "\n");
    }
    public String diffLevel(){
        String answer;
        System.out.println("choice difficulty level");
        System.out.println("1. normal");
        System.out.println("2. hard");
        answer = scanner.nextLine();
        return answer;
    }
    public void menu(String name){
        System.out.println(name + " its your time to move: ");;
        System.out.println("press 1 to play rock");
        System.out.println("press 2 to play paper");
        System.out.println("press 3 to play scisors");
        System.out.println("press x to end the game");
        System.out.println("press n to restart the game");
    }
    public void scoreBoard(int player, int computer){
        System.out.println("Your points: " + player);
        System.out.println("My points: " + computer + "\n");
    }
}
