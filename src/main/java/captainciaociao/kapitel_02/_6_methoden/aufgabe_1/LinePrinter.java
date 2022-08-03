package captainciaociao.kapitel_02._6_methoden.aufgabe_1;

public class LinePrinter {
    public static void line() {
        System.out.println("♥".repeat(10));
    }

    public static void line(int len) {
        System.out.println("-".repeat(len));

    }

    public static void line(int len, char c) {
        System.out.println("c".repeat(len));

    }

    public static void line(String prefix, int len, char c, String suffix) {
        System.out.printf("%s%s%s%n", prefix, "c".repeat(len), suffix);
    }
}
