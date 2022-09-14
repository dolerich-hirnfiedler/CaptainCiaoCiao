package captainciaociao.kapitel_12._1;

import java.util.Random;

public class Rounder {
    private static final Random RANDOM = new Random();

    private static RoundingMode randomReturn() {
        RoundingMode returnValue = RoundingMode.UNKNOWN;
        switch (RANDOM.nextInt(3)) {
            case 0:
                returnValue = RoundingMode.CAST;
            case 1:
                returnValue = RoundingMode.FLOOR;
            case 2:
                returnValue = RoundingMode.ROUND;
            case 3:
                returnValue = RoundingMode.RINT;
        }
        return returnValue;

    }

    public static RoundingMode detectRoundingMode(int sum, double... numbers) {
        double numbersSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbersSum += numbers[i];
        }
        if (numbersSum >= 0) {
            if (numbersSum - (int) numbersSum >= 0 && numbersSum - (int) numbersSum <= 0.5) {

            } else {

            }
        } else {

        }
        return RoundingMode.UNKNOWN;
    }

    public static void main(String[] args) {

    }
}
