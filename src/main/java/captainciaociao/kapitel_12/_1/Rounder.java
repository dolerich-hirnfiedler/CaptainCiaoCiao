package captainciaociao.kapitel_12._1;


public class Rounder {

    private static RoundingMode detectRoundingMOde(int rounded, double number) {
        return rounded == (int) number ? RoundingMode.CAST
                : rounded == (int) Math.floor(number) ? RoundingMode.FLOOR
                        : rounded == (int) Math.ceil(number) ? RoundingMode.CEIL
                                : rounded == (int) Math.round(number) ? RoundingMode.ROUND
                                        : rounded == (int) Math.rint(number) ? RoundingMode.RINT
                                                : RoundingMode.UNKNOWN;
    }

    public static RoundingMode detectRoundingMode(int sum, double... numbers) {
        double realSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            realSum += numbers[i];
        }
        return detectRoundingMOde(sum, realSum);
    }

    public static void main(String[] args) {

    }
}
