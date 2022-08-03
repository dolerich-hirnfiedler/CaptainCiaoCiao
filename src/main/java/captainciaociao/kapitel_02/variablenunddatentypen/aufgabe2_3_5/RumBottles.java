package captainciaociao.kapitel_02.variablenunddatentypen.aufgabe2_3_5;

import java.util.Scanner;

public class RumBottles {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Enter Number of Bottles: ");
    int amountOfBottles = scanner.nextInt();
    if (amountOfBottles == 1)
      System.out.printf(" %d bottle of rum%n", amountOfBottles);
    else
      System.out.printf(" %d bottles of rum%n", amountOfBottles);
    scanner.close();
  }
}
