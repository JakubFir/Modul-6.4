    package com.kodilla.sudoku;

    import java.util.ArrayList;

    import java.util.List;

    public class SudokuRow {

        private List<SudokuElement> row = new ArrayList<>();
        private List<SudokuElement> possibleMoves = new ArrayList<>();

        public List<SudokuElement> getRow() {
            return row;
        }


        public SudokuRow() {
            for (int i = 0; i < 9; i++) {
                row.add(new SudokuElement(SudokuElement.EMPTY));
            }
        }

        @Override
        public String toString() {
            String result = "";
            for (int i = 0; i < 9; i++) {
                if(i % 3==0){
                    result += "|";
                }
                result += row.get(i).toString() ;
            }
            result += "|\n";
            return result;
        }
    }
