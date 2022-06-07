package captainciaociao.kapitel02.variablenunddatentypen.aufgabe2_3_5;

import org.junit.jupiter.api.Test;

public class RumBottlesTest {
    @Test
    public static void main(String[] args) {
        int amountOfBottles = 5;
        if (amountOfBottles == 1)
            System.out.printf(" %d bottle of rum%n", amountOfBottles);
        else
            System.out.printf(" %d bottles of rum%n", amountOfBottles);
    }

}
