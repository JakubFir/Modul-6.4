package com.kodilla.rps;

import java.util.*;

public class RpsGame  {
    RpsMenu rpsMenu = new RpsMenu();
    Computer computer = new Computer();
    InputValidator inputValidator = new InputValidator();
    Player player = new Player();
    private final Scanner scanner = new Scanner(System.in);

    private final Random rnd = new Random();
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
        inputValidator.validateDifficulty(rpsMenu.difficultyLevel());
        gameMenage();

    }
    void gameMenage(){
        do {
            String difficulty = rpsMenu.getDifficult();
            rpsMenu.rpsGameMenu(inputValidator.getName());
            inputValidator.validateMove();
            if(difficulty.equals("1")) {
                computer.setHardModeOn(false);
                computerMove = computer.computerMove(inputValidator.getMove());
            }else if (difficulty.equals("2"))  {
                computer.setHardModeOn(true);
                computerMove = computer.computerMove(inputValidator.getMove());
            }
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
                (answer.equals("scisors")&& computerMove.equals("paper")))
            player.setPlayerPoints(player.getPlayerPoints()+1);
        else computer.setComputerPoints(computer.getComputerPoints()+1);
    }

    public void menageAnswers(String computerMove,Integer answer){
        if(player.getMapOfMoves().containsKey(answer)) {
            gameLogic(computerMove,player.getMapOfMoves().get(answer));{
                System.out.println("Computer choice: " + computerMove);
            }
        }else {
            System.out.println("Please pick one of the options in menu!");
            gameMenage();
        }
    }

    void checkingWinner(int rounds){
        if(computer.getComputerPoints() == rounds) {
            System.out.println("The game has ended the winner is: Computer" );
            inputValidator.validateEndGameAnswer(rpsMenu.endGameMenu());
            if(rpsMenu.getEndGameChoice().equals("y")){
                startOfGame();
            }else if(rpsMenu.getEndGameChoice().equals("n")){
                endGame=true;
        }
        }else if (player.getPlayerPoints() == rounds){
            System.out.println("The game has ended the winner is: " + inputValidator.getName() );
            inputValidator.validateEndGameAnswer(rpsMenu.endGameMenu());
            if(rpsMenu.getEndGameChoice().equals("y")){
                startOfGame();
            }else if(rpsMenu.getEndGameChoice().equals("n")){
                endGame=true;
            }
        }
    }
}
