package captainciaociao.kapitel02.variablenunddatentypen.aufgabe2_3_4;

public class CoinMachine {

    public static void computeOutput(Money input) {
        int tmp = input.getAmountInCents();
        System.out.printf("%d x 2€%n", (int) tmp / 200);
        tmp %= 200;
        System.out.printf("%d x 1€%n", (int) tmp / 100);
        tmp %= 100;
        System.out.printf("%d x 50 Cent%n", (int) tmp / 50);
        tmp %= 50;
        System.out.printf("%d x 20 Cent%n", (int) tmp / 20);
        tmp %= 20;
        System.out.printf("%d x 10 Cent%n", (int) tmp / 10);
        tmp %= 10;
        System.out.printf("%d x 5 Cent%n", (int) tmp / 5);
        tmp %= 5;
        System.out.printf("%d x 2 Cent%n", (int) tmp / 2);
        tmp %= 2;
        System.out.printf("%d x 1 Cent%n", (int) tmp / 1);
        tmp %= 1;
    }
}
