package captainciaociao.kapitel_02.schleifen.aufgabe_2_5_12;

public class ChristmastreeMain {
    public static void main(String[] args) {
        int width = ChristmastreeInput.getWidth();
        Christmastree tree = new Christmastree(width);
        tree.printTree();
    }
}
