package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {
    private String name;

    public String getName() {
        return name;
    }

    public int getRounds() {
        return rounds;
    }

    private  int rounds;
    private boolean valid= false;
    private boolean validDiff = false;
    private boolean validRounds = false;
    private Scanner scanner = new Scanner(System.in);

    boolean validRounds(){
        validRounds = false;
        do {
            System.out.println("How many round would you like to play");
            try {
                rounds = scanner.nextInt();
                validRounds = true;
            } catch (InputMismatchException exc) {
                System.out.println("Wrong round input");
                scanner.nextLine();
            }
        }while (!validRounds);
        scanner.nextLine();
        return validRounds;
    }
    boolean validDiff(String answer){

        if(answer.equals("1") || answer.equals("2")){
            validDiff = true;
        }
        else{
            System.out.println("Wrong input");
            validDiff = false;
        }
            return validDiff;
    }
    boolean validName(){
        System.out.println("Please give me your Name to start the game");
        name = scanner.nextLine().trim();
        if (name.length() == 0 || name.isBlank()) {
            valid = false;
            System.out.println("Wrong user name input");
        }else {
            valid = true;
        }
        return valid;
    }
}
