package captainciaociao.kapitel_4._2_eindimensionale_arrays.aufgabe_5;

import java.awt.*;

public class Main {
    static double minDistance(Point[] points, int size) throws NullPointerException {
        double min = points[0].distance(0, 0);
        for (int i = 0; i < size; i++) {
            if (points[i].distance(0, 0) <= min)
                min = points[i].distance(0, 0);
        }
        return min;

    }

    static double minDistance(Point[] points) {
        return minDistance(points, points.length);
    }

    public static void main(String[] args) {
        Point[] points = { new Point(10, 20), new Point(12, 2), new Point(44, 4) };
        System.out.printf("shortest distance: %f%n", minDistance(points));
        System.out.printf("Test Value: %f%n", Math.sqrt((12 * 12) + (2 * 2)));
    }
}
