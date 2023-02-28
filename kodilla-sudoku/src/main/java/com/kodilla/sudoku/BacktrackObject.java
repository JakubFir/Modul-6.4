package com.kodilla.sudoku;

import java.util.List;

public class BacktrackObject {
    private final SudokuBoard sudokuBoard;
    private final int row;
    private final int col;
    private final int value;

    public BacktrackObject(SudokuBoard sudokuBoard, int row, int col, int value) {
        this.sudokuBoard = sudokuBoard;
        this.row = row;
        this.col = col;
        this.value = value;
    }

    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getValue() {
        return value;
    }



}