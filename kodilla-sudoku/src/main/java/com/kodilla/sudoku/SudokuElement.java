package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    public static int EMPTY = -1;

    List<Integer> possibleMoves = new ArrayList<>();
    int value;

    public SudokuElement(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String s = "" + value;
        return s;
    }
}
