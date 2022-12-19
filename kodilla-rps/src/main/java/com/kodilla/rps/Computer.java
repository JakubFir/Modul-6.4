package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    Random rnd = new Random();

    private int computerPoints = 0;
    private List <String> listOfMoves;

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

    public void setComputerPoints(int computerPoints) {
        this.computerPoints = computerPoints;
    }

    public int getComputerPoints() {
        return computerPoints;
    }
}
