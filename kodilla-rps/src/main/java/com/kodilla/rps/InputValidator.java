package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {
    private String name;
    RpsMenu rpsMenu = new RpsMenu();
    private  int rounds;
    private boolean valid= false;
    private Integer move;
    private boolean validateDifficulty = false;
    private boolean validateMove = false;
    private boolean validateRounds = false;
    private boolean validEndGameAnswer = false;
    private Scanner scanner = new Scanner(System.in);

    boolean validateRounds(){
        validateRounds = false;
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
        validateMove = false;
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
    boolean validateDifficulty(String answer){
        if(answer.equals("1") || answer.equals("2")){
            validateDifficulty = true;
        }
        else{
            System.out.println("Wrong input");
            validateDifficulty = false;
        }
            return validateDifficulty;
    }
    boolean validateName(){
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

     boolean validateEndGameAnswer(String answer) {
        do{
            if(answer.equals("y") || answer.equals("n")){
                validEndGameAnswer = true;
            }else {
                System.out.println("wrong end game input");
                validEndGameAnswer = false;
                answer = scanner.nextLine().trim().toLowerCase();
            }
        }while (!validEndGameAnswer);
        rpsMenu.setEndGameChoice(answer);
        return validEndGameAnswer;
    }

    public String getName() {
        return name;
    }

    public Integer getMove() {
        return move;
    }

    public int getRounds() {
        return rounds;
    }
}
