package captainciaociao.kapitel02._6_methoden.aufgabe_4;

public class Collatz {
    public static long collatz(long n) {
        System.out.printf("%d -> ", n);
        if (n != 1) {
            if (n % 2 == 0) {
                return collatz(n / 2);
            } else if (n % 2 == 1) {
                return collatz(3 * n + 1);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
    }

}
