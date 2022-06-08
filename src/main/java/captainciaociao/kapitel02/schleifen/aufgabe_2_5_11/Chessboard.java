package captainciaociao.kapitel02.schleifen.aufgabe_2_5_11;

public class Chessboard {

    private int width;
    private int height;

    // Constructors
    public Chessboard(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Chessboard() {
        this.width = 0;
        this.height = 0;
    }

    // Getter and Setter
    public int getWidth() {
        return width;
    }

    private void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    public void printToConsole() {
        for (int i = 1; i < this.height; i++) {
            for (int j = 1; j < this.width; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.printf("_ ");
                } else {
                    System.out.printf("# ");
                }
            }
            System.out.printf("%n");
        }
    }
}
