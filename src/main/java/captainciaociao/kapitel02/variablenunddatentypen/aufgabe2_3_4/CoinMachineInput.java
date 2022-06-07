package captainciaociao.kapitel02.variablenunddatentypen.aufgabe2_3_4;

import java.util.Scanner;

public class CoinMachineInput {
    private static Scanner SCANNER = new Scanner(System.in);

    public static int getAmount() {
        String input = "";
        while (true) {
            System.out.printf("Please enter new Amount of Money: ");
            input = SCANNER.next();
            if (input.matches("([0-9]+)(.|,)([0-9]+)")) {
                input=input.replace(",",".");
                return (int) (Float.parseFloat(input) * 100);
            }
            System.out.printf("Invalid input please try again ");
        }
    }
}
