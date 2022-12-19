package com.kodilla.rps;

import java.util.*;

public class RpsGame  {
    RpsMenu rpsMenu = new RpsMenu();
    Computer computer = new Computer();
    InputValidator inputValidator = new InputValidator();
    Player player = new Player();
    private Scanner scanner = new Scanner(System.in);

    private Random rnd = new Random();
    private  boolean endGame = false;
    String computerMove;
    String diff;
    String answer;
    boolean startGame = false;

    void startOfGame(){
        do{
            if(inputValidator.validName() && inputValidator.validRounds()){
                startGame = true;
            }
        }while(!startGame);
        rpsMenu.startGame(inputValidator.getName(), inputValidator.getRounds());
        player.setPlayerPoints(0);
        computer.setComputerPoints(0);
        do {
            if (inputValidator.validDiff(diff = rpsMenu.diffLevel())) {
                gameMenage();
            }
        }while(!inputValidator.validDiff(diff = rpsMenu.diffLevel()));
    }
    void gameMenage(){
        do {
            rpsMenu.menu(inputValidator.getName());
            answer = scanner.nextLine();
            if(diff.equals("1")) {
                computerMove = computer.computerMove();
            }else if (diff.equals("2")) {
                computerMove = computer.computerMoveOnHardMode(answer);
            }
            menageAnswers(computerMove, answer);
            rpsMenu.scoreBoard(player.getPlayerPoints(),computer.getComputerPoints());
            checkingWinner(inputValidator.getRounds());
        }while (!endGame);
    }



    public void gameLogic(String answer,String computerChoice){
        if(answer.equals(computerChoice)){
            System.out.println("tie!");
        }else if(answer.equals("paper") && computerChoice.equals("rock") ||
                (answer.equals("rock") && computerChoice.equals("scisors")) ||
                (answer.equals("scisors")&& computerChoice.equals("paper")))
            player.setPlayerPoints(player.getPlayerPoints()+1);
        else computer.setComputerPoints(computer.getComputerPoints()+1);
    }

    public void menageAnswers(String computerMove,String answer){
        if(player.getPlayerMoves().contains(answer)) {
            if (answer.equals("1")) {
                gameLogic("rock", computerMove);
                System.out.println("Computer choice: " + computerMove);
            }
            if (answer.equals("2")) {
                gameLogic("paper", computerMove);
                System.out.println("Computer choice: " + computerMove);
            }
            if (answer.equals("3")) {
                gameLogic("scisors", computerMove);
                System.out.println("Computer choice: " + computerMove);
            }
            if (answer.equals("x")) {
                System.out.println("Are you sure you want to end the game ? Y/N");
                String answer2 = scanner.nextLine().toLowerCase();
                if (answer2.equals("y")) {
                    System.out.println("The game has ended with score: ");
                    endGame = true;
                } else if (answer2.equals("n")) {
                    System.out.println("Good luck \n");
                }
            }
            if (answer.equals("n")) {
                System.out.println("Are you sure you want to restart the game ? Y/N");
                String answer2 = scanner.nextLine().toLowerCase();
                if (answer2.equals("y")) {
                    System.out.println("Starting new game \n");
                    startOfGame();
                } else if (answer2.equals("n")) {
                    System.out.println("Good luck \n");
                }
            }
        }else {
            System.out.println("Please pick one of the options in menu!");
            gameMenage();
        }
    }

    void checkingWinner(int rounds){
        String answer;
        if(computer.getComputerPoints() == rounds) {
            System.out.println("The game has ended the winner is: Computer" );
            System.out.println("Would you like to play another one ? Y/N");
            answer = scanner.nextLine().trim().toLowerCase();
            if(answer.equals("y")){
                startOfGame();
            }else  endGame = true;

        }else if (player.getPlayerPoints() == rounds){
            System.out.println("The game has ended the winner is: " + inputValidator.getName() );
            System.out.println("Would you like to play another one ? Y/N");
            answer = scanner.nextLine().trim().toLowerCase();
            if(answer.equals("y")){
                startOfGame();
            }else  endGame = true;
        }
    }
}
