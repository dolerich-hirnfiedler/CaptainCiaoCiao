package captainciaociao.kapitel_04._4_zweidimensionale_arrays.aufgabe_1;

import java.util.HashSet;
import java.util.Set;

public class SudokuBlock {
    private int[][] array = new int[3][3];

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public boolean isValid() {
        Set<Integer> numbers = new HashSet<Integer>();
        for (int i = 1; i < 10; i++) {
            numbers.add(i);
        }
        Set<Integer> block = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                block.add(array[i][j]);
            }
        }
        return numbers.size() == block.size();
    }

    public SudokuBlock(int[][] array) {
        this.array = array;
    }
}
