package captainciaociao.kapitel_2.variablenunddatentypen.aufgabe2_3_2;

import java.util.Scanner;

public class HeistInput {
    private static Scanner SCANNER = new Scanner(System.in);

    private static boolean isInputValid(String input) {
        return input.matches("[0-9]+");
    }

    public static int getAmmountBottles() {
        String amount = "";
        do {
            System.out.printf("How many Bottles where looted? %n");
            amount = SCANNER.next();
        } while (!isInputValid(amount));
        return Integer.parseInt(amount);
    }

    public static int getAmmountCrewmembers() {
        String amount = "";
        do {
            System.out.printf("How many Members has the Crew?");
            amount = SCANNER.next();
        } while (!isInputValid(amount));
        return Integer.parseInt(amount);
    }
}
