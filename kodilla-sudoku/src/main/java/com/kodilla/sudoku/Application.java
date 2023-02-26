package com.kodilla.sudoku;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        SudokuBoard sudokuBoard = new SudokuBoard();
        SudokuAlgorithm sudokuAlgorithm = new SudokuAlgorithm(sudokuBoard);
        sudokuBoard.setSudokuElement(0, 1, new SudokuElement(6));
        sudokuBoard.setSudokuElement(0, 2, new SudokuElement(1));
        sudokuBoard.setSudokuElement(0, 3, new SudokuElement(8));
        sudokuBoard.setSudokuElement(0, 8, new SudokuElement(7));

        sudokuBoard.setSudokuElement(1, 1, new SudokuElement(8));
        sudokuBoard.setSudokuElement(1, 2, new SudokuElement(9));
        sudokuBoard.setSudokuElement(1, 3, new SudokuElement(2));
        sudokuBoard.setSudokuElement(1, 5, new SudokuElement(5));
        sudokuBoard.setSudokuElement(1, 7, new SudokuElement(4));

        sudokuBoard.setSudokuElement(2, 4, new SudokuElement(4));
        sudokuBoard.setSudokuElement(2, 6, new SudokuElement(9));
        sudokuBoard.setSudokuElement(2, 8, new SudokuElement(6));

        sudokuBoard.setSudokuElement(3, 0, new SudokuElement(2));
        sudokuBoard.setSudokuElement(3, 3, new SudokuElement(1));
        sudokuBoard.setSudokuElement(3, 4, new SudokuElement(6));
        sudokuBoard.setSudokuElement(3, 6, new SudokuElement(3));

        sudokuBoard.setSudokuElement(4, 0, new SudokuElement(6));
        sudokuBoard.setSudokuElement(4, 1, new SudokuElement(7));
        sudokuBoard.setSudokuElement(4, 7, new SudokuElement(5));
        sudokuBoard.setSudokuElement(4, 8, new SudokuElement(1));

        sudokuBoard.setSudokuElement(5, 2, new SudokuElement(4));
        sudokuBoard.setSudokuElement(5, 4, new SudokuElement(2));
        sudokuBoard.setSudokuElement(5, 5, new SudokuElement(6));
        sudokuBoard.setSudokuElement(5, 8, new SudokuElement(8));

        sudokuBoard.setSudokuElement(6, 0, new SudokuElement(7));
        sudokuBoard.setSudokuElement(6, 2, new SudokuElement(5));
        sudokuBoard.setSudokuElement(6, 4, new SudokuElement(9));

        sudokuBoard.setSudokuElement(7, 1, new SudokuElement(9));
        sudokuBoard.setSudokuElement(7, 3, new SudokuElement(4));
        sudokuBoard.setSudokuElement(7, 5, new SudokuElement(2));
        sudokuBoard.setSudokuElement(7, 6, new SudokuElement(7));
        sudokuBoard.setSudokuElement(7, 7, new SudokuElement(3));

        sudokuBoard.setSudokuElement(8, 0, new SudokuElement(6));

        sudokuAlgorithm.solve();
        sudokuAlgorithm.test();
        System.out.println(sudokuBoard);

    }
}
