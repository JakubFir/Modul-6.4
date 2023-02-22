package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private List<SudokuElement> cols = new ArrayList<>();

    public List<SudokuElement> getCols() {
        return cols;
    }

    public SudokuRow() {
        for (int i = 0; i < 9; i++) {
            cols.add(new SudokuElement(SudokuElement.EMPTY));
        }
    }

    @Override
    public String toString() {
        String result = "|";
        for (int i = 0; i < 9; i++) {
            result += cols.get(i).toString() + "|";
        }
        result += "\n";
        return result;
    }
}
