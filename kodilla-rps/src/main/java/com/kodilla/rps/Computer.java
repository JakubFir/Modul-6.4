package com.kodilla.rps;

import java.util.*;

public class Computer {
    Player player = new Player();
    Random rnd = new Random();
    boolean isHardModeOn = false;
    private int computerPoints = 0;
    private final Map<Integer,String> mapOfMovesOnHardMode = player.getMapOfMoves();

    public void setHardModeOn(boolean hardModeOn) {
        isHardModeOn = hardModeOn;
    }

    private Map<Integer,String> mapOfMovesOnHardMode(Integer answer){
        mapOfMovesOnHardMode.put(4, player.getMapOfMoves().get(answer));
        return mapOfMovesOnHardMode;
    }

    public String computerMove(Integer answer){
        if(isHardModeOn) {
            System.out.println(mapOfMovesOnHardMode(answer));
            return mapOfMovesOnHardMode(answer).get(rnd.nextInt(1,4));
        }else if(!isHardModeOn)
            System.out.println(player.getMapOfMoves());
        return player.getMapOfMoves().get(rnd.nextInt(1, 3));

    }
    public void setComputerPoints(int computerPoints) {
        this.computerPoints = computerPoints;
    }

    public int getComputerPoints() {
        return computerPoints;
    }
}
