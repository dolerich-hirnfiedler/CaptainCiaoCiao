package captainciaociao.kapitel_02._6_methoden.aufgabe_3;

public class RightTriangle {
    private static boolean isRightTriangleHelper(double x, double y, double z) {
        return x * x == (y * y + z * z);
    }

    public static boolean isRightTriangle(double x, double y, double z) {
        return isRightTriangleHelper(x, y, z) || isRightTriangleHelper(y, z, x) || isRightTriangle(z, x, y);
    }
}
