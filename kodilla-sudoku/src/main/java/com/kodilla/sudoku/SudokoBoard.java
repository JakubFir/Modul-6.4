package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokoBoard {
    private List<SudokuRow> board = new ArrayList<>();

    public List<SudokuRow> getBoard() {
        return board;
    }
    public SudokoBoard() {
       for(int i = 0; i < 9; i++){
        board.add(new SudokuRow());
       }
    }

    public SudokuElement getElement(int col, int row){
        return board.get(row).getCols().get(col);
    }

    public void setSudokuElement(int col,int row , SudokuElement sudokuElement){
        board.get(row).getCols().set(col,sudokuElement);
    }


    @Override
    public String toString() {
     String result = "";
       for (int row =0; row < 9; row ++){
          result += board.get(row).toString();
       }
        return result;
    }
}
