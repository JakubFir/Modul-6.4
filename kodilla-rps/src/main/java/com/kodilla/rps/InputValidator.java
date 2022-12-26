package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {
    private String name;
    private String endGameChoice;
    private String gameMode;
    private String dificulity;
    private  int rounds;
    private Integer move;
    private Scanner scanner = new Scanner(System.in);

    boolean validateRounds(){
        boolean validateRounds;
        do {
            try {
                rounds = scanner.nextInt();
                validateRounds = true;
            } catch (InputMismatchException exc) {
                System.out.println("Wrong round input");
                scanner.nextLine();
                validateRounds = false;
            }
        }while (!validateRounds);
        scanner.nextLine();
        return validateRounds;
    }
    boolean validateMove(){
        boolean validateMove;
        do {
            try {
                move = scanner.nextInt();
                validateMove = true;
            } catch (InputMismatchException exc) {
                System.out.println("Wrong move input");
                scanner.nextLine();
                validateMove = false;
            }
        }while (!validateMove);
        scanner.nextLine();
        return validateMove;
    }
    boolean validateDifficulty(){
        boolean validateDifficulty;
        do {
            dificulity = scanner.nextLine();
            if (dificulity.equals("1") || dificulity.equals("2")) {
                validateDifficulty = true;
            } else {
                System.out.println("Wrong input");

                validateDifficulty = false;
            }
        }while (!validateDifficulty);

            return validateDifficulty;
    }
    boolean validateName(){
        boolean valid;
        do {
            name = scanner.nextLine().trim();
            if (name.length() == 0 || name.isBlank()) {
                valid = false;
                System.out.println("Wrong user name input");
            } else {
                valid = true;
            }
        }while (!valid);
        return valid;
    }

     boolean validateEndGameAnswer() {
         boolean validEndGameAnswer;
         do{
             endGameChoice = scanner.nextLine();
            if(endGameChoice.equals("y") || endGameChoice.equals("n")){
                validEndGameAnswer = true;
            }else {
                System.out.println("wrong end game input");
                validEndGameAnswer = false;
            }
        }while (!validEndGameAnswer);
        return validEndGameAnswer;
    }
    public boolean validateGameMode() {
        boolean validateMode = false;
        do {
            gameMode = scanner.nextLine();
            if(gameMode.equals("1")|| gameMode.equals("2")){
                validateMode = true;
            }
            else{
                System.out.println("wrong game mode input");
                validateMode = false;
            }

        }while (!validateMode);
        setGameMode(gameMode);
        return validateMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getName() {
        return name;
    }

    public String getDificulity() {
        return dificulity;
    }

    public String getEndGameChoice(){
        return endGameChoice;
    }

    public Integer getMove() {
        return move;
    }

    public int getRounds() {
        return rounds;
    }
    public String getGameMode() {
        return this.gameMode;
    }


}
