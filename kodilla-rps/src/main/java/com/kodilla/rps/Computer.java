package com.kodilla.rps;

import java.util.*;

public class Computer {
    Player player = new Player();
    Random rnd = new Random();
    private int computerPoints = 0;
    private Map<Integer,String> mapOfMoves;
    private Map <Integer,String> listOfMovesOnHardMode;

    private Map<Integer,String> mapOfMovesOnHardMode(){
        mapOfMoves = new HashMap<>();
        mapOfMoves.put(1,"rock");
        mapOfMoves.put(2,"paper");
        mapOfMoves.put(3,"scisors");
        return mapOfMoves;
    }

    public String computerMove(){
        return player.getMapOfMoves().get(rnd.nextInt(1,3));
    }

    public Map<Integer,String> listOfMovesOnHardMode(Integer answer){
        listOfMovesOnHardMode = mapOfMovesOnHardMode();
        listOfMovesOnHardMode.put(4,player.getMapOfMoves().get(answer));
    return listOfMovesOnHardMode;
    }

    public String computerMoveOnHardMode(Integer answer){
        return listOfMovesOnHardMode(answer).get(rnd.nextInt(1,4));
    }

    public void setComputerPoints(int computerPoints) {
        this.computerPoints = computerPoints;
    }

    public int getComputerPoints() {
        return computerPoints;
    }
}
