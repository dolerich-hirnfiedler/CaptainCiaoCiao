package captainciaociao.kapitel_10._2_comperator_comparable.aufgabe_6;

import java.awt.Point;
import java.util.Arrays;
import java.util.Comparator;

public class ClosestPoint {
    public static void main(String[] args) {
        Point[] points = { new Point(9, 3), new Point(3, 4), new Point(4, 3), new Point(1, 2) };
        Arrays.sort(points, new PointDistanceToZeroComparator());
        System.out.println(Arrays.toString(points));
    }

    private static class PointDistanceToZeroComparator implements Comparator<Point> {

        @Override
        public int compare(Point o1, Point o2) {
            return Integer.compare((int) o1.distance(new Point(0, 0)), (int) o2.distance(new Point(0, 0)));
        }
    }
}
