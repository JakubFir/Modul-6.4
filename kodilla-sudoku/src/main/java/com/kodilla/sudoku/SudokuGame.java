package com.kodilla.sudoku;


public class SudokuGame {
    SudokuBoard sudokuBoard = new SudokuBoard();
    SudokuAlgorithm sudokuAlgorithm = new SudokuAlgorithm(sudokuBoard);
    SudokuMenu sudokuMenu = new SudokuMenu();

    public void startGame() throws CloneNotSupportedException {

        boolean gameFinished = false;
        do {
            sudokuMenu.displayBoard(sudokuBoard);
            sudokuMenu.moveMenu(sudokuAlgorithm);
            if (sudokuMenu.isReadyToSolve()) {
               gameFinished = resolveSudoku();
            }
        }while (!gameFinished);

    }
    private boolean resolveSudoku() throws CloneNotSupportedException {
        if(sudokuAlgorithm.solve()){
            System.out.println(sudokuBoard);
            return true;
        }else{
            System.out.println(sudokuBoard + " Board unsolvable");
            return true;
        }
    }
}
