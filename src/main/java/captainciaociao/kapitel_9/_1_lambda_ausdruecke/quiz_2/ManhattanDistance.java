package captainciaociao.kapitel_9._1_lambda_ausdruecke.quiz_2;

import captainciaociao.kapitel_9._1_lambda_ausdruecke.quiz_1.Distance;

public class ManhattanDistance implements Distance {

    @Override
    public int distance(int a, int b) {
        return a + b;
    }

}

class Schmegeggy {
    static void printDistance(Distance distance, int a, int b) {
        System.out.printf("%d%n", distance.distance(a, b));
    }

    public static void main(String[] args) {
        printDistance(new ManhattanDistance(), 12, 33);

        // funktionale alternativen
        System.out.printf("Variante 1: %n");
        printDistance((a, b) -> a + b, 12, 33);

        System.out.printf("Variante 2: %n");
        printDistance((a, b) -> {
            return a + b;
        }, 12, 33);

        System.out.printf("Variante 3: %n");
        printDistance((int a, int b) -> a + b, 12, 33);
    }

}
