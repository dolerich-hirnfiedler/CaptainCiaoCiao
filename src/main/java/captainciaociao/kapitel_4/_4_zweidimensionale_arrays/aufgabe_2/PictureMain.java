package captainciaociao.kapitel_4._4_zweidimensionale_arrays.aufgabe_2;

public class PictureMain {
    public static void main(String[] args) {
        Picture pic = new Picture();
        int[][] data = { { 1, 2, 3 }, { 4, 5, 6 } };
        pic.setPic(data);
        int[][] magnifiedData = pic.magnify(data, 2);
        PictureTools.printTwoDimArray(data);
        PictureTools.printTwoDimArray(magnifiedData);

    }
}
