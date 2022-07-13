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
    }
}
