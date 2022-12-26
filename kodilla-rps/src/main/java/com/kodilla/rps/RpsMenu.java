package com.kodilla.rps;

import java.util.Scanner;

public class RpsMenu {


    public void startGame(String name, int rounds){
        System.out.println("Hello: " + name + "\n");
        System.out.println("Welcome to rock, paper, scisors game");
        System.out.println("You win by scoring " + rounds + " points, Good Luck" + "\n");
    }
    public void difficultyLevel(){
        System.out.println("choice difficulty level");
        System.out.println("1. normal");
        System.out.println("2. hard");

    }
    public void gameMode(){
        System.out.println("choice mode you would like to play: ");
        System.out.println("1. normal");
        System.out.println("2. +lizard and spook");
    }
    public void rpsGameMenu(String name,String gameMode){
        System.out.println(name + " its your time to move: ");;
        System.out.println("press 1 to play rock");
        System.out.println("press 2 to play paper");
        System.out.println("press 3 to play scisors");
        if(gameMode.equals("2")){
            System.out.println("press 4 to play lizard");
            System.out.println("press 5 to  play spook");
        }
    }
    public void endGameMenu(){
        System.out.println("Would you like to play another one ?");
        System.out.println("Y/N");
        System.out.println("Y. restart the game");
        System.out.println("N. quit the game");
    }
    public void scoreBoard(int player, int computer){
        System.out.println("Your points: " + player);
        System.out.println("My points: " + computer + "\n");
    }


}
