package captainciaociao.kapitel_02.variablenunddatentypen.aufgabe2_3_3;

import java.rmi.NoSuchObjectException;
import java.util.Scanner;

public class AnkerDominoInput {
    private static Scanner SCANNER = new Scanner(System.in);

    private static boolean isbetweenZeroAndNine(String input) {
        return input.matches("[0-9]");
    }

    public static Value getValue(int inputInteger) throws NoSuchObjectException {
        switch (inputInteger) {
        case 0:
            return Value.ZERO;
        case 1:
            return Value.ONE;
        case 2:
            return Value.TWO;
        case 3:
            return Value.THREE;
        case 4:
            return Value.FOUR;
        case 5:
            return Value.FIFE;
        case 6:
            return Value.SIX;
        case 7:
            return Value.SEVEN;
        case 8:
            return Value.EIGHT;
        case 9:
            return Value.NINE;
        default:
            throw new NoSuchObjectException("No such Value");
        }
    }

    static String getInput() {
        String input = "";
        do {
            System.out.printf("Pleas enter the Value of the Field: ");
            input = SCANNER.next();
        } while (!isbetweenZeroAndNine(input));

        return input;
    }

}
