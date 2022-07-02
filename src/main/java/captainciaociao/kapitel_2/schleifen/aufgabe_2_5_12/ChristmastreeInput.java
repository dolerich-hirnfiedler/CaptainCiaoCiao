package captainciaociao.kapitel_2.schleifen.aufgabe_2_5_12;

import java.util.Scanner;

public class ChristmastreeInput {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getWidth() {
        System.out.printf("Enter width: ");
        String input = SCANNER.next();
        if (input.matches("[0-9]+")) {
            return Integer.parseInt(input);
        } else {
            System.out.printf("Invalid input...%n please try again%n");
            return getWidth();
        }
    }
}
