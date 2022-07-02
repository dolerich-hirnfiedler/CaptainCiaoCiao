package captainciaociao.kapitel_2.schleifen.aufgabe_2_5_12;

import java.util.Random;

public class Christmastree {
    private static final Random RANDOM = new Random();
    private String[][] tree;

    public Christmastree(int width) {
        this.tree = new String[(int) ((width + 1) / 2)][];
        fillTree();
    }

    private void fillTree() {
        for (int i = 0; i < this.tree.length; i++) {
            this.tree[i] = new String[this.tree.length + i];
            for (int j = 0; j < this.tree[i].length; j++) {
                if (j >= this.tree.length - i - 1) {
                    this.tree[i][j] = getRandomTreeChar();

                } else {
                    this.tree[i][j] = " ";

                }
            }
        }
    }

    private String getRandomTreeChar() {
        int randomNumber = RANDOM.nextInt(100);
        if (randomNumber < 30) {
            return "0";
        } else {
            return "*";
        }
    }

    public void printTree() {
        for (int i = 0; i < this.tree.length; i++) {
            for (int j = 0; j < this.tree[i].length; j++) {
                System.out.printf("%s", this.tree[i][j]);
            }
            System.out.printf("%n");
        }
    }
}
