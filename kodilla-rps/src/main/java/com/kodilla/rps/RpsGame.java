package com.kodilla.rps;

import java.util.*;

public class RpsGame {
    InputValidator inputValidator = new InputValidator();
    private List<String> playerMoves;
    private List <String> listOfMoves;
    private int playerPoints = 0;
    private int computerPoints = 0;
    private Scanner scanner = new Scanner(System.in);
    private Random rnd = new Random();
    private  boolean endGame = false;
    boolean startGame = false;
    private List<String> listOfMoves(){
        listOfMoves = new ArrayList<>();
        listOfMoves.add("rock");
        listOfMoves.add("paper");
        listOfMoves.add("scisors");
        return listOfMoves;
    }

   private List<String> playerMoves(){
        playerMoves = new ArrayList<>();
        playerMoves.add("1");
        playerMoves.add("2");
        playerMoves.add("3");
        playerMoves.add("x");
        playerMoves.add("n");
        return playerMoves;
    }

    void startOfGame(){

        do{
            if(inputValidator.validName() && inputValidator.validRounds()){
                startGame = true;
            }
        }while(!startGame);
        System.out.println("Hello: " + inputValidator.getName() + "\n");
        System.out.println("Welcome to rock, paper, scisors game");
        System.out.println("You win by scoring " + inputValidator.getRounds() + " points, Good Luck" + "\n");
        System.out.println(inputValidator.getName() + " its your time to move: ");
        gameMenage();
    }

    void gameMenage(){
        do {
            System.out.println("press 1 to play rock");
            System.out.println("press 2 to play paper");
            System.out.println("press 3 to play scisors");
            System.out.println("press x to end the game");
            System.out.println("press n to restart the game");
            String computerMove = computerMove();
            menagePlayerChoice(computerMove);
            System.out.println("Your points: " + playerPoints);
            System.out.println("My points: " + computerPoints);
            checkingWinner(inputValidator.getRounds());
        }while (!endGame);
    }

    public String computerMove(){
        String computerChoice = listOfMoves().get(rnd.nextInt(3));
        return computerChoice;
    }

    public void menagePlayerChoice(String computerMove){
        String answer = scanner.nextLine().toLowerCase();
        if(playerMoves().contains(answer)) {
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
                    playerPoints = 0;
                    computerPoints = 0;
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
        if(computerPoints == rounds) {
            System.out.println("The game has ended the winner is: Computer" );
            System.out.println("Would you like to play another one ? Y/N");
            answer = scanner.nextLine().trim().toLowerCase();
            if(answer.equals("y")){
                startOfGame();
            }else  endGame = true;

        }else if (playerPoints == rounds){

            System.out.println("The game has ended the winner is: " + inputValidator.getName() );
            System.out.println("Would you like to play another one ? Y/N");
            answer = scanner.nextLine().trim().toLowerCase();
            if(answer.equals("y")){
                startOfGame();
            }else  endGame = true;
        }
    }

    public void gameLogic(String answer,String computerChoice){
        if(answer.equals(computerChoice)){
            System.out.println("tie!");
        }
        if(answer.equals("rock") && computerChoice.equals("paper")){
            computerPoints++;
        } else if (computerChoice.equals("scisors") && answer.equals("rock") ) {
            playerPoints++;
        }
        if(answer.equals("paper") && computerChoice.equals("scisors")){
            computerPoints++;
        }else if (computerChoice.equals("rock") && answer.equals("paper")){
            playerPoints++;
        }
        if(answer.equals("scisors") && computerChoice.equals("rock")){
            computerPoints++;
        }else if(computerChoice.equals("paper") && answer.equals("scisors")){
            playerPoints++;
        }
    }
}
