package captainciaociao.kapitel_3._1_objekte_erzeugen.aufgabe_1;

import java.awt.*;

public class BermudaTriangle {
    public static void main(String[] args) {
        Polygon bermudaTriangle = new Polygon();
        bermudaTriangle.addPoint(3, 5);
        bermudaTriangle.addPoint(14, 45);
        bermudaTriangle.addPoint(40, 9);
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.print(bermudaTriangle.contains(j, i) ? "\uD83D\uDC19" : "\uD83C\uDF08");
            }
            System.out.println();
        }
    }

}
