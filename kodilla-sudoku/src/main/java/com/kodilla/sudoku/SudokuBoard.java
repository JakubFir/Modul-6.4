package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends Prototype<SudokuBoard> {
    private List<SudokuRow> board = new ArrayList<>();

    public List<SudokuRow> getBoard() {
        return board;
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = super.clone();
        clonedBoard.board = new ArrayList<>();
        for (SudokuRow sudokuRow : board) {
            SudokuRow clonedSudokuRow = new SudokuRow(sudokuRow);
            for (SudokuElement sudokuElement : sudokuRow.getRow()) {
                SudokuElement clonedElement = new SudokuElement(sudokuElement.getValue());
                clonedSudokuRow.getRow().add(clonedElement);
            }
            clonedBoard.getBoard().add(clonedSudokuRow);
        }
        return clonedBoard;
    }

    public SudokuBoard() {
        for (int i = 0; i <= 9; i++) {
            board.add(new SudokuRow());
        }
    }

    public SudokuElement getElement(int col, int row) {
        return board.get(row).getRow().get(col);
    }

    public void setSudokuElement(int col, int row, SudokuElement sudokuElement) {
        board.get(row).getRow().set(col, sudokuElement);
    }

    public List<Integer> currentElementPossibleMoves(int col, int row) {
        SudokuElement currentElement = getElement(col, row);
        List<Integer> currentElementPossibleMoves = currentElement.getPossibleMoves();
        if (currentElement.getValue() != -1) {
            currentElementPossibleMoves.clear();
        }
        for (int i = 0; i < 9; i++) {
            removeInRow(i, row, currentElement, currentElementPossibleMoves);
            removeInColumns(col, i, currentElement, currentElementPossibleMoves);
            removeInBox(i, row, col, currentElement, currentElementPossibleMoves);
        }
        return currentElementPossibleMoves;
    }

    public void removeInRow(int i, int row, SudokuElement currentElement, List<Integer> currentElementPossibleMoves) {
        if (currentElementPossibleMoves.contains(getElement(i, row).getValue())) {
            currentElement.getPossibleMoves().remove(Integer.valueOf(getElement(i, row).getValue()));
        }
    }

    public void removeInBox(int i, int row, int col, SudokuElement currentElement, List<Integer> currentElementPossibleMoves) {

        int boxRow = (row / 3) * 3 + i / 3;
        int boxCol = (col / 3) * 3 + i % 3;
        if (currentElementPossibleMoves.contains(getElement(boxCol, boxRow).getValue())) {
            currentElement.getPossibleMoves().remove(Integer.valueOf(getElement(boxCol, boxRow).getValue()));
        }
    }

    public void removeInColumns(int col, int i, SudokuElement currentElement, List<Integer> currentElementPossibleMoves) {
        if (currentElementPossibleMoves.contains(getElement(col, i).getValue())) {
            currentElement.getPossibleMoves().remove(Integer.valueOf(getElement(col, i).getValue()));
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int row = 0; row < 9; row++) {
            if (row % 3 == 0) {
                result += "+------+------+------+\n";
            }
            result += board.get(row).toString();
        }
        return result;
    }
}

