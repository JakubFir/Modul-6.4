package com.kodilla.sudoku;

import java.util.List;

public class CheckConstreins {

    public boolean checkIfMoveIsntPossibleInOtherFields(int col, int row, int move, SudokuBoard sudokuBoard) throws CloneNotSupportedException {
        if (!checkIfRowContainsMove(col, row, move, sudokuBoard) ||
                !checkIfColumnContainsMove(col, row, move, sudokuBoard) ||
                !checkIfBoxContainsMove(col, row, move, sudokuBoard)) {
            return false;
        }

        return true;
    }

    public boolean checkIfBoxContainsMove(int col, int row, int move, SudokuBoard sudokuBoard) {
        for (int i = 0; i < 9; i++) {
            if (row == i && col == i) {
                continue;
            }
            if (sudokuBoard.currentElementPossibleMoves((col / 3) * 3 + i % 3, (row / 3) * 3 + i / 3).contains(move)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfColumnContainsMove(int col, int row, int move, SudokuBoard sudokuBoard) {
        for (int i = 0; i < 9; i++) {
            if (row == i) {
                continue;
            }
            if (sudokuBoard.currentElementPossibleMoves(col, i).contains(move)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfRowContainsMove(int col, int row, int move, SudokuBoard sudokuBoard) {
        for (int i = 0; i < 9; i++) {
            if (i == col) {
                continue;
            }
            if (sudokuBoard.currentElementPossibleMoves(i, row).contains(move)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkForOnePossibleMoveLeft(List<Integer> currentPossibleMoves, int col, int row, SudokuBoard sudokuBoard) {
        if (currentPossibleMoves.size() == 1) {
            int move = currentPossibleMoves.get(0);
            sudokuBoard.setSudokuElement(col, row, new SudokuElement(move));
            return true;
        }
        return false;
    }
}
