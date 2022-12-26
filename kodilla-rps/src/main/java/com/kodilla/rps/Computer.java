package com.kodilla.rps;

import java.util.*;

public class Computer {
    Player player = new Player();
    Random rnd = new Random();
    boolean isHardModeOn = false;
    boolean is5MovesGameOn = false;
    private int computerPoints = 0;
    private final Map<Integer,String> mapOfMovesOnHardMode = player.getMapOfMoves();
    private final Map<Integer, String> mapOf5MovesOnHardMode = player.getMapOf5Moves();

    private Map<Integer,String> mapOfMovesOnHardMode(Integer answer){
        mapOfMovesOnHardMode.put(4, player.getMapOfMoves().get(answer));
        return mapOfMovesOnHardMode;
    }
    private Map<Integer,String> mapOf5MovesOnHardMode(Integer answer){
        mapOf5MovesOnHardMode.put(6,player.getMapOf5Moves().get(answer));
                return mapOf5MovesOnHardMode;
    }

    public String computerMove(Integer answer){
        if(isHardModeOn && is5MovesGameOn) {
            System.out.println(mapOf5MovesOnHardMode(answer));
            return mapOf5MovesOnHardMode(answer).get(rnd.nextInt(1,6));
        }
        else if(!isHardModeOn && !is5MovesGameOn) {
            System.out.println(player.getMapOfMoves());
            return player.getMapOfMoves().get(rnd.nextInt(1, 3));
        }
        else if (!isHardModeOn && is5MovesGameOn) {
            System.out.println(player.getMapOf5Moves());
            return player.getMapOf5Moves().get(rnd.nextInt(1,5));
        }
        else
            return mapOfMovesOnHardMode(answer).get((rnd.nextInt(1,4)));
    }
    public void setComputerPoints(int computerPoints) {
        this.computerPoints = computerPoints;
    }
    public int getComputerPoints() {
        return computerPoints;
    }

    public void set5MovesGameOn(boolean moreMoves) {
        is5MovesGameOn = moreMoves;
    }
    public void setHardModeOn(boolean hardModeOn) {
        isHardModeOn = hardModeOn;
    }
}
