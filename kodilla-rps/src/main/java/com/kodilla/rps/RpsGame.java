package com.kodilla.rps;

import java.util.*;

public class RpsGame  {
    RpsMenu rpsMenu = new RpsMenu();
    Computer computer = new Computer();
    InputValidator inputValidator = new InputValidator();
    Player player = new Player();
    private  boolean endGame = false;
    private String computerMove;
    boolean startGame = false;

    void startOfGame(){
        boolean validateName;
        boolean validateRounds;
        do{
            System.out.println("Please give me your Name to start the game");
            validateName = inputValidator.validateName();
            System.out.println("How many round would you like to play");
            validateRounds = inputValidator.validateRounds();

        }while(!validateName && !validateRounds);
        startGame = true;
        rpsMenu.startGame(inputValidator.getName(), inputValidator.getRounds());
        player.setPlayerPoints(0);
        computer.setComputerPoints(0);
        rpsMenu.difficultyLevel();
        inputValidator.validateDifficulty();
        rpsMenu.gameMode();
        inputValidator.validateGameMode();
        gameMenage();

    }
    void choosingComputerMove(){
        String difficulty = inputValidator.getDificulity();
        String gameMode = inputValidator.getGameMode();
        System.out.println(gameMode);
        System.out.println(difficulty);
        if(difficulty.equals("1") && gameMode.equals("1")) {
            computer.setHardModeOn(false);
            computer.set5MovesGameOn(false);
            computer.computerMove(inputValidator.getMove());
            }
        else if(difficulty.equals("1") && gameMode.equals("2")){
            computer.setHardModeOn(false);
            computer.set5MovesGameOn(true);
            computerMove = computer.computerMove(inputValidator.getMove());
        }
        else if (difficulty.equals("2") && gameMode.equals("1"))  {
            computer.set5MovesGameOn(false);
            computer.setHardModeOn(true);
            computerMove = computer.computerMove(inputValidator.getMove());
        }
        else {
            computer.setHardModeOn(true);
            computer.set5MovesGameOn(true);
            computerMove = computer.computerMove(inputValidator.getMove());
        }
    }
    void gameMenage(){
        do {
            rpsMenu.rpsGameMenu(inputValidator.getName(),inputValidator.getGameMode());
            inputValidator.validateMove();
            choosingComputerMove();
            menageAnswers(computerMove, inputValidator.getMove());
            rpsMenu.scoreBoard(player.getPlayerPoints(),computer.getComputerPoints());
            checkingWinner(inputValidator.getRounds());
        }while (!endGame);
    }



    public void gameLogic(String computerMove,String answer){
        if(answer.equals(computerMove)){
            System.out.println("tie!");
        }else if(answer.equals("paper") && computerMove.equals("rock") ||
                (answer.equals("rock") && computerMove.equals("scisors")) ||
                (answer.equals("scisors")&& computerMove.equals("paper")) ||
                (answer.equals("lizard") && computerMove.equals("spock")) ||
                (answer.equals("lizard") && computerMove.equals("paper")) ||
                (answer.equals("spock") && computerMove.equals("scisors")) ||
                (answer.equals("spock") && computerMove.equals("rock")))
            player.setPlayerPoints(player.getPlayerPoints()+1);
        else computer.setComputerPoints(computer.getComputerPoints()+1);
    }

    public void menageAnswers(String computerMove,Integer answer){
        if(inputValidator.getGameMode().equals("1") && player.getMapOfMoves().containsKey(answer)) {
            gameLogic(computerMove,player.getMapOfMoves().get(answer));
                {
                    System.out.println("Computer choice: " + computerMove);
                }
            }
        else if(inputValidator.getGameMode().equals("2") && player.getMapOf5Moves().containsKey(answer)){
                gameLogic(computerMove,player.getMapOf5Moves().get(answer));
                {
                    System.out.println("Computer choice: " + computerMove);
                }
            }
        else {
            System.out.println("Please pick one of the options in menu!");
            gameMenage();
        }
    }

    void checkingWinner(int rounds){
        if(computer.getComputerPoints() == rounds) {
            System.out.println("The game has ended the winner is: Computer" );
            rpsMenu.endGameMenu();
            inputValidator.validateEndGameAnswer();
            if(inputValidator.getEndGameChoice().equals("y")){
                startOfGame();
            }else if(inputValidator.getEndGameChoice().equals("n")){
                endGame=true;
        }
        }else if (player.getPlayerPoints() == rounds){
            System.out.println("The game has ended the winner is: " + inputValidator.getName());
            rpsMenu.endGameMenu();
            inputValidator.validateEndGameAnswer();
            if(inputValidator.getEndGameChoice().equals("y")){
                startOfGame();
            }else if(inputValidator.getEndGameChoice().equals("n")){
                endGame=true;
            }
        }
    }

}
