package captainciaociao.kapitel_04._4_zweidimensionale_arrays.aufgabe_2;

public class PictureTools {
    public static void printTwoDimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.printf("%n");
        }
    }
}
