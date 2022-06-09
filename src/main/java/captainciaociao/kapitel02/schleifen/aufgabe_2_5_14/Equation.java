package captainciaociao.kapitel02.schleifen.aufgabe_2_5_14;

/**
 * Das ist die Musterlösung. Die Aufgabe ist ziemlich dumm, da es unendlich
 * viele unterschiedliche Lösungen gibt.
 *
 */
public class Equation {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            for (int o = 0; o < 10; o++) {
                for (int l = 0; l < 10; l++) {
                    for (int t = 0; t < 10; t++) {
                        int xol = 100 * x + 10 * o + l;
                        int lxx = 100 * l + 10 * x + x;
                        int tlt = 100 * t + 10 * l + t;

                        if ((xol + lxx) == tlt) {
                            if (x != o && x != l && x != t && o != l && o != t && l != t)
                                System.out.printf("Alle Variablen unterschiedlich: ");
                            System.out.printf("x=%d o=%d l=%d t=%d%n", x, o, l, t);
                        }
                    }
                }
            }

        }
    }
}
