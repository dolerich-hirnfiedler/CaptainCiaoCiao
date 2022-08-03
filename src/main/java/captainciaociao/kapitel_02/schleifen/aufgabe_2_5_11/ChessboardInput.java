package captainciaociao.kapitel_02.schleifen.aufgabe_2_5_11;

import java.util.Scanner;

public class ChessboardInput {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getInt() {
        String input = "";
        while (true) {
            System.out.printf("Please enter a number: ");
            input = SCANNER.next();
            if (input.matches("[0-9]+")) {
                return Integer.parseInt(input);
            } else {
                System.out.printf("Invalid Input please try again...%n");
            }
        }
    }
}
