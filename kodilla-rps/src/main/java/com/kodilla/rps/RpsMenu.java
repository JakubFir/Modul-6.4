package com.kodilla.rps;

public class RpsMenu {
    InputValidator inputValidator = new InputValidator();
    Player player = new Player();
    Computer computer = new Computer();
    public void StartGame(String name, int rounds){
        System.out.println("Hello: " + name + "\n");
        System.out.println("Welcome to rock, paper, scisors game");
        System.out.println("You win by scoring " + rounds + " points, Good Luck" + "\n");
        System.out.println(name + " its your time to move: ");;
    }
    public void menu(){
        System.out.println("press 1 to play rock");
        System.out.println("press 2 to play paper");
        System.out.println("press 3 to play scisors");
        System.out.println("press x to end the game");
        System.out.println("press n to restart the game");
    }
    public void scoreBoard(){
        System.out.println("Your points: " + player.getPlayerPoints());
        System.out.println("My points: " + computer.getComputerPoints());
    }
}
