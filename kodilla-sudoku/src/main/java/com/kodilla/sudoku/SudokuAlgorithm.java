package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuAlgorithm {
    private SudokuBoard sudokuBoard;
    private CheckConstreins checkConstreins = new CheckConstreins();
    private List<BacktrackObject> backtrackObjects = new ArrayList<>();
    private boolean unsolvable = false;
    private int guessCount =0;

    public SudokuAlgorithm(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public boolean validate(int col, int row, int value) {
        if (col > 9 || row > 9 || value > 9) {
            System.out.println("invalid move");
            return false;
        }
        if (sudokuBoard.currentElementPossibleMoves(col, row).contains(value)) {
            sudokuBoard.setSudokuElement(col, row, new SudokuElement(value));
            return true;
        } else {
            System.out.println("move invalid");
            return false;
        }
    }

    public boolean solve() throws CloneNotSupportedException {
        while (!isSolved() || !unsolvable) {
            if(guessCount > 11){
                return isSolved();
            }
            int numFilled = 0;
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (sudokuBoard.getElement(col, row).getValue() == SudokuElement.EMPTY) {
                        List<Integer> currentPossibleMoves = sudokuBoard.currentElementPossibleMoves(col, row);
                        if (sudokuBoard.getElement(col, row).getValue() == -1 && sudokuBoard.currentElementPossibleMoves(col, row).size() == 0) {
                            undo();
                        }
                        if (!checkConstreins.checkForOnePossibleMoveLeft(currentPossibleMoves, col, row, sudokuBoard)) {
                            for (int move : currentPossibleMoves) {
                                if (checkConstreins.checkIfMoveIsntPossibleInOtherFields(col, row, move, sudokuBoard)) {
                                    sudokuBoard.setSudokuElement(col, row, new SudokuElement(move));
                                    numFilled++;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (numFilled == 0) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (sudokuBoard.getElement(i, j).getValue() == -1) {
                            if (sudokuBoard.currentElementPossibleMoves(i, j).size() > 0) {
                                int move = sudokuBoard.currentElementPossibleMoves(i, j).get(0);
                                 guess(i, j, move);
                            }
                        }
                    }
                }
            }
        }
        return isSolved();
    }
    private void guess(int i, int j, int move) throws CloneNotSupportedException {
        guessCount++;
        SudokuBoard copy = sudokuBoard.deepCopy();
        backtrackObjects.add(new BacktrackObject(copy, i, j, move));
        sudokuBoard.setSudokuElement(i, j, new SudokuElement(move));
        solve();
    }


    private boolean isSolved() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudokuBoard.getElement(i, j).getValue() == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public void undo() {
        if (backtrackObjects.size() > 0) {
            BacktrackObject lastBacktrack = backtrackObjects.get(backtrackObjects.size() - 1);
            sudokuBoard = lastBacktrack.getSudokuBoard();
            sudokuBoard.setSudokuElement(lastBacktrack.getCol(), lastBacktrack.getRow(), new SudokuElement(SudokuElement.EMPTY));
            sudokuBoard.currentElementPossibleMoves(lastBacktrack.getCol(), lastBacktrack.getRow()).remove(Integer.valueOf(lastBacktrack.getValue()));
            backtrackObjects.remove(backtrackObjects.size() - 1);
        }
        if (backtrackObjects.size() > 60) {
            backtrackObjects.remove(0);
        }
    }
}