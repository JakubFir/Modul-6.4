package com.kodilla.sudoku;


import java.util.Scanner;

public class SudokuMenu {
    public final static String SUDOKU = "SUDOKU";
    Scanner scanner = new Scanner(System.in);

    public void displayBoard(SudokuBoard sudokuBoard) {
        System.out.println(sudokuBoard);
    }

    public void moveMenu(SudokuAlgorithm sudokuAlgorithm) {
        boolean validMove;
        do {
            System.out.println("make move by choosing row/column/value");
            System.out.println("choice row: ");
            int row = scanner.nextInt();
            System.out.println("choice column: ");
            int col = scanner.nextInt();
            System.out.println("choice value: ");
            int value = scanner.nextInt();
            validMove = sudokuAlgorithm.validate(row,col,value);
        }while(!validMove);

    }

    public boolean isReadyToSolve() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("is your sudoku ready to solve");
        System.out.println("if yes type SUDOKU");
        System.out.println("if no type anything");
        String answer = scanner1.nextLine();
        if(answer.equals(SUDOKU)){
            return true;
        }else
            return false;
    }
}
