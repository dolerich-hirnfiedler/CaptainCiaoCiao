package captainciaociao.kapitel_04._4_zweidimensionale_arrays.aufgabe_1;

public class SudokuBlockFactory {
    public static SudokuBlock initSudokuBlock() {
        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        return new SudokuBlock(array);
    }

    public static SudokuBlock initSudokuBlockTwo() {
        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 8 } };
        return new SudokuBlock(array);
    }
}
