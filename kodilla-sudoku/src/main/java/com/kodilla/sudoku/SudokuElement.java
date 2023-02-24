package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    public static final int EMPTY = -1;
    private int value;
    private List<Integer> possibleValues;

    public SudokuElement(int value) {
        this.value = value;
        this.possibleValues = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            possibleValues.add(i);
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getPossibleMoves() {
        return possibleValues;
    }

    @Override
    public String toString() {
        String s = "";
        if (value == -1) {
            s = "" + value;
        } else {
            s = " " + value;
        }
        return s;
    }
}
