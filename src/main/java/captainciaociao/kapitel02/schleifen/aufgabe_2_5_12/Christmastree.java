package captainciaociao.kapitel02.schleifen.aufgabe_2_5_12;

public class Christmastree {
    private int width;
    private String[][] tree = new String[(int) ((width + 1) / 2)][];

    public int getWidth() {
        return width;
    }

    public Christmastree(int width) {
        this.width = width;
    }
}
