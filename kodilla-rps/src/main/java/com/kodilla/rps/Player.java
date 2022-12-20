package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public class Player  {
    private Map<Integer,String> mapOfMoves;
    private int playerPoints = 0;

    private Map<Integer,String> mapOfMoves(){
        mapOfMoves = new HashMap<>();
        mapOfMoves.put(1,"rock");
        mapOfMoves.put(2,"paper");
        mapOfMoves.put(3,"scisors");
        return mapOfMoves;
    }
    public Map<Integer, String> getMapOfMoves() {
        return mapOfMoves();
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }

}
