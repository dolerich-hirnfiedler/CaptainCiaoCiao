package captainciaociao.kapitel_04._4_zweidimensionale_arrays.aufgabe_1;

public class SudokuMain {
    public static void main(String[] args) {
        SudokuBlock correct = SudokuBlockFactory.initSudokuBlock();
        System.out.printf("%b%n", correct.isValid());
        SudokuBlock invalid = SudokuBlockFactory.initSudokuBlockTwo();
        System.out.printf("%b%n", invalid.isValid());
    }
}
