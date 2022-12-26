package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;

public class Player  {
    private Map<Integer,String> mapOfMoves;
    private Map<Integer,String> mapOf5Moves = mapOfMoves();
    private int playerPoints = 0;

    private Map<Integer,String> mapOfMoves(){
        mapOfMoves = new HashMap<>();
        mapOfMoves.put(1,"rock");
        mapOfMoves.put(2,"paper");
        mapOfMoves.put(3,"scisors");
        return mapOfMoves;
    }
    public Map<Integer, String> MapOf5Moves() {
        mapOf5Moves.put(4,"lizard");
        mapOf5Moves.put(5,"spock");
        return mapOf5Moves;
    }
    public Map<Integer, String> getMapOf5Moves() {
        return MapOf5Moves();
    }
    public Map<Integer, String> getMapOfMoves() {
        return  mapOfMoves();
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }


}
