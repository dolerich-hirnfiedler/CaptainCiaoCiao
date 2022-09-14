package captainciaociao.kapitel_12._1;

public class MathTableHelper {
    public static void main(String[] args) {

        double d;
        double[] values = {-2.5, -1.9, -1.6, -1.5, -1.1, 1.1, 1.5, 1.6, 1.9, 2.5};
        for (int i = 0; i < values.length; i++) {
            d = values[i];
            System.out.printf("| %f| %d| %d| %d| %d| %d| %n", d, (int) d, (int) Math.floor(d),
                    (int) Math.ceil(d), Math.round(d), (int) Math.rint(d));
        }

    }
}
