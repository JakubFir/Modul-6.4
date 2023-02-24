package com.kodilla.sudoku;

import java.util.List;

public class SudokuAlgorithm {
    private SudokuBoard sudokuBoard;

    public SudokuAlgorithm(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public void solve() {
        boolean haventMadeMove = true;
        while (!haventMadeMove) {
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (sudokuBoard.getElement(col, row).getValue() == SudokuElement.EMPTY) {
                        List<Integer> currentPossibleMoves = sudokuBoard.currentElementPossibleMoves(col, row);
                        if (currentPossibleMoves.size() == 1) {
                            int move = currentPossibleMoves.get(0);
                            sudokuBoard.setSudokuElement(col, row, new SudokuElement(move));
                            haventMadeMove = true;
                        } else {
                            for (int move : currentPossibleMoves) {
                                boolean foundMatch = false;
                                for (int i = 0; i < 9; i++) {
                                    if (sudokuBoard.getElement(i, row).getValue() == move && sudokuBoard.getElement(i, row).getPossibleMoves().contains(move) ||
                                            sudokuBoard.getElement(col, i).getValue() == move && sudokuBoard.getElement(col, i).getPossibleMoves().contains(move) ||
                                            sudokuBoard.getElement((col / 3) * 3 + i % 3, (row / 3) * 3 + i / 3).getValue() == move &&
                                                    sudokuBoard.getElement((col / 3) * 3 + i % 3, (row / 3) * 3 + i / 3).getPossibleMoves().contains(move)) {
                                        foundMatch = true;
                                        break;
                                    }
                                    if (sudokuBoard.getElement(i, row).getValue() == move && sudokuBoard.getElement(col, row).getPossibleMoves().size() == 1 ||
                                            sudokuBoard.getElement(col, i).getValue() == move && sudokuBoard.getElement(col, row).getPossibleMoves().size() == 1 ||
                                            sudokuBoard.getElement((col / 3) * 3 + i % 3, (row / 3) * 3 + i / 3).getValue() == move &&
                                                    sudokuBoard.getElement(col, row).getPossibleMoves().size() == 1) {
                                        haventMadeMove = false;
                                        System.out.println("error");
                                    }
                                    if (!foundMatch) {
                                        sudokuBoard.setSudokuElement(col, row, new SudokuElement(move));
                                        haventMadeMove=true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            haventMadeMove = true;
        }
    }
}