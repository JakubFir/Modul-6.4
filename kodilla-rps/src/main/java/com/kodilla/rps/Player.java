package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class Player  {
    private List<String> playerMoves;
    private int playerPoints = 0;

    private List<String> playerMoves(){
        playerMoves = new ArrayList<>();
        playerMoves.add("1");
        playerMoves.add("2");
        playerMoves.add("3");
        playerMoves.add("x");
        playerMoves.add("n");
        return playerMoves;
    }

    public List<String> getPlayerMoves() {
        return playerMoves();
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }

}
