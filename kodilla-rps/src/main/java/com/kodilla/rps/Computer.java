package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Computer {

    Random rnd = new Random();
    Player player = new Player();
    Scanner scanner = new Scanner(System.in);

    private int computerPoints = 0;
    private List <String> listOfMoves;
    private List <String> listOfMovesOnHardMode;
    private List<String> listOfMoves(){
        listOfMoves = new ArrayList<>();
        listOfMoves.add("rock");
        listOfMoves.add("paper");
        listOfMoves.add("scisors");
        return listOfMoves;
    }
    public String computerMove(){
        String computerChoice = listOfMoves().get(rnd.nextInt(3));
        return computerChoice;
    }
    public List<String> listOfMovesOnHardMode(String answer){
        listOfMovesOnHardMode = new ArrayList<>();
        listOfMovesOnHardMode.add("rock");
        listOfMovesOnHardMode.add("paper");
        listOfMovesOnHardMode.add("scisors");
        if(answer.equals("1")){
            listOfMovesOnHardMode.add("paper");
        }
        if(answer.equals("2")){
            listOfMovesOnHardMode.add("scisors");
        }
        if(answer.equals("3")){
            listOfMovesOnHardMode.add("rock");
        }
    return listOfMovesOnHardMode;
    }

    public String computerMoveOnHardMode(String answer){
        String computerChoiceOnHardMode = listOfMovesOnHardMode(answer).get(rnd.nextInt(4));
        return computerChoiceOnHardMode;
    }

    public void setComputerPoints(int computerPoints) {
        this.computerPoints = computerPoints;
    }

    public int getComputerPoints() {
        return computerPoints;
    }
}
